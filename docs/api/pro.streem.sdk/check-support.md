[pro.streem.sdk](index.md) / [checkSupport](./check-support.md)

# checkSupport

`fun `[`Streem`](-streem/index.md)`.checkSupport(vararg feature: `[`Streem.Feature`](-streem/-feature/index.md)`, resultCallback: (`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Checks if the requested [feature](check-support.md#pro.streem.sdk$checkSupport(pro.streem.sdk.Streem, kotlin.Array((pro.streem.sdk.Streem.Feature)), kotlin.Function1((kotlin.Boolean, kotlin.Unit)))/feature)s are supported on this device. Calls [resultCallback](check-support.md#pro.streem.sdk$checkSupport(pro.streem.sdk.Streem, kotlin.Array((pro.streem.sdk.Streem.Feature)), kotlin.Function1((kotlin.Boolean, kotlin.Unit)))/resultCallback)
asynchronously with the result.

The callback will be called on the same thread that [checkSupport](./check-support.md) was called from if that
thread is a [HandlerThread](#), or on the main thread otherwise.

