# streem-sdk-android

Documentation and examples for using the Streem SDK on Android.

## App ID

-   Provide your Android app `package` for any apps you are going to use the Streem SDK in (later you will be able to do this from a self-service portal)
-   Streem will provide you with an `appId` for each of your Android apps

#### Note About Android App Links

If you want to use Android App Links in your app you will have to tell Streem when you provide your Android app `package`. You will also need to provide the SHA-256 fingerprint of your app's signing certificate. Streem will then update Streem's Digital Asset Links JSON file to handle your app. You will then need to add two `https` schemes with hosts of `<companyCode>.swac.prod-us.streem.cloud` and `<companyCode>.streem.me` to your app manifest. Details on how to do this can be found at https://developer.android.com/training/app-links/deep-linking. You should also review the information here for more about Android App Links: https://developer.android.com/training/app-links/verify-site-associations#request-verify. Once Streem lets you know that the Digital Asset Link JSON file has been updated, you are ready to start using Android App Links.

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
    implementation "pro.streem:streem-sdk:0.11.0"
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

The next step is to login your user by calling `Streem.login` with the invitation code.
Here Streem uses the `invitationCode` to look up your user's information and identify them and calls back with a `LoginInvitationResult` object.

If login is successful, the result will be of type `Streem.LoginInvitationResult.LoggedIn` and will contain a StreemInvitation. This StreemInvitation contains information about the sender of the invitation and can be used to create a lobby screen for your application. This `StreemInvitation` object also will be used when starting a remote Streem (see below).

If there is an error during login, it will be returned as one of the `Streem.LoginInvitationResult.Error` types.

Java:

```java
    Streem.get().login("yourInviteCode", false, result -> {
        if (result instanceof Streem.LoginInvitationResult.LoggedIn) {
            // you can use the StreemInvitation returned here to build a lobby screen and later to call startStreemActivity() (see below)
            Log.i(TAG, String.format("Received invitation from: %s", result.invitation.fromName));
        } else if (result instanceof Streem.LoginInvitationResult.Error) {
            // todo handle errors
        }
        return Unit.INSTANCE;
    });
```

Kotlin:

```kotlin
Streem.get().login(
    invitationCode = "yourInviteCode",
    isExpert = false) { result ->
        when (result) {
            is Streem.LoginInvitationResult.LoggedIn -> {
                /* you can use the StreemInvitation returned here to build a lobby screen and later to call startStreemActivity() (see below)*/
                Log.i(TAG, "Received invitation from: ${result.invitation.fromName}")
            }
            is Streem.LoginInvitationResult.Error.InvitationConsumed -> TODO()
            is Streem.LoginInvitationResult.Error.InvitationInvalid -> TODO()
            is Streem.LoginInvitationResult.Error.UnexpectedError -> TODO()
        }
    }
```

### Remote Streems

Starting a Streem will require a current activity or fragment and the `StreemInvitation` object returned from your call to `login`.

Java:

```java
    final Streem.SessionConfig localSessionConfig = Streem.SessionConfig.LOCAL_CUSTOMER;

    Streem.get().startStreemActivity(
        this,
        streemInvitation,   // this object should be returned from your call to login (see above)
        localSessionConfig,
        error -> {
            //todo Add error handling to your app here
            return Unit.INSTANCE;
         });
```

Kotlin:

```kotlin
    val localSessionConfig = Streem.SessionConfig.LOCAL_CUSTOMER

    Streem.get().startStreemActivity(
        currentActivity = this,
        invitation = streemInvitation,   // this object should be returned from your call to login (see above)
        localParticipantSessionConfig = localSessionConfig
    ) { error ->
        //todo Add error handling to your app here
    }
```

### Streem Exit Codes

There are a few different ways that Streem can exit, including the user pressing the Cancel or Help button, or by finishing a Tutorial in a certain state. You can check the exit code (and kick off a Help Chat experience, for example) by listening for the result from your `Activity` or `Fragment`.

Java:

```java
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK) {
            String exitCode = Streem.get().getExitCode(requestCode, resultCode, data);
            if (Streem.EXIT_CODE_HELP.equals(exitCode)) {
                // Kick off Help experience
            }
        }
    }
```

Kotlin:

```kotlin
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            val exitCode = Streem.get().getExitCode(requestCode, resultCode, data)
            if (Streem.EXIT_CODE_HELP == exitCode) {
                // Kick off Help experience
            }
        }
    }
```

### AR Tutorials

_NOTE: AR Tutorials are a work in progress. If you're interested in using them please contact product@streem.pro_

Check Tutorial support using the `Streem.checkSupport` method.

Java:

```java
    Streem.get().checkSupport((supported -> {
        // Show tutorial button when supported == true
    }), Streem.Feature.TUTORIAL);
```

Kotlin:

```kotlin
    Streem.get().checkSupport(Streem.Feature.TUTORIAL) { supported -> {
        // Show tutorial button when supported == true
    }
```

This checks whether the device has the necessary components to run Tutorials, including ARCore and SceneForm support. If the above check returns `true`, show whatever UI makes sense for your app to indicate AR Tutorial support.

When you are ready to kick off a Tutorial, call `Streem.openTutorial` with the `tutorial` resource you received from Streem, and the current activity or fragment.

Java:

```java
    Streem.get().openTutorial(activityOrFragment, R.raw.tutorial);
```

Kotlin:

```kotlin
    Streem.get().openTutorial(activityOrFragment, R.raw.tutorial);
```

## Further Documentation

-   [Java API docs](https://streem.github.io/streem-sdk-android/api/java/)
-   [Kotlin API docs](https://streem.github.io/streem-sdk-android/api/kotlin/)
