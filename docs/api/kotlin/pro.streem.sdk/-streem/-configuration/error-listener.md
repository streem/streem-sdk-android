---
title: Streem.Configuration.errorListener - 
---

[pro.streem.sdk](../../index.html) / [Streem](../index.html) / [Configuration](index.html) / [errorListener](./error-listener.html)

# errorListener

`val errorListener: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

callback that will be called if an error is encountered by the
Streem SDK (at any point in the future, not only during initialization). The callback
will be called on the Android main thread.

