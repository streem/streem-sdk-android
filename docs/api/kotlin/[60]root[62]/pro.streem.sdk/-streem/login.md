---
title: login -
---
//[<root>](../../../index.md)/[pro.streem.sdk](../index.md)/[Streem](index.md)/[login](login.md)



# login  
[androidJvm]  
Content  
abstract fun [login](login.md)(userProfile: [Streem.UserProfile](-user-profile/index.md), resultCallback: ([Streem.LoginCompletionResult](-login-completion-result/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)  
More info  


Logs in the current user to the Streem SDK. New users are automatically provisioned on first use. Existing users will have their profile information updated to match [userProfile](login.md).



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/login/#pro.streem.sdk.Streem.UserProfile#kotlin.Function1[pro.streem.sdk.Streem.LoginCompletionResult,kotlin.Unit]?/PointingToDeclaration/"></a>userProfile| <a name="pro.streem.sdk/Streem/login/#pro.streem.sdk.Streem.UserProfile#kotlin.Function1[pro.streem.sdk.Streem.LoginCompletionResult,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>the user profile to log in<br><br>|
| <a name="pro.streem.sdk/Streem/login/#pro.streem.sdk.Streem.UserProfile#kotlin.Function1[pro.streem.sdk.Streem.LoginCompletionResult,kotlin.Unit]?/PointingToDeclaration/"></a>resultCallback| <a name="pro.streem.sdk/Streem/login/#pro.streem.sdk.Streem.UserProfile#kotlin.Function1[pro.streem.sdk.Streem.LoginCompletionResult,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with the [LoginCompletionResult](-login-completion-result/index.md)<br><br>|
  
  


[androidJvm]  
Content  
abstract fun [login](login.md)(invitationUri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), isExpert: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), resultCallback: ([Streem.LoginInvitationResult](-login-invitation-result/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Logs in the user invited via the invitation Uri and passes back invitation details (the inviter's name, company, avatar image URL, etc.) through [resultCallback](login.md). With the [StreemInvitation](-streem-invitation/index.md) received in [resultCallback](login.md), launch the Streem experience using [StartStreemFromInvitation](../-start-streem-from-invitation/index.md).



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/login/#android.net.Uri#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>invitationUri| <a name="pro.streem.sdk/Streem/login/#android.net.Uri#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>the invitation Uri<br><br>|
| <a name="pro.streem.sdk/Streem/login/#android.net.Uri#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>isExpert| <a name="pro.streem.sdk/Streem/login/#android.net.Uri#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>whether the invited user is an expert.<br><br>|
| <a name="pro.streem.sdk/Streem/login/#android.net.Uri#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>resultCallback| <a name="pro.streem.sdk/Streem/login/#android.net.Uri#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>a function that is called with a [LoginInvitationResult](-login-invitation-result/index.md)<br><br>|
  
  


[androidJvm]  
Content  
abstract fun [login](login.md)(invitationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isExpert: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), resultCallback: ([Streem.LoginInvitationResult](-login-invitation-result/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Logs in the user invited via the invitation code and passes back invitation details (the inviter's name, company, avatar image URL, etc.) through [resultCallback](login.md). With the [StreemInvitation](-streem-invitation/index.md) received in [resultCallback](login.md), launch the Streem experience using [StartStreemFromInvitation](../-start-streem-from-invitation/index.md).



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/login/#kotlin.String#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>invitationCode| <a name="pro.streem.sdk/Streem/login/#kotlin.String#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>the invitation code of the invited user's invitation.<br><br>|
| <a name="pro.streem.sdk/Streem/login/#kotlin.String#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>isExpert| <a name="pro.streem.sdk/Streem/login/#kotlin.String#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>whether the invited user is an expert.<br><br>|
| <a name="pro.streem.sdk/Streem/login/#kotlin.String#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>resultCallback| <a name="pro.streem.sdk/Streem/login/#kotlin.String#kotlin.Boolean#kotlin.Function1[pro.streem.sdk.Streem.LoginInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>a function that is called with a [LoginInvitationResult](-login-invitation-result/index.md)<br><br>|
  
  



