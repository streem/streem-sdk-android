[pro.streem.sdk](../index.md) / [Streem](index.md) / [checkSupport](./check-support.md)

# checkSupport

`abstract fun checkSupport(resultCallback: Consumer<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg feature: `[`Streem.Feature`](-feature/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Checks if the requested [feature](check-support.md#pro.streem.sdk.Streem$checkSupport(android.support.v4.util.Consumer((kotlin.Boolean)), kotlin.Array((pro.streem.sdk.Streem.Feature)))/feature)s are supported on this device. Calls [resultCallback](check-support.md#pro.streem.sdk.Streem$checkSupport(android.support.v4.util.Consumer((kotlin.Boolean)), kotlin.Array((pro.streem.sdk.Streem.Feature)))/resultCallback)
asynchronously with the result.

The callback will be called on the same thread that [checkSupport](./check-support.md) was called from if that
thread is a [HandlerThread](#), or on the main thread otherwise.

