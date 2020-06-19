---
title: Streem.Configuration - 
---

[pro.streem.sdk](../../index.html) / [Streem](../index.html) / [Configuration](./index.html)

# Configuration

`data class Configuration`

### Parameters

`appId` - application's ID provided by Streem.

`errorListener` - callback that will be called if an error is encountered by the
Streem SDK (at any point in the future, not only during initialization). The callback
will be called on the Android main thread.

### Types

| [Builder](-builder/index.html) | `class Builder` |

### Constructors

| [&lt;init&gt;](-init-.html) | `Configuration(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, appSecret: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`? = null, environment: `[`Streem.Environment`](../-environment/index.html)`? = null, errorListener: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Properties

| [appId](app-id.html) | `val appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)<br>application's ID provided by Streem. |
| [application](application.html) | `val application: `[`Application`](https://developer.android.com/reference/android/app/Application.html) |
| [appSecret](app-secret.html) | `val appSecret: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`?` |
| [environment](environment.html) | `val environment: `[`Streem.Environment`](../-environment/index.html)`?` |
| [errorListener](error-listener.html) | `val errorListener: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>callback that will be called if an error is encountered by the Streem SDK (at any point in the future, not only during initialization). The callback will be called on the Android main thread. |

### Companion Object Functions

| [builder](builder.html) | `fun builder(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, errorListener: `[`Consumer`](https://developer.android.com/reference/android/support/v4/util/Consumer.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): `[`Streem.Configuration.Builder`](-builder/index.html) |

