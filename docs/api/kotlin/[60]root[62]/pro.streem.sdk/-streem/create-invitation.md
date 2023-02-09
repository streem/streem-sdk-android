---
title: createInvitation
---
//[<root>](../../../index.html)/[pro.streem.sdk](../index.html)/[Streem](index.html)/[createInvitation](create-invitation.html)



# createInvitation



[androidJvm]\
abstract fun [createInvitation](create-invitation.html)(toUserName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), referenceId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, integrationId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, phone: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, invitationType: [Streem.InvitationType](-invitation-type/index.html), resultCallback: ([Streem.CreateInvitationResult](-create-invitation-result/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))



Creates an invitation to streem, and returns invitation information for display to the user.



#### Parameters


androidJvm

| | |
|---|---|
| toUserName | the full name of the user that is being invited to streem. |
| referenceId | a referenceId for the invitation (optional). |
| integrationId | an integrationId for the invitation (optional). |
| phone | the user's phone number (optional). [phone](create-invitation.html) must start with a country code (+1 in the US, for instance). If a phone number is provided, the invitation is sent to the phone number via SMS. If no phone number is provided, the invitation code and url available to the [resultCallback](create-invitation.html) function parameter in [StreemInvitation](-streem-invitation/index.html) must be delivered to the user via other means. |
| invitationType | the delivery mechanism for the invitation. If [InvitationType.PHONE](-invitation-type/-p-h-o-n-e/index.html), then [phone](create-invitation.html) must be provided. |
| resultCallback | a function that is called with the [CreateInvitationResult](-create-invitation-result/index.html). |




