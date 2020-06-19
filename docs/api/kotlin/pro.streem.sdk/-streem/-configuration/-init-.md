---
title: Streem.Configuration.<init> - 
---

[pro.streem.sdk](../../index.html) / [Streem](../index.html) / [Configuration](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Configuration(application: `[`Application`](https://developer.android.com/reference/android/app/Application.html)`, appId: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, appSecret: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`? = null, environment: `[`Streem.Environment`](../-environment/index.html)`? = null, errorListener: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

### Parameters

`appId` - application's ID provided by Streem.

`errorListener` - callback that will be called if an error is encountered by the
Streem SDK (at any point in the future, not only during initialization). The callback
will be called on the Android main thread.