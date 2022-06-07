&nbsp; &nbsp; &nbsp; &nbsp;
[< Integrating Streem SDK](integrating.md)
&nbsp; &nbsp; &nbsp; &nbsp;
[Home](../README.md)
&nbsp; &nbsp; &nbsp; &nbsp;
[Starting a Remote Streem >](remote.md)

## Logging In

The next step is to login your user by calling `Streem.login` with an invitation code or a Streem token.

### Logging in by Invitation Code

Here Streem uses the `invitationCode` or `invitationUri` to look up your user's information and identify them and calls back with a `LoginInvitationResult` object.

If login is successful, the result will be of type `Streem.LoginInvitationResult.LoggedIn` and will contain a StreemInvitation. This StreemInvitation contains information about the sender of the invitation and will be used when starting a remote Streem (see below).

If there is an error during login, it will be returned as one of the `Streem.LoginInvitationResult.Error` types (shown below).

Java, login with invitation code:

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

Kotlin, login with invitation code:

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

### Logging in with a Streem Token

If you are embedding the Streem SDK inside an app that already implements user authentication, then along with your normal authentication flow your server will use one of our Server Side SDK's to obtain a Streem Token.

Then, you can login using `Streem.User.withSdkToken(sdkToken)` as in the examples below.

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

If using Streem Token login, you should also provide a `TokenRefresher` to your `Streem.Configuration` when [initializing Streem in your application class](integrating.md#initialization).

```kotlin
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val tokenRefresher = object : TokenRefresher {
            override fun refreshToken(): RefreshedSdkToken {
                // synchronously retrieve your Streem Token, refreshToken() is called on a background thread
                val sdkToken = SdkTokenManager.getSdkTokenSynchronous(this@SampleAppApplication)

                return if (sdkToken == null) {
                    // If getting an sdk token is not possible because the user is not logged
                    // or because of an error, return a RefreshedSdkToken.Error
                    Log.d(TAG, "token not refreshed")
                    StreemAuthManager.isLoggedIn = false
                    RefreshedSdkToken.Error
                } else {
                    // If the Streem Token is refreshed, return the token wrapped in a RefreshedSdkToken.Token
                    Log.d(TAG, "token refreshed")
                    StreemAuthManager.isLoggedIn = true
                    RefreshedSdkToken.Token(sdkToken)
                }
            }
        }

        val configuration = Streem.Configuration(
            application = this,
            appId = MY_APP_ID,
            environment = Streem.Environment.PROD_US,
            tokenRefresher = tokenRefresher
        )
        Streem.initialize(configuration)
    }

    companion object {
        private val TAG = MyApplication::class.java.simpleName
        private const val MY_APP_ID = "APP_ID"
    }
}
```

&nbsp;
&nbsp; &nbsp; &nbsp; &nbsp;
[< Integrating Streem SDK](integrating.md)
&nbsp; &nbsp; &nbsp; &nbsp;
[Home](../README.md)
&nbsp; &nbsp; &nbsp; &nbsp;
[Starting a Remote Streem >](remote.md)
