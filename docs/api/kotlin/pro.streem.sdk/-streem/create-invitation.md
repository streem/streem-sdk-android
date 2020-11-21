---
title: Streem.createInvitation - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [createInvitation](./create-invitation.html)

# createInvitation

`abstract fun createInvitation(toUserName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, referenceId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, phone: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, invitationType: `[`Streem.InvitationType`](-invitation-type/index.html)`, invitationHandler: (`[`Streem.StreemInvitation`](-streem-invitation/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, errorHandler: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Creates an invitation to streem, and returns invitation information for display to the user.

### Parameters

`toUserName` - the full name of the user that is being invited to streem.

`referenceId` - a referenceId for the invitation (optional).

`phone` - the user's phone number (optional). [phone](create-invitation.html#pro.streem.sdk.Streem$createInvitation(kotlin.String, kotlin.String, kotlin.String, pro.streem.sdk.Streem.InvitationType, kotlin.Function1((pro.streem.sdk.Streem.StreemInvitation, kotlin.Unit)), kotlin.Function1((kotlin.Throwable, kotlin.Unit)))/phone) must start with a country code
(+1 in the US, for instance). If a phone number is provided, the invitation is sent to the
phone number via SMS. If no phone number is provided, the invitation code and url available
to the [invitationHandler](create-invitation.html#pro.streem.sdk.Streem$createInvitation(kotlin.String, kotlin.String, kotlin.String, pro.streem.sdk.Streem.InvitationType, kotlin.Function1((pro.streem.sdk.Streem.StreemInvitation, kotlin.Unit)), kotlin.Function1((kotlin.Throwable, kotlin.Unit)))/invitationHandler) function parameter in [StreemInvitation](-streem-invitation/index.html) must be delivered to the
user via other means.

`invitationType` - the delivery mechanism for the invitation. If [InvitationType.PHONE](-invitation-type/-p-h-o-n-e.html),
then [phone](create-invitation.html#pro.streem.sdk.Streem$createInvitation(kotlin.String, kotlin.String, kotlin.String, pro.streem.sdk.Streem.InvitationType, kotlin.Function1((pro.streem.sdk.Streem.StreemInvitation, kotlin.Unit)), kotlin.Function1((kotlin.Throwable, kotlin.Unit)))/phone) must be provided.

`invitationHandler` - a function that is called with a [StreemInvitation](-streem-invitation/index.html) when successful.

`errorHandler` - a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error
occurs.