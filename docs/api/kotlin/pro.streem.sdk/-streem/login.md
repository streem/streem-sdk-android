---
title: Streem.login - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [login](./login.html)

# login

`abstract fun login(userProfile: `[`Streem.UserProfile`](-user-profile/index.html)`, resultCallback: ((`[`Streem.LoginCompletionResult`](-login-completion-result/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Logs in the current user to the Streem SDK. New users are automatically provisioned on
first use. Existing users will have their profile information updated to match [userProfile](login.html#pro.streem.sdk.Streem$login(pro.streem.sdk.Streem.UserProfile, kotlin.Function1((pro.streem.sdk.Streem.LoginCompletionResult, kotlin.Unit)))/userProfile).

### Parameters

`userProfile` - the user profile to log in

`resultCallback` - a function that is called with the [LoginCompletionResult](-login-completion-result/index.html)`abstract fun login(invitationCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, isExpert: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, resultCallback: (`[`Streem.LoginInvitationResult`](-login-invitation-result/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Logs in the user invited via the invitation code and passes back invitation details
(the inviter's name, company, avatar image URL, etc.) through [resultCallback](login.html#pro.streem.sdk.Streem$login(kotlin.String, kotlin.Boolean, kotlin.Function1((pro.streem.sdk.Streem.LoginInvitationResult, kotlin.Unit)))/resultCallback).
This can be used to show the invited user a lobby or waiting room screen with info
about the person that invited them, before actually starting a streem. Call
[startStreemActivity](start-streem-activity.html) to start the streem after displaying the lobby or waiting
room, passing in the [StreemInvitation](-streem-invitation/index.html) received in [resultCallback](login.html#pro.streem.sdk.Streem$login(kotlin.String, kotlin.Boolean, kotlin.Function1((pro.streem.sdk.Streem.LoginInvitationResult, kotlin.Unit)))/resultCallback).

See also [showInvitationDialog](show-invitation-dialog.html), which instead uses a default lobby dialog provided
by the Streem SDK.

### Parameters

`invitationCode` - the invitation code of the invited user's invitation.

`isExpert` - whether the invited user is an expert.

`resultCallback` - a function that is called with a [LoginInvitationResult](-login-invitation-result/index.html)