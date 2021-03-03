---
title: Streem.startStreemActivityForInvitation - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [startStreemActivityForInvitation](./start-streem-activity-for-invitation.html)

# startStreemActivityForInvitation

`@MainThread abstract fun ~~startStreemActivityForInvitation~~(invitationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, currentActivity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)
**Deprecated:** As of v1.1.0, please use new login(invitationCode, isExpert, resultCallback) and use returned invitation to call new startStreemActivity(currentActivity, invitation, localParticipantSessionConfig, errorCallback)

Opens or joins a room with the current invitation in a new full-screen Activity.

### Parameters

`invitationCode` - the invitation code to use

`currentActivity` - this Activity's `onActivityResult` method will be called with the
room's exit code.

`localParticipantSessionConfig` - the SessionConfig of the local user

**Deprecated**
As of v1.1.0, please use { @link #login(invitationCode, isExpert, resultCallback) } and use the returned `resultCallback.LoggedIn` returned invitation to call { @link #startStreemActivity(currentActivity, invitation, localParticipantSessionConfig, errorCallback) }

`@MainThread abstract fun ~~startStreemActivityForInvitation~~(invitationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, currentFragment: Fragment, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)
**Deprecated:** As of v1.1.0, please use new login(invitationCode, isExpert, resultCallback) and use returned invitation to call new startStreemActivity(currentFragment, invitation, localParticipantSessionConfig, errorCallback)

Opens or joins a room with an invitation code in a new full-screen Activity.

### Parameters

`invitationCode` - the invitation code to use

`currentFragment` - this Fragment's `onActivityResult` method will be called with the
room's exit code.

`localParticipantSessionConfig` - the SessionConfig of the local user

**Deprecated**
As of v1.1.0, please use { @link #login(invitationCode, isExpert, resultCallback) } and use the returned `resultCallback.LoggedIn` returned invitation to call { @link #startStreemActivity(currentFragment, invitation, localParticipantSessionConfig, errorCallback) }

