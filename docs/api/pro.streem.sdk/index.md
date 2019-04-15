[pro.streem.sdk](./index.md)

## Package pro.streem.sdk

### Types

| Name | Summary |
|---|---|
| [Streem](-streem/index.md) | `abstract class Streem` |
| [StreemRoomActivity](-streem-room-activity/index.md) | `class StreemRoomActivity : FragmentActivity` |

### Functions

| Name | Summary |
|---|---|
| [checkSupport](check-support.md) | `fun `[`Streem`](-streem/index.md)`.checkSupport(vararg feature: `[`Streem.Feature`](-streem/-feature/index.md)`, resultCallback: (`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the requested [feature](check-support.md#pro.streem.sdk$checkSupport(pro.streem.sdk.Streem, kotlin.Array((pro.streem.sdk.Streem.Feature)), kotlin.Function1((kotlin.Boolean, kotlin.Unit)))/feature)s are supported on this device. Calls [resultCallback](check-support.md#pro.streem.sdk$checkSupport(pro.streem.sdk.Streem, kotlin.Array((pro.streem.sdk.Streem.Feature)), kotlin.Function1((kotlin.Boolean, kotlin.Unit)))/resultCallback) asynchronously with the result. |

### Companion Object Functions

| Name | Summary |
|---|---|
| [initialize](initialize.md) | `fun Streem.Companion.initialize(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, errorListener: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Streem`](-streem/index.md)<br>Initializes the Streem SDK. Should be called in the Application's `onCreate` method.`fun Streem.Companion.initialize(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, appSecret: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, errorListener: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Streem`](-streem/index.md)<br>Initializes the Streem SDK with an optional [appSecret](initialize.md#pro.streem.sdk$initialize(pro.streem.sdk.Streem.Companion, android.app.Application, kotlin.CharSequence, kotlin.CharSequence, kotlin.Function1((kotlin.Throwable, kotlin.Unit)))/appSecret). Check the SDK documentation for when this overload of `initialize` is needed. |
