# streem-sdk-android

Documentation and examples for using the Streem SDK on Android.

## App ID

-   Provide your Android app `package` for any apps you are going to use the Streem SDK in (later you will be able to do this from a self-service portal)
-   Streem will provide you with an `appId` for each of your Android apps

#### Note About Android App Links

If you want to use Android App Links in your app you will have to tell Streem when you provide your Android app `package`. You will also need to provide the SHA-256 fingerprint of your app's signing certificate. Streem will then update Streem's Digital Asset Links JSON file to handle your app. You will then need to add a few `https` schemes with hosts of `<companyCode>.swac.prod-us.streem.cloud`, `<companyCode>.cv.prod-us.streem.cloud`, `<companyCode>.streem.me`, and `<companyCode>.streem.us` to your app manifest. Details on how to do this can be found at https://developer.android.com/training/app-links/deep-linking. You should also review the information here for more about Android App Links: https://developer.android.com/training/app-links/verify-site-associations#request-verify. Once Streem lets you know that the Digital Asset Link JSON file has been updated, you are ready to start using Android App Links.

## Installation

Add Streem's Maven repository to your project `build.gradle` file:

```gradle
repositories {
    ...
    maven { url "https://maven.streem.com/" }
    jcenter()
    ...
}
```

Add `streem-sdk` to your dependencies in your module `build.gradle` file:

```gradle
dependencies {
    ...
    implementation "pro.streem:streem-sdk:0.18.0"
    ...
}
```

