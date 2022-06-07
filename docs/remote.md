&nbsp; &nbsp; &nbsp; &nbsp;
[< User Authentication](authenticating.md)
&nbsp; &nbsp; &nbsp; &nbsp;
[Home](../README.md)

## Remote Streems

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

&nbsp;
&nbsp; &nbsp; &nbsp; &nbsp;
[< User Authentication](authenticating.md)
&nbsp; &nbsp; &nbsp; &nbsp;
[Home](../README.md)
