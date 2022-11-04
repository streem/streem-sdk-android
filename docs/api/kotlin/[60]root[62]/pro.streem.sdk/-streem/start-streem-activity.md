---
title: startStreemActivity
---
//[<root>](../../../index.html)/[pro.streem.sdk](../index.html)/[Streem](index.html)/[startStreemActivity](start-streem-activity.html)



# startStreemActivity



[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



~~abstract~~ ~~fun~~ [~~startStreemActivity~~](start-streem-activity.html)~~(~~~~currentActivity~~~~:~~ [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html)~~,~~ ~~localParticipantSessionConfig~~~~:~~ [Streem.SessionConfig](-session-config/index.html)~~,~~ ~~remoteParticipant~~~~:~~ [Streem.ParticipantRequest](-participant-request/index.html)? ~~= null~~~~)~~



Opens a room with the participants in a new full-screen Activity.



## Parameters


androidJvm

| | |
|---|---|
| currentActivity | this Activity's onActivityResult method will be called with the room's exit code. |
| remoteParticipant | the remote participant to invite to the room. |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



abstract fun [startStreemActivity](start-streem-activity.html)(currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), localParticipantSessionConfig: [Streem.SessionConfig](-session-config/index.html), remoteParticipant: [Streem.ParticipantRequest](-participant-request/index.html)? = null, referenceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)



Opens a room with the participants in a new full-screen Activity.



## Parameters


androidJvm

| | |
|---|---|
| currentActivity | this Activity's onActivityResult method will be called with the room's exit code. |
| localParticipantSessionConfig | the SessionConfig of the local user. |
| remoteParticipant | the remote participant to invite to the room. |
| referenceId | the reference ID to use for the room, or null if none. |
| errorCallback | a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs. |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



~~abstract~~ ~~fun~~ [~~startStreemActivity~~](start-streem-activity.html)~~(~~~~currentFragment~~~~:~~ [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html)~~,~~ ~~localParticipantSessionConfig~~~~:~~ [Streem.SessionConfig](-session-config/index.html)~~,~~ ~~remoteParticipant~~~~:~~ [Streem.ParticipantRequest](-participant-request/index.html)? ~~= null~~~~)~~



Opens a room with the participants in a new full-screen Activity.



## Parameters


androidJvm

| | |
|---|---|
| currentFragment | this Fragment's onActivityResult method will be called with the room's exit code. |
| remoteParticipant | the remote participant to invite to the room. |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



abstract fun [startStreemActivity](start-streem-activity.html)(currentFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html), localParticipantSessionConfig: [Streem.SessionConfig](-session-config/index.html), remoteParticipant: [Streem.ParticipantRequest](-participant-request/index.html)? = null, errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)



Opens a room with the participants in a new full-screen Activity.



## Parameters


androidJvm

| | |
|---|---|
| currentFragment | this Fragment's onActivityResult method will be called with the room's exit code. |
| localParticipantSessionConfig | the SessionConfig of the local user. |
| remoteParticipant | the remote participant to invite to the room. |
| errorCallback | a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs. |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



~~abstract~~ ~~fun~~ [~~startStreemActivity~~](start-streem-activity.html)~~(~~~~currentActivity~~~~:~~ [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html)~~,~~ ~~invitation~~~~:~~ [Streem.StreemInvitation](-streem-invitation/index.html)~~,~~ ~~localParticipantSessionConfig~~~~:~~ [Streem.SessionConfig](-session-config/index.html)~~,~~ ~~errorCallback~~~~:~~ ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? ~~= null~~~~)~~



Opens or joins a room with the current invitation in a new full-screen Activity.



## Parameters


androidJvm

| | |
|---|---|
| invitation | the invitation to use. |
| currentActivity | this Activity's onActivityResult method will be called with the room's exit code. |
| localParticipantSessionConfig | the SessionConfig of the local user. |
| errorCallback | a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs. |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



~~abstract~~ ~~fun~~ [~~startStreemActivity~~](start-streem-activity.html)~~(~~~~currentFragment~~~~:~~ [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html)~~,~~ ~~invitation~~~~:~~ [Streem.StreemInvitation](-streem-invitation/index.html)~~,~~ ~~localParticipantSessionConfig~~~~:~~ [Streem.SessionConfig](-session-config/index.html)~~,~~ ~~errorCallback~~~~:~~ ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? ~~= null~~~~)~~



Opens or joins a room with an invitation code in a new full-screen Activity.



## Parameters


androidJvm

| | |
|---|---|
| invitation | the invitation to use |
| currentFragment | this Fragment's onActivityResult method will be called with the room's exit code. |
| localParticipantSessionConfig | the SessionConfig of the local user |
| errorCallback | a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs. |




