---
title: checkSupport - 
---

[pro.streem.sdk](index.html) / [checkSupport](./check-support.html)

# checkSupport

`fun `[`Streem`](-streem/index.html)`.checkSupport(vararg feature: `[`Streem.Feature`](-streem/-feature/index.html)`, resultCallback: (`[`Streem.FeatureSupportResult`](-streem/-feature-support-result/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Checks if the requested [feature](check-support.html#pro.streem.sdk$checkSupport(pro.streem.sdk.Streem, kotlin.Array((pro.streem.sdk.Streem.Feature)), kotlin.Function1((pro.streem.sdk.Streem.FeatureSupportResult, kotlin.Unit)))/feature)s are supported on this device. Calls [resultCallback](check-support.html#pro.streem.sdk$checkSupport(pro.streem.sdk.Streem, kotlin.Array((pro.streem.sdk.Streem.Feature)), kotlin.Function1((pro.streem.sdk.Streem.FeatureSupportResult, kotlin.Unit)))/resultCallback)
asynchronously with the result.

The callback will be called on the Android main thread.

