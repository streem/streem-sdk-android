---
title: login
---
//[<root>](../../../index.html)/[pro.streem.sdk](../index.html)/[Streem](index.html)/[login](login.html)



# login



[androidJvm]\
abstract fun [login](login.html)(userProfile: [Streem.UserProfile](-user-profile/index.html), resultCallback: ([Streem.LoginCompletionResult](-login-completion-result/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)



Logs in the current user to the Streem SDK. New users are automatically provisioned on first use. Existing users will have their profile information updated to match [userProfile](login.html).



## Parameters


androidJvm

| | |
|---|---|
| userProfile | the user profile to log in |
| resultCallback | a function that is called with the [LoginCompletionResult](-login-completion-result/index.html) |





[androidJvm]\
abstract fun [login](login.html)(invitationUri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), isExpert: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), resultCallback: ([Streem.LoginInvitationResult](-login-invitation-result/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))



Logs in the user invited via the invitation Uri and passes back invitation details (the inviter's name, company, avatar image URL, etc.) through [resultCallback](login.html). With the [StreemInvitation](-streem-invitation/index.html) received in [resultCallback](login.html), launch the Streem experience using [StartStreemFromInvitation](../-start-streem-from-invitation/index.html).



## Parameters


androidJvm

| | |
|---|---|
| invitationUri | the invitation Uri |
| isExpert | whether the invited user is an expert. |
| resultCallback | a function that is called with a [LoginInvitationResult](-login-invitation-result/index.html) |





[androidJvm]\
abstract fun [login](login.html)(invitationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isExpert: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), resultCallback: ([Streem.LoginInvitationResult](-login-invitation-result/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))



Logs in the user invited via the invitation code and passes back invitation details (the inviter's name, company, avatar image URL, etc.) through [resultCallback](login.html). With the [StreemInvitation](-streem-invitation/index.html) received in [resultCallback](login.html), launch the Streem experience using [StartStreemFromInvitation](../-start-streem-from-invitation/index.html).



## Parameters


androidJvm

| | |
|---|---|
| invitationCode | the invitation code of the invited user's invitation. |
| isExpert | whether the invited user is an expert. |
| resultCallback | a function that is called with a [LoginInvitationResult](-login-invitation-result/index.html) |




