---
title: startStreemActivityForInvitation -
---
//[<root>](../../../index.md)/[pro.streem.sdk](../index.md)/[Streem](index.md)/[startStreemActivityForInvitation](start-streem-activity-for-invitation.md)



# startStreemActivityForInvitation  
[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
~~abstract~~ ~~fun~~ [~~startStreemActivityForInvitation~~](start-streem-activity-for-invitation.md)~~(~~~~invitationCode~~~~:~~ [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)~~,~~ ~~currentActivity~~~~:~~ [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html)~~,~~ ~~localParticipantSessionConfig~~~~:~~ [Streem.SessionConfig](-session-config/index.md)~~)~~  
More info  


Opens or joins a room with the current invitation in a new full-screen Activity.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#android.app.Activity#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a>invitationCode| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#android.app.Activity#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a><br><br>the invitation code to use<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#android.app.Activity#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a>currentActivity| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#android.app.Activity#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a><br><br>this Activity's onActivityResult method will be called with the room's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#android.app.Activity#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a>localParticipantSessionConfig| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#android.app.Activity#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a><br><br>the SessionConfig of the local user<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
~~abstract~~ ~~fun~~ [~~startStreemActivityForInvitation~~](start-streem-activity-for-invitation.md)~~(~~~~invitationCode~~~~:~~ [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)~~,~~ ~~currentFragment~~~~:~~ [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html)~~,~~ ~~localParticipantSessionConfig~~~~:~~ [Streem.SessionConfig](-session-config/index.md)~~)~~  
More info  


Opens or joins a room with an invitation code in a new full-screen Activity.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a>invitationCode| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a><br><br>the invitation code to use<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a>currentFragment| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a><br><br>this Fragment's onActivityResult method will be called with the room's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a>localParticipantSessionConfig| <a name="pro.streem.sdk/Streem/startStreemActivityForInvitation/#kotlin.String#androidx.fragment.app.Fragment#pro.streem.sdk.Streem.SessionConfig/PointingToDeclaration/"></a><br><br>the SessionConfig of the local user<br><br>|
  
  



