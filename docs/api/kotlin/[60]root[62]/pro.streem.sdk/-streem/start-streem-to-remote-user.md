---
title: startStreemToRemoteUser
---
//[<root>](../../../index.html)/[pro.streem.sdk](../index.html)/[Streem](index.html)/[startStreemToRemoteUser](start-streem-to-remote-user.html)



# startStreemToRemoteUser



[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



abstract fun [startStreemToRemoteUser](start-streem-to-remote-user.html)(currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), remoteUserId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))



Opens a room with the participants in a new full-screen Activity by way of the lobby.



## Parameters


androidJvm

| | |
|---|---|
| currentActivity | this Activity's onActivityResult method will be called with the room's exit code. |
| remoteUserId | the ID of the remote participant to invite to the room. |




