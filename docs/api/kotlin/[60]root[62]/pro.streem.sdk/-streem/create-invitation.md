---
title: createInvitation -
---
//[<root>](../../../index.md)/[pro.streem.sdk](../index.md)/[Streem](index.md)/[createInvitation](create-invitation.md)



# createInvitation  
[androidJvm]  
Content  
abstract fun [createInvitation](create-invitation.md)(toUserName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), referenceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, phone: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, invitationType: [Streem.InvitationType](-invitation-type/index.md), resultCallback: ([Streem.CreateInvitationResult](-create-invitation-result/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Creates an invitation to streem, and returns invitation information for display to the user.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/createInvitation/#kotlin.String#kotlin.String?#kotlin.String?#pro.streem.sdk.Streem.InvitationType#kotlin.Function1[pro.streem.sdk.Streem.CreateInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>toUserName| <a name="pro.streem.sdk/Streem/createInvitation/#kotlin.String#kotlin.String?#kotlin.String?#pro.streem.sdk.Streem.InvitationType#kotlin.Function1[pro.streem.sdk.Streem.CreateInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>the full name of the user that is being invited to streem.<br><br>|
| <a name="pro.streem.sdk/Streem/createInvitation/#kotlin.String#kotlin.String?#kotlin.String?#pro.streem.sdk.Streem.InvitationType#kotlin.Function1[pro.streem.sdk.Streem.CreateInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>referenceId| <a name="pro.streem.sdk/Streem/createInvitation/#kotlin.String#kotlin.String?#kotlin.String?#pro.streem.sdk.Streem.InvitationType#kotlin.Function1[pro.streem.sdk.Streem.CreateInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>a referenceId for the invitation (optional).<br><br>|
| <a name="pro.streem.sdk/Streem/createInvitation/#kotlin.String#kotlin.String?#kotlin.String?#pro.streem.sdk.Streem.InvitationType#kotlin.Function1[pro.streem.sdk.Streem.CreateInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>phone| <a name="pro.streem.sdk/Streem/createInvitation/#kotlin.String#kotlin.String?#kotlin.String?#pro.streem.sdk.Streem.InvitationType#kotlin.Function1[pro.streem.sdk.Streem.CreateInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>the user's phone number (optional). [phone](create-invitation.md) must start with a country code (+1 in the US, for instance). If a phone number is provided, the invitation is sent to the phone number via SMS. If no phone number is provided, the invitation code and url available to the [resultCallback](create-invitation.md) function parameter in [StreemInvitation](-streem-invitation/index.md) must be delivered to the user via other means.<br><br>|
| <a name="pro.streem.sdk/Streem/createInvitation/#kotlin.String#kotlin.String?#kotlin.String?#pro.streem.sdk.Streem.InvitationType#kotlin.Function1[pro.streem.sdk.Streem.CreateInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>invitationType| <a name="pro.streem.sdk/Streem/createInvitation/#kotlin.String#kotlin.String?#kotlin.String?#pro.streem.sdk.Streem.InvitationType#kotlin.Function1[pro.streem.sdk.Streem.CreateInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>the delivery mechanism for the invitation. If [InvitationType.PHONE](-invitation-type/-p-h-o-n-e/index.md), then [phone](create-invitation.md) must be provided.<br><br>|
| <a name="pro.streem.sdk/Streem/createInvitation/#kotlin.String#kotlin.String?#kotlin.String?#pro.streem.sdk.Streem.InvitationType#kotlin.Function1[pro.streem.sdk.Streem.CreateInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a>resultCallback| <a name="pro.streem.sdk/Streem/createInvitation/#kotlin.String#kotlin.String?#kotlin.String?#pro.streem.sdk.Streem.InvitationType#kotlin.Function1[pro.streem.sdk.Streem.CreateInvitationResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>a function that is called with the [CreateInvitationResult](-create-invitation-result/index.md).<br><br>|
  
  



