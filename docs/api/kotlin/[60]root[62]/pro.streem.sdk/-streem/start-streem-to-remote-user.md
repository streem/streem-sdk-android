---
title: startStreemToRemoteUser
---
//[<root>](../../../index.html)/[pro.streem.sdk](../index.html)/[Streem](index.html)/[startStreemToRemoteUser](start-streem-to-remote-user.html)



# startStreemToRemoteUser



[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



abstract fun [startStreemToRemoteUser](start-streem-to-remote-user.html)(currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), remoteUserId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), companyCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), referenceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null)



Opens a room with the participants in a new full-screen Activity by way of the lobby.



## Parameters


androidJvm

| | |
|---|---|
| currentActivity | this Activity's onActivityResult method will be called with the room's exit code. |
| remoteUserId | the ID of the remote participant to invite to the room. |
| companyCode | the company code that the remoteUserId belongs to. |
| referenceId | the reference ID to use for the room, or null if none. |




