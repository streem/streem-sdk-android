---
title: Streem.startStreemActivityForInvitation - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [startStreemActivityForInvitation](./start-streem-activity-for-invitation.html)

# startStreemActivityForInvitation

`@MainThread abstract fun startStreemActivityForInvitation(invitationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, currentActivity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens or joins a room with the current invitation in a new full-screen Activity.

### Parameters

`invitationCode` - the invitation code to use

`currentActivity` - this Activity's `onActivityResult` method will be called with the
room's exit code.

`localParticipantSessionConfig` - the SessionConfig of the local user`@MainThread abstract fun startStreemActivityForInvitation(invitationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, currentFragment: Fragment, localParticipantSessionConfig: `[`Streem.SessionConfig`](-session-config/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens or joins a room with an invitation code in a new full-screen Activity.

### Parameters

`invitationCode` - the invitation code to use

`currentFragment` - this Fragment's `onActivityResult` method will be called with the
room's exit code.

`localParticipantSessionConfig` - the SessionConfig of the local user