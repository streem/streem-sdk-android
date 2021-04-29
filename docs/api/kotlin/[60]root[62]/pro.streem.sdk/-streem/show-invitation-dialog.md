---
title: showInvitationDialog -
---
//[<root>](../../../index.md)/[pro.streem.sdk](../index.md)/[Streem](index.md)/[showInvitationDialog](show-invitation-dialog.md)



# showInvitationDialog  
[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
abstract fun [showInvitationDialog](show-invitation-dialog.md)(streemInvitation: [Streem.StreemInvitation](-streem-invitation/index.md), currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), resultCallback: ([Streem.InvitationDialogResult](-invitation-dialog-result/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)  
More info  


Presents a lobby/waiting room dialog with details of the inviting user and company, and a button to proceed with joining the inviting user in a Streem call. When the user presses the button, it opens or joins a room with the invitation in a new full-screen Activity.



This is similar to calling [startStreemActivity](start-streem-activity.md). However, [showInvitationDialog](show-invitation-dialog.md) uses a built-in dialog and handles user interaction with the dialog to accept or reject the invitation.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#android.app.Activity#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a>streemInvitation| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#android.app.Activity#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the invited user's invitation.<br><br>|
| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#android.app.Activity#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a>currentActivity| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#android.app.Activity#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Activity's onActivityResult method will be called with the room's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#android.app.Activity#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a>resultCallback| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#android.app.Activity#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>an optional function that may be called multiple times with [InvitationDialogResult](-invitation-dialog-result/index.md)s generated while showing the dialog and starting the Streem call.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
abstract fun [showInvitationDialog](show-invitation-dialog.md)(streemInvitation: [Streem.StreemInvitation](-streem-invitation/index.md), currentFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html), resultCallback: ([Streem.InvitationDialogResult](-invitation-dialog-result/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)  
More info  


Presents a lobby/waiting room dialog with details of the inviting user and company, and a button to proceed with joining the inviting user in a Streem call. When the user presses the button, it opens or joins a room with the invitation in a new full-screen Activity.



This is similar to calling [startStreemActivity](start-streem-activity.md). However, [showInvitationDialog](show-invitation-dialog.md) uses a built-in dialog and handles user interaction with the dialog to accept or reject the invitation.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#androidx.fragment.app.Fragment#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a>streemInvitation| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#androidx.fragment.app.Fragment#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the invited user's invitation.<br><br>|
| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#androidx.fragment.app.Fragment#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a>currentFragment| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#androidx.fragment.app.Fragment#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Fragment's onActivityResult method will be called with the room's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#androidx.fragment.app.Fragment#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a>resultCallback| <a name="pro.streem.sdk/Streem/showInvitationDialog/#pro.streem.sdk.Streem.StreemInvitation#androidx.fragment.app.Fragment#kotlin.Function1[pro.streem.sdk.Streem.InvitationDialogResult,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>an optional function that may be called multiple times with [InvitationDialogResult](-invitation-dialog-result/index.md)s generated while showing the dialog and starting the Streem call.<br><br>|
  
  



