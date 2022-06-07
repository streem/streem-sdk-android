---
title: checkSupport
---
//[<root>](../../../index.html)/[pro.streem.sdk](../index.html)/[Streem](index.html)/[checkSupport](check-support.html)



# checkSupport



[androidJvm]\
abstract fun [checkSupport](check-support.html)(resultCallback: [Consumer](https://developer.android.com/reference/kotlin/androidx/core/util/Consumer.html)&lt;[Streem.FeatureSupportResult](-feature-support-result/index.html)&gt;, vararg feature: [Streem.Feature](-feature/index.html))



Checks if the requested [feature](check-support.html)s are supported on this device. Calls [resultCallback](check-support.html) asynchronously with the result.



The callback will be called on the Android main thread.



## Parameters


androidJvm

| | |
|---|---|
| resultCallback | the callback called with the [FeatureSupportResult](-feature-support-result/index.html) |
| feature | a list of features to check for support |




