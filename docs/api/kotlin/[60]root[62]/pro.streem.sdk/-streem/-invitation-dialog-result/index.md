---
title: InvitationDialogResult
---
//[<root>](../../../../index.html)/[pro.streem.sdk](../../index.html)/[Streem](../index.html)/[InvitationDialogResult](index.html)



# InvitationDialogResult



[androidJvm]\
sealed class [InvitationDialogResult](index.html)



## Types


| Name | Summary |
|---|---|
| [Error](-error/index.html) | [androidJvm]<br>data class [Error](-error/index.html)(val error: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) : [Streem.InvitationDialogResult](index.html) |
| [InviteAccepted](-invite-accepted/index.html) | [androidJvm]<br>class [InviteAccepted](-invite-accepted/index.html)(val invitationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Streem.InvitationDialogResult](index.html) |
| [InviteDeclined](-invite-declined/index.html) | [androidJvm]<br>class [InviteDeclined](-invite-declined/index.html)(val invitationCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Streem.InvitationDialogResult](index.html) |


## Inheritors


| Name |
|---|
| [InviteAccepted](-invite-accepted/index.html) |
| [InviteDeclined](-invite-declined/index.html) |
| [Error](-error/index.html) |

