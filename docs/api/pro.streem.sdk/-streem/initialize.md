[pro.streem.sdk](../index.md) / [Streem](index.md) / [initialize](./initialize.md)

# initialize

`@JvmStatic fun initialize(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, errorListener: Consumer<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): `[`Streem`](index.md)

Initializes the Streem SDK. Should be called in the Application's `onCreate` method.

### Parameters

`appId` - application's ID provided by Streem.

`errorListener` - callback that will be called if an error is encountered by the
Streem SDK (at any point in the future, not only during initialization). The callback
will be called on the Android main thread.`@JvmStatic fun initialize(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, appSecret: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, errorListener: Consumer<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): `[`Streem`](index.md)

Initializes the Streem SDK with an optional [appSecret](initialize.md#pro.streem.sdk.Streem.Companion$initialize(android.app.Application, kotlin.CharSequence, kotlin.CharSequence, android.support.v4.util.Consumer((kotlin.Throwable)))/appSecret). Check the SDK documentation for
when this overload of `initialize` is needed.

See [initialize](./initialize.md) for details on the other parameters.

