---
title: pro.streem.sdk -
---
//[<root>](../../index.md)/[pro.streem.sdk](index.md)



# Package pro.streem.sdk  


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="pro.streem.sdk/InternalStreemApi///PointingToDeclaration/"></a>[InternalStreemApi](-internal-streem-api/index.md)| <a name="pro.streem.sdk/InternalStreemApi///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@[Target](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-target/index.html)(allowedTargets = [[AnnotationTarget.CLASS](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-c-l-a-s-s/index.html), [AnnotationTarget.FUNCTION](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-f-u-n-c-t-i-o-n/index.html)])  <br>  <br>annotation class [InternalStreemApi](-internal-streem-api/index.md)  <br><br><br>|
| <a name="pro.streem.sdk/LobbyActivity///PointingToDeclaration/"></a>[LobbyActivity](-lobby-activity/index.md)| <a name="pro.streem.sdk/LobbyActivity///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>class [LobbyActivity](-lobby-activity/index.md) : [AppCompatActivity](https://developer.android.com/reference/kotlin/androidx/appcompat/app/AppCompatActivity.html)  <br><br><br>|
| <a name="pro.streem.sdk/StartStreemFromInvitation///PointingToDeclaration/"></a>[StartStreemFromInvitation](-start-streem-from-invitation/index.md)| <a name="pro.streem.sdk/StartStreemFromInvitation///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>class [StartStreemFromInvitation](-start-streem-from-invitation/index.md) : [ActivityResultContract](https://developer.android.com/reference/kotlin/androidx/activity/result/contract/ActivityResultContract.html)<[StartStreemFromInvitationRequest](-start-streem-from-invitation-request/index.md), [StartStreemFromInvitationResult](-start-streem-from-invitation-result/index.md)>   <br><br><br>|
| <a name="pro.streem.sdk/StartStreemFromInvitationRequest///PointingToDeclaration/"></a>[StartStreemFromInvitationRequest](-start-streem-from-invitation-request/index.md)| <a name="pro.streem.sdk/StartStreemFromInvitationRequest///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>data class [StartStreemFromInvitationRequest](-start-streem-from-invitation-request/index.md)(**invitation**: [Streem.StreemInvitation](-streem/-streem-invitation/index.md))  <br><br><br>|
| <a name="pro.streem.sdk/StartStreemFromInvitationResult///PointingToDeclaration/"></a>[StartStreemFromInvitationResult](-start-streem-from-invitation-result/index.md)| <a name="pro.streem.sdk/StartStreemFromInvitationResult///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>sealed class [StartStreemFromInvitationResult](-start-streem-from-invitation-result/index.md)  <br><br><br>|
| <a name="pro.streem.sdk/Streem///PointingToDeclaration/"></a>[Streem](-streem/index.md)| <a name="pro.streem.sdk/Streem///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract class [Streem](-streem/index.md)  <br><br><br>|
| <a name="pro.streem.sdk/StreemBeta///PointingToDeclaration/"></a>[StreemBeta](-streem-beta/index.md)| <a name="pro.streem.sdk/StreemBeta///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@[Target](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-target/index.html)(allowedTargets = [[AnnotationTarget.CLASS](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-c-l-a-s-s/index.html), [AnnotationTarget.FUNCTION](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-f-u-n-c-t-i-o-n/index.html)])  <br>  <br>annotation class [StreemBeta](-streem-beta/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="pro.streem.sdk//checkSupport/pro.streem.sdk.Streem#kotlin.Array[pro.streem.sdk.Streem.Feature]#kotlin.Function1[pro.streem.sdk.Streem.FeatureSupportResult,kotlin.Unit]/PointingToDeclaration/"></a>[checkSupport](check-support.md)| <a name="pro.streem.sdk//checkSupport/pro.streem.sdk.Streem#kotlin.Array[pro.streem.sdk.Streem.Feature]#kotlin.Function1[pro.streem.sdk.Streem.FeatureSupportResult,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [Streem](-streem/index.md).[checkSupport](check-support.md)(vararg feature: [Streem.Feature](-streem/-feature/index.md), resultCallback: ([Streem.FeatureSupportResult](-streem/-feature-support-result/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Checks if the requested [feature](check-support.md)s are supported on this device.  <br><br><br>|

