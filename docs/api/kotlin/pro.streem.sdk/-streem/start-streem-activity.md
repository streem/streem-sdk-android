---
title: Streem.startStreemActivity - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [startStreemActivity](./start-streem-activity.html)

# startStreemActivity

`@MainThread abstract fun startStreemActivity(currentActivity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`, remoteParticipant: `[`Streem.ParticipantRequest`](-participant-request/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens a room with the participants in a new full-screen Activity.

### Parameters

`currentActivity` - this Activity's `onActivityResult` method will be called with the
tutorial's exit code.

`remoteParticipant` - the remote participant to invite to the room.`@MainThread abstract fun startStreemActivity(currentFragment: `[`Fragment`](https://developer.android.com/reference/android/support/v4/app/Fragment.html)`, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`, remoteParticipant: `[`Streem.ParticipantRequest`](-participant-request/index.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens a room with the participants in a new full-screen Activity.

### Parameters

`currentFragment` - this Fragment's `onActivityResult` method will be called with the
tutorial's exit code.

`remoteParticipant` - the remote participant to invite to the room.