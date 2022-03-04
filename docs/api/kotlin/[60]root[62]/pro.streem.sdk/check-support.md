---
title: checkSupport
---
//[<root>](../../index.html)/[pro.streem.sdk](index.html)/[checkSupport](check-support.html)



# checkSupport



[androidJvm]\
fun [Streem](-streem/index.html).[checkSupport](check-support.html)(vararg feature: [Streem.Feature](-streem/-feature/index.html), resultCallback: ([Streem.FeatureSupportResult](-streem/-feature-support-result/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))



Checks if the requested [feature](check-support.html)s are supported on this device. Calls [resultCallback](check-support.html) asynchronously with the result.



The callback will be called on the Android main thread.




