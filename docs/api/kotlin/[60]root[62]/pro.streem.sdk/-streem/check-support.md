---
title: checkSupport -
---
//[<root>](../../../index.md)/[pro.streem.sdk](../index.md)/[Streem](index.md)/[checkSupport](check-support.md)



# checkSupport  
[androidJvm]  
Content  
abstract fun [checkSupport](check-support.md)(resultCallback: [Consumer](https://developer.android.com/reference/kotlin/androidx/core/util/Consumer.html)<[Streem.FeatureSupportResult](-feature-support-result/index.md)>, vararg feature: [Streem.Feature](-feature/index.md))  
More info  


Checks if the requested [feature](check-support.md)s are supported on this device. Calls [resultCallback](check-support.md) asynchronously with the result.



The callback will be called on the Android main thread.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/checkSupport/#androidx.core.util.Consumer[pro.streem.sdk.Streem.FeatureSupportResult]#kotlin.Array[pro.streem.sdk.Streem.Feature]/PointingToDeclaration/"></a>resultCallback| <a name="pro.streem.sdk/Streem/checkSupport/#androidx.core.util.Consumer[pro.streem.sdk.Streem.FeatureSupportResult]#kotlin.Array[pro.streem.sdk.Streem.Feature]/PointingToDeclaration/"></a><br><br>the callback called with the [FeatureSupportResult](-feature-support-result/index.md)<br><br>|
| <a name="pro.streem.sdk/Streem/checkSupport/#androidx.core.util.Consumer[pro.streem.sdk.Streem.FeatureSupportResult]#kotlin.Array[pro.streem.sdk.Streem.Feature]/PointingToDeclaration/"></a>feature| <a name="pro.streem.sdk/Streem/checkSupport/#androidx.core.util.Consumer[pro.streem.sdk.Streem.FeatureSupportResult]#kotlin.Array[pro.streem.sdk.Streem.Feature]/PointingToDeclaration/"></a><br><br>a list of features to check for support<br><br>|
  
  



