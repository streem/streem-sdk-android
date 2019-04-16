---
title: Streem.checkSupport - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [checkSupport](./check-support.html)

# checkSupport

`abstract fun checkSupport(resultCallback: `[`Consumer`](https://developer.android.com/reference/android/support/v4/util/Consumer.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg feature: `[`Streem.Feature`](-feature/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Checks if the requested [feature](check-support.html#pro.streem.sdk.Streem$checkSupport(android.support.v4.util.Consumer((kotlin.Boolean)), kotlin.Array((pro.streem.sdk.Streem.Feature)))/feature)s are supported on this device. Calls [resultCallback](check-support.html#pro.streem.sdk.Streem$checkSupport(android.support.v4.util.Consumer((kotlin.Boolean)), kotlin.Array((pro.streem.sdk.Streem.Feature)))/resultCallback)
asynchronously with the result.

The callback will be called on the same thread that [checkSupport](./check-support.html) was called from if that
thread is a [android.os.HandlerThread](https://developer.android.com/reference/android/os/HandlerThread.html), or on the main thread otherwise.

