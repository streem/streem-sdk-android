---
title: Streem.startStreemActivity - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [startStreemActivity](./start-streem-activity.html)

# startStreemActivity

`@MainThread abstract fun ~~startStreemActivity~~(currentActivity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`, remoteParticipant: `[`Streem.ParticipantRequest`](-participant-request/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)
**Deprecated:** As of v1.1.0, please use new method with errorCallback

Opens a room with the participants in a new full-screen Activity.

### Parameters

`currentActivity` - this Activity's `onActivityResult` method will be called with the
room's exit code.

`remoteParticipant` - the remote participant to invite to the room.

**Deprecated**
As of v1.1.0, replace with { @link #startStreemActivity(currentActivity, localParticipantSessionConfig, remoteParticipant, errorCallback) }

`@MainThread abstract fun startStreemActivity(currentActivity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`, remoteParticipant: `[`Streem.ParticipantRequest`](-participant-request/index.html)`? = null, errorCallback: ((`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens a room with the participants in a new full-screen Activity.

### Parameters

`currentActivity` - this Activity's `onActivityResult` method will be called with the
room's exit code.

`localParticipantSessionConfig` - the SessionConfig of the local user.

`remoteParticipant` - the remote participant to invite to the room.

`errorCallback` - a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.`@MainThread abstract fun ~~startStreemActivity~~(currentFragment: Fragment, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`, remoteParticipant: `[`Streem.ParticipantRequest`](-participant-request/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)
**Deprecated:** As of v1.1.0, please use new method with errorCallback

Opens a room with the participants in a new full-screen Activity.

### Parameters

`currentFragment` - this Fragment's `onActivityResult` method will be called with the
room's exit code.

`remoteParticipant` - the remote participant to invite to the room.

**Deprecated**
As of v1.1.0, replace with { @link #startStreemActivity(currentFragment, localParticipantSessionConfig, remoteParticipant, errorCallback) }

`@MainThread abstract fun startStreemActivity(currentFragment: Fragment, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`, remoteParticipant: `[`Streem.ParticipantRequest`](-participant-request/index.html)`? = null, errorCallback: ((`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens a room with the participants in a new full-screen Activity.

### Parameters

`currentFragment` - this Fragment's `onActivityResult` method will be called with the
room's exit code.

`localParticipantSessionConfig` - the SessionConfig of the local user.

`remoteParticipant` - the remote participant to invite to the room.

`errorCallback` - a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.`@MainThread abstract fun startStreemActivity(currentActivity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`, invitation: `[`Streem.StreemInvitation`](-streem-invitation/index.html)`, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`, errorCallback: ((`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens or joins a room with the current invitation in a new full-screen Activity.

### Parameters

`invitation` - the invitation to use.

`currentActivity` - this Activity's `onActivityResult` method will be called with the
room's exit code.

`localParticipantSessionConfig` - the SessionConfig of the local user.

`errorCallback` - a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.`@MainThread abstract fun startStreemActivity(currentFragment: Fragment, invitation: `[`Streem.StreemInvitation`](-streem-invitation/index.html)`, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`, errorCallback: ((`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens or joins a room with an invitation code in a new full-screen Activity.

### Parameters

`invitation` - the invitation to use

`currentFragment` - this Fragment's `onActivityResult` method will be called with the
room's exit code.

`localParticipantSessionConfig` - the SessionConfig of the local user

`errorCallback` - a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.