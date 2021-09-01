---
title: startStreemActivity -
---
//[<root>](../../../index.md)/[pro.streem.sdk](../index.md)/[Streem](index.md)/[startStreemActivity](start-streem-activity.md)



# startStreemActivity  
[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
~~abstract~~ ~~fun~~ [~~startStreemActivity~~](start-streem-activity.md)~~(~~~~currentActivity~~~~:~~ [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html)~~,~~ ~~localParticipantSessionConfig~~~~:~~ [Streem.SessionConfig](-session-config/index.md)~~,~~ ~~remoteParticipant~~~~:~~ [Streem.ParticipantRequest](-participant-request/index.md)? ~~= null~~~~)~~  
More info  


Opens a room with the participants in a new full-screen Activity.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?/PointingToDeclaration/"></a>currentActivity| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?/PointingToDeclaration/"></a><br><br>this Activity's onActivityResult method will be called with the room's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?/PointingToDeclaration/"></a>remoteParticipant| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?/PointingToDeclaration/"></a><br><br>the remote participant to invite to the room.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
abstract fun [startStreemActivity](start-streem-activity.md)(currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), localParticipantSessionConfig: [Streem.SessionConfig](-session-config/index.md), remoteParticipant: [Streem.ParticipantRequest](-participant-request/index.md)? = null, errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)  
More info  


Opens a room with the participants in a new full-screen Activity.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>currentActivity| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Activity's onActivityResult method will be called with the room's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>localParticipantSessionConfig| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the SessionConfig of the local user.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>remoteParticipant| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the remote participant to invite to the room.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>errorCallback| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
~~abstract~~ ~~fun~~ [~~startStreemActivity~~](start-streem-activity.md)~~(~~~~currentFragment~~~~:~~ [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html)~~,~~ ~~localParticipantSessionConfig~~~~:~~ [Streem.SessionConfig](-session-config/index.md)~~,~~ ~~remoteParticipant~~~~:~~ [Streem.ParticipantRequest](-participant-request/index.md)? ~~= null~~~~)~~  
More info  


Opens a room with the participants in a new full-screen Activity.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?/PointingToDeclaration/"></a>currentFragment| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?/PointingToDeclaration/"></a><br><br>this Fragment's onActivityResult method will be called with the room's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?/PointingToDeclaration/"></a>remoteParticipant| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?/PointingToDeclaration/"></a><br><br>the remote participant to invite to the room.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
abstract fun [startStreemActivity](start-streem-activity.md)(currentFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html), localParticipantSessionConfig: [Streem.SessionConfig](-session-config/index.md), remoteParticipant: [Streem.ParticipantRequest](-participant-request/index.md)? = null, errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)  
More info  


Opens a room with the participants in a new full-screen Activity.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>currentFragment| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Fragment's onActivityResult method will be called with the room's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>localParticipantSessionConfig| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the SessionConfig of the local user.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>remoteParticipant| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the remote participant to invite to the room.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>errorCallback| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig#pro.streem.sdk.Streem.ParticipantRequest?#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
~~abstract~~ ~~fun~~ [~~startStreemActivity~~](start-streem-activity.md)~~(~~~~currentActivity~~~~:~~ [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html)~~,~~ ~~invitation~~~~:~~ [Streem.StreemInvitation](-streem-invitation/index.md)~~,~~ ~~localParticipantSessionConfig~~~~:~~ [Streem.SessionConfig](-session-config/index.md)~~,~~ ~~errorCallback~~~~:~~ ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? ~~= null~~~~)~~  
More info  


Opens or joins a room with the current invitation in a new full-screen Activity.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>invitation| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the invitation to use.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>currentActivity| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Activity's onActivityResult method will be called with the room's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>localParticipantSessionConfig| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the SessionConfig of the local user.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>errorCallback| <a name="pro.streem.sdk/Streem/startStreemActivity/#android.app.Activity#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
~~abstract~~ ~~fun~~ [~~startStreemActivity~~](start-streem-activity.md)~~(~~~~currentFragment~~~~:~~ [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html)~~,~~ ~~invitation~~~~:~~ [Streem.StreemInvitation](-streem-invitation/index.md)~~,~~ ~~localParticipantSessionConfig~~~~:~~ [Streem.SessionConfig](-session-config/index.md)~~,~~ ~~errorCallback~~~~:~~ ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? ~~= null~~~~)~~  
More info  


Opens or joins a room with an invitation code in a new full-screen Activity.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>invitation| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the invitation to use<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>currentFragment| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Fragment's onActivityResult method will be called with the room's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>localParticipantSessionConfig| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the SessionConfig of the local user<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>errorCallback| <a name="pro.streem.sdk/Streem/startStreemActivity/#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.StreemInvitation#pro.streem.sdk.Streem.SessionConfig#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.<br><br>|
  
  



