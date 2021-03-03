---
title: Streem.showInvitationDialog - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [showInvitationDialog](./show-invitation-dialog.html)

# showInvitationDialog

`@MainThread abstract fun showInvitationDialog(streemInvitation: `[`Streem.StreemInvitation`](-streem-invitation/index.html)`, currentActivity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`, resultCallback: ((`[`Streem.InvitationDialogResult`](-invitation-dialog-result/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Presents a lobby/waiting room dialog
with details of the inviting user and company, and a button to proceed with joining the
inviting user in a Streem call. When the user presses the button, it opens or joins a room
with the invitation in a new full-screen Activity.

This is similar to calling [startStreemActivity](start-streem-activity.html). However,
[showInvitationDialog](./show-invitation-dialog.html) uses a built-in dialog and handles user interaction with the
dialog to accept or reject the invitation.

### Parameters

`streemInvitation` - the invited user's invitation.

`currentActivity` - this Activity's `onActivityResult` method will be called with the
room's exit code.

`resultCallback` - an optional function that may be called multiple times with
[InvitationDialogResult](-invitation-dialog-result/index.html)s generated while showing the dialog and starting the Streem call.`@MainThread abstract fun showInvitationDialog(streemInvitation: `[`Streem.StreemInvitation`](-streem-invitation/index.html)`, currentFragment: Fragment, resultCallback: ((`[`Streem.InvitationDialogResult`](-invitation-dialog-result/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Presents a lobby/waiting room dialog
with details of the inviting user and company, and a button to proceed with joining the
inviting user in a Streem call. When the user presses the button, it opens or joins a room
with the invitation in a new full-screen Activity.

This is similar to calling [startStreemActivity](start-streem-activity.html). However,
[showInvitationDialog](./show-invitation-dialog.html) uses a built-in dialog and handles user interaction with the
dialog to accept or reject the invitation.

### Parameters

`streemInvitation` - the invited user's invitation.

`currentFragment` - this Fragment's `onActivityResult` method will be called with the
room's exit code.

`resultCallback` - an optional function that may be called multiple times with
[InvitationDialogResult](-invitation-dialog-result/index.html)s generated while showing the dialog and starting the Streem call.