---
title: pro.streem.sdk.initialize - 
---

[pro.streem.sdk](index.html) / [initialize](./initialize.html)

# initialize

`fun Streem.Companion.initialize(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, errorListener: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Streem`](-streem/index.html)

Initializes the Streem SDK. Should be called in the Application's `onCreate` method.

### Parameters

`appId` - application's ID provided by Streem.

`errorListener` - callback that will be called if an error is encountered by the
Streem SDK (at any point in the future, not only during initialization). The callback
will be called on the Android main thread.`fun Streem.Companion.initialize(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, appSecret: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, errorListener: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Streem`](-streem/index.html)

Initializes the Streem SDK with an optional [appSecret](initialize.html#pro.streem.sdk$initialize(pro.streem.sdk.Streem.Companion, android.app.Application, kotlin.CharSequence, kotlin.CharSequence, kotlin.Function1((kotlin.Throwable, kotlin.Unit)))/appSecret). Check the SDK documentation for
when this overload of `initialize` is needed.

See [initialize](./initialize.html) for details on the other parameters.