Check your module `build.gradle` file to make sure your app is configured for Java 8 (see https://developer.android.com/studio/write/java8-support for more details):

```gradle
android {
    ...
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}
```

You will also want to add the following packagingOptions to your module `build.gradle` file:

```gradle
android {
    ...
    packagingOptions {
        exclude 'META-INF/DEPENDENCIES'
        pickFirst 'META-INF/kotlinx-serialization-runtime.kotlin_module'
    }
```

## Using the SDK in Your Code

### Initialization

Initialize the SDK by calling `Streem.initialize` with a Streem Configuration. This should be done in your `Application.onCreate` method. In order to initialize your Streem Configuration you will need an App Id provided to you by Streem:

Java:

```java
public class MyApplication extends Application {
    private static final String TAG = MyApplication.class.getSimpleName();
    private static final String MY_APP_ID = "APP_ID";

    @Override
    public void onCreate() {
        super.onCreate();

        final Streem.Configuration configuration = Streem.Configuration.builder(
            this,
            MY_APP_ID)
        .environment(Streem.Environment.PROD_US)
        .build();
        Streem.initialize(configuration);
    }
}
```

Kotlin:

```kotlin
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val configuration = Streem.Configuration(
            application = this,
            appId = MY_APP_ID,
            environment = Streem.Environment.PROD_US
        )
        Streem.initialize(configuration)
    }

    companion object {
        private val TAG = MyApplication::class.java.simpleName
        private const val MY_APP_ID = "APP_ID"
    }
}
```

### Permissions

There are a few required permissions that must be allowed for Streem to work as expected. At the moment, those are `Camera` and `Audio`. To get a list of required permissions you can call `getRequiredPermissions`

Java:

```java
    Streem.get().getRequiredPermissions();
```

Kotlin:

```kotlin
    Streem.get().getRequiredPermissions()
```

You can also input your application's `context` to `getMissingPermissions` and it will return only the permissions that you are missing in order for Streem to work as expected.

Java:

```java
    Streem.get().getMissingPermissions(context);
```

Kotlin:

```kotlin
    Streem.get().getMissingPermissions(context);
```

### Logging In

The next step is to login your user by calling `Streem.login` with an invitation code or a Streem token.

#### Logging in by Invitation Code

Here Streem uses the `invitationCode` or `invitationUri` to look up your user's information and identify them and calls back with a `LoginInvitationResult` object.

If login is successful, the result will be of type `Streem.LoginInvitationResult.LoggedIn` and will contain a StreemInvitation. This StreemInvitation contains information about the sender of the invitation and will be used when starting a remote Streem (see below).

If there is an error during login, it will be returned as one of the `Streem.LoginInvitationResult.Error` types (shown below).

Java:

```java
Streem.get().login("yourInviteCode", false, result -> {
    if (result instanceof Streem.LoginInvitationResult.LoggedIn) {
        // you can use the StreemInvitation returned here to start the Streem experience and enter the lobby (see below)
        Log.i(TAG, String.format("Received invitation from: %s", ((Streem.LoginInvitationResult.LoggedIn) result).getInvitation().getFromName()));
    } else if (result instanceof Streem.LoginInvitationResult.Error) {
        switch (result) {
            case Streem.LoginInvitationResult.Error.InvitationConsumed:
                TODO("Show error for an InvitationConsumed error. This will occur when the given invitation has already been used.")
                break;
            case Streem.LoginInvitationResult.Error.InvitationInvalid:
                TODO("Show error for an InvitationInvalid error. This will occur when the given invitation is invalid.")
                break;
            case Streem.LoginInvitationResult.Error.ClientVersionTooOld:
                TODO("Show error for ClientVersionTooOld. This will occur when the version of Streem that your user is on is no longer supported.")
                break;
            case Streem.LoginInvitationResult.Error.UnexpectedError:
            default:
                TODO("Show error for UnexpectedError.")
                break;
        }
    }
    return Unit.INSTANCE;
});
```

Or, using invitationUri:

```java
if (Streem.get().parseUri(uri) instanceof Streem.LinkType.Invitation) {
    Streem.get().login(uri, false, result -> {
        if (result instanceof Streem.LoginInvitationResult.LoggedIn) {
            // you can use the StreemInvitation returned here to start the Streem experience and enter the lobby (see below)
            Log.i(TAG, String.format("Received invitation from: %s", ((Streem.LoginInvitationResult.LoggedIn) result).getInvitation().getFromName()));
        } else if (result instanceof Streem.LoginInvitationResult.Error) {
            switch (result) {
                case Streem.LoginInvitationResult.Error.InvitationConsumed:
                    TODO("Show error for an InvitationConsumed error. This will occur when the given invitation has already been used.")
                    break;
                case Streem.LoginInvitationResult.Error.InvitationInvalid:
                    TODO("Show error for an InvitationInvalid error. This will occur when the given invitation is invalid.")
                    break;
                case Streem.LoginInvitationResult.Error.ClientVersionTooOld:
                    TODO("Show error for ClientVersionTooOld. This will occur when the version of Streem that your user is on is no longer supported.")
                    break;
                case Streem.LoginInvitationResult.Error.UnexpectedError:
                default:
                    TODO("Show error for UnexpectedError.")
                    break;
            }
        }
        return Unit.INSTANCE;
    });
}
```

Kotlin:

```kotlin
Streem.get().login(
    invitationCode = "yourInviteCode",
    isExpert = false) { result ->
        when (result) {
            is Streem.LoginInvitationResult.LoggedIn -> {
                /* you can use the StreemInvitation returned here to start the Streem experience and enter the lobby (see below) */
                Log.i(TAG, "Received invitation from: ${result.invitation.fromName}")
            }
            is Streem.LoginInvitationResult.Error.InvitationConsumed -> TODO("Show error for an InvitationConsumed error. This will occur when the given invitation has already been used.")
            is Streem.LoginInvitationResult.Error.InvitationInvalid -> TODO("Show error for an InvitationInvalid error. This will occur when the given invitation is invalid.")
            is Streem.LoginInvitationResult.Error.ClientVersionTooOld -> TODO("Show error for ClientVersionTooOld. This will occur when the version of Streem that your user is on is no longer supported.")
            is Streem.LoginInvitationResult.Error.UnexpectedError -> TODO("Show error for UnexpectedError.")
        }
    }
```

Or, using invitationUri:

```kotlin
if (Streem.get().parseUri(uri) is Streem.LinkType.Invitation) {
    Streem.get().login(
        invitationUri = uri,
        isExpert = false
    ) { result ->
        when (result) {
            is Streem.LoginInvitationResult.LoggedIn -> {
                /* you can use the StreemInvitation returned here to start the Streem experience and enter the lobby (see below) */
                Log.i(TAG, "Received invitation from: ${result.invitation.fromName}")
            }
            is Streem.LoginInvitationResult.Error.InvitationConsumed -> TODO("Show error for an InvitationConsumed error. This will occur when the given invitation has already been used.")
            is Streem.LoginInvitationResult.Error.InvitationInvalid -> TODO("Show error for an InvitationInvalid error. This will occur when the given invitation is invalid.")
            is Streem.LoginInvitationResult.Error.ClientVersionTooOld -> TODO("Show error for ClientVersionTooOld. This will occur when the version of Streem that your user is on is no longer supported.")
            is Streem.LoginInvitationResult.Error.UnexpectedError -> TODO("Show error for UnexpectedError.")
        }
    }
}
```

#### Logging in with a Streem Token

If you are embedding the Streem SDK inside an app that already implements user authentication, then along with your normal authentication flow your server will use one of our Server Side SDK's to obtain a Streem Token.

Then, you can login using Streem.User.withSdkToken(sdkToken) as in the examples below.

If login is successful, the result will be of type `Streem.LoginCompletionResult.LoggedIn`.

If there is an error during login, it will be returned as one of the `Streem.LoginCompletionResult.Error` types (shown below).

Java:

```java
Streem.get().login(Streem.UserProfile.builder(Streem.User.withSdkToken(sdkToken), false).build(), result -> {
    if (result instanceof Streem.LoginCompletionResult.LoggedIn) {
        Log.i(TAG, "Login successful");
    } else if (result instanceof Streem.LoginCompletionResult.Error.ClientVersionTooOld) {
        TODO("Show error for ClientVersionTooOld. This will occur when the version of Streem that your user is on is no longer supported.");
    } else {
        Throwable error = ((Streem.LoginCompletionResult.Error.UnexpectedError) result).getError();
        TODO("Show error for UnexpectedError.");
    }
    return Unit.INSTANCE;
    });
```

Kotlin:

```kotlin
Streem.get()
    .login(Streem.UserProfile(Streem.User.withSdkToken(sdkToken), false)) { result ->
        when (result) {
            is LoginCompletionResult.LoggedIn -> {
                Log.i(TAG, "Login successful")
            }
            is LoginCompletionResult.Error.ClientVersionTooOld -> {
                TODO("Show error for ClientVersionTooOld. This will occur when the version of Streem that your user is on is no longer supported.")
            }
            is LoginCompletionResult.Error.UnexpectedError -> {
                val error = result.error
                TODO("Show error for UnexpectedError.")
            }
        }
    }
```

### Remote Streems

Starting a Streem involves 3 things:

1. Creating the `ActivityResultLauncher` and registering your Activity or Fragment for Activity results
2. The `StreemInvitation` object returned from your call to `login`.
3. Launching the `ActivityResultLauncher` using the `StreemInvitation` mentioned in the previous step

For more information on the Activity Result APIs used here and how you can receive Activity results in classes other than an Activity or Fragment, read the [Android Developers documentation](https://developer.android.com/training/basics/intents/result).

First, declare your `ActivityResultLauncher` as a member variable within your Activity or Fragment. The result of launching the Activity will be returned via the callback registered here.

Java:

```java
    ActivityResultLauncher<StartStreemFromInvitationRequest> startStreem = registerForActivityResult(new StartStreemFromInvitation(),
            callResult -> {
                if (callResult instanceof StartStreemFromInvitationResult.Completed) {
                    // the call finished without error.
                } else if (callResult instanceof StartStreemFromInvitationResult.Error.InvitationDeclined) {
                    TODO("Show error for an InvitationDeclined error. This error indicates that the user tapped the close button or backed out of the lobby without starting the call.")
                } else if (callResult instanceof StartStreemFromInvitationResult.Error.ClientVersionTooOld) {
                    TODO("Show error for ClientVersionTooOld. This will occur when the version of Streem that your user is on is no longer supported.")
                } else if (callResult instanceof StartStreemFromInvitationResult.Error.UnexpectedError) {
                    TODO("Show error for UnexpectedError.")
                }
            });
```

Kotlin:

```kotlin
    private val startStreem = registerForActivityResult(StartStreemFromInvitation()) { callResult ->
        when (callResult) {
            is StartStreemFromInvitationResult.Completed -> {
                // the call finished without error
            }
            is StartStreemFromInvitationResult.Error.InvitationDeclined -> TODO("Show error for an InvitationDeclined error. This error indicates that the user tapped the close button or backed out of the lobby without starting the call.")
            is StartStreemFromInvitationResult.Error.ClientVersionTooOld -> TODO("Show error for ClientVersionTooOld. This will occur when the version of Streem that your user is on is no longer supported.")
            is StartStreemFromInvitationResult.Error.UnexpectedError -> TODO("Show error for UnexpectedError.")
        }
    }
```

Then, use the Activity launcher that was registered earlier to launch the Streem experience and enter the lobby. `launch()` will launch a new Activity and should only be called once.

Java:

```java
    startStreem.launch(new StartStreemFromInvitationRequest(invitation));
```

Kotlin:

```kotlin
    startStreem.launch(StartStreemFromInvitationRequest(invitation))
```

## Further Documentation

-   [Java API docs](https://streem.github.io/streem-sdk-android/api/java/)
-   [Kotlin API docs](https://streem.github.io/streem-sdk-android/api/kotlin/)
