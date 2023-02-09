---
title: pro.streem.sdk
---
//[<root>](../../index.html)/[pro.streem.sdk](index.html)



# Package-level declarations



## Types


| Name | Summary |
|---|---|
| [InternalStreemApi](-internal-streem-api/index.html) | [androidJvm]<br>@[Target](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-target/index.html)(allowedTargets = [[AnnotationTarget.CLASS](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-c-l-a-s-s/index.html), [AnnotationTarget.FUNCTION](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-f-u-n-c-t-i-o-n/index.html)])<br>annotation class [InternalStreemApi](-internal-streem-api/index.html) |
| [LobbyActivity](-lobby-activity/index.html) | [androidJvm]<br>class [LobbyActivity](-lobby-activity/index.html) : [AppCompatActivity](https://developer.android.com/reference/kotlin/androidx/appcompat/app/AppCompatActivity.html), StreemKoinComponent |
| [ProductDetailsCallback](-product-details-callback/index.html) | [androidJvm]<br>class [ProductDetailsCallback](-product-details-callback/index.html)(productDetailsFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html)) |
| [StartStreemFromInvitation](-start-streem-from-invitation/index.html) | [androidJvm]<br>class [StartStreemFromInvitation](-start-streem-from-invitation/index.html) : [ActivityResultContract](https://developer.android.com/reference/kotlin/androidx/activity/result/contract/ActivityResultContract.html)&lt;[StartStreemFromInvitationRequest](-start-streem-from-invitation-request/index.html), [StartStreemFromInvitationResult](-start-streem-from-invitation-result/index.html)&gt; |
| [StartStreemFromInvitationRequest](-start-streem-from-invitation-request/index.html) | [androidJvm]<br>data class [StartStreemFromInvitationRequest](-start-streem-from-invitation-request/index.html)(val invitation: [Streem.StreemInvitation](-streem/-streem-invitation/index.html)) |
| [StartStreemFromInvitationResult](-start-streem-from-invitation-result/index.html) | [androidJvm]<br>sealed class [StartStreemFromInvitationResult](-start-streem-from-invitation-result/index.html) |
| [Streem](-streem/index.html) | [androidJvm]<br>interface [Streem](-streem/index.html) |
| [StreemBeta](-streem-beta/index.html) | [androidJvm]<br>@[Target](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-target/index.html)(allowedTargets = [[AnnotationTarget.CLASS](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-c-l-a-s-s/index.html), [AnnotationTarget.FUNCTION](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-f-u-n-c-t-i-o-n/index.html)])<br>annotation class [StreemBeta](-streem-beta/index.html) |
| [StreemClientVersionTooOldException](-streem-client-version-too-old-exception/index.html) | [androidJvm]<br>class [StreemClientVersionTooOldException](-streem-client-version-too-old-exception/index.html) : [Exception](https://developer.android.com/reference/kotlin/java/lang/Exception.html) |

