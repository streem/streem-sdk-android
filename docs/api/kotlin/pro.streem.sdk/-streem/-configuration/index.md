---
title: Streem.Configuration - 
---

[pro.streem.sdk](../../index.html) / [Streem](../index.html) / [Configuration](./index.html)

# Configuration

`data class Configuration`

### Parameters

`application` - the calling application

`appId` - application's ID provided by Streem.

### Types

| [Builder](-builder/index.html) | `class Builder` |

### Constructors

| [&lt;init&gt;](-init-.html) | `Configuration(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, appSecret: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`? = null, environment: `[`Streem.Environment`](../-environment/index.html)`? = null, errorListener: ((`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)?)`<br>`Configuration(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, appSecret: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`? = null, environment: `[`Streem.Environment`](../-environment/index.html)`? = null)` |

### Properties

| [appId](app-id.html) | `val appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)<br>application's ID provided by Streem. |
| [application](application.html) | `val application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)<br>the calling application |
| [appSecret](app-secret.html) | `val appSecret: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`?` |
| [environment](environment.html) | `val environment: `[`Streem.Environment`](../-environment/index.html)`?` |
| [globalErrorListener](global-error-listener.html) | `var ~~globalErrorListener~~: ((`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)?` |

### Companion Object Functions

| [builder](builder.html) | `fun builder(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`): `[`Streem.Configuration.Builder`](-builder/index.html) |

