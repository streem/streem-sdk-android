---
title: startStreemActivityForInvitation
---
//[<root>](../../../index.html)/[pro.streem.sdk](../index.html)/[Streem](index.html)/[startStreemActivityForInvitation](start-streem-activity-for-invitation.html)



# startStreemActivityForInvitation



[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



abstract fun [~~startStreemActivityForInvitation~~](start-streem-activity-for-invitation.html)(invitationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), localParticipantSessionConfig: [Streem.SessionConfig](-session-config/index.html))

---

### Deprecated



As of v0.12.0, please use new login(invitationCode, isExpert, resultCallback) and use returned invitation to start Streem with registerForActivityResult(StartStreemFromInvitation())

---


Opens or joins a room with the current invitation in a new full-screen Activity.



#### Parameters


androidJvm

| | |
|---|---|
| invitationCode | the invitation code to use |
| currentActivity | this Activity's `onActivityResult` method will be called with the room's exit code. |
| localParticipantSessionConfig | the SessionConfig of the local user |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



abstract fun [~~startStreemActivityForInvitation~~](start-streem-activity-for-invitation.html)(invitationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), currentFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html), localParticipantSessionConfig: [Streem.SessionConfig](-session-config/index.html))

---

### Deprecated



As of v0.12.0, please use new login(invitationCode, isExpert, resultCallback) and use returned invitation to start Streem with registerForActivityResult(StartStreemFromInvitation())

---


Opens or joins a room with an invitation code in a new full-screen Activity.



#### Parameters


androidJvm

| | |
|---|---|
| invitationCode | the invitation code to use |
| currentFragment | this Fragment's `onActivityResult` method will be called with the room's exit code. |
| localParticipantSessionConfig | the SessionConfig of the local user |




