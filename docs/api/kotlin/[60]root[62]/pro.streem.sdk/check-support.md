---
title: checkSupport -
---
//[<root>](../../index.md)/[pro.streem.sdk](index.md)/[checkSupport](check-support.md)



# checkSupport  
[androidJvm]  
Content  
fun [Streem](-streem/index.md).[checkSupport](check-support.md)(vararg feature: [Streem.Feature](-streem/-feature/index.md), resultCallback: ([Streem.FeatureSupportResult](-streem/-feature-support-result/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Checks if the requested [feature](check-support.md)s are supported on this device. Calls [resultCallback](check-support.md) asynchronously with the result.



The callback will be called on the Android main thread.

  



