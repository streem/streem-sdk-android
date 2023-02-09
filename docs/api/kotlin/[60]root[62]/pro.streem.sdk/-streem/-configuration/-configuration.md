---
title: Configuration
---
//[<root>](../../../../index.html)/[pro.streem.sdk](../../index.html)/[Streem](../index.html)/[Configuration](index.html)/[Configuration](-configuration.html)



# Configuration



[androidJvm]\
fun [Configuration](-configuration.html)(application: [Application](https://developer.android.com/reference/kotlin/android/app/Application.html), appId: [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), environment: [Streem.Environment](../-environment/index.html)? = null, tokenRefresher: TokenRefresher? = null)



#### Parameters


androidJvm

| | |
|---|---|
| application | the calling application |
| appId | application's ID provided by Streem. |





[androidJvm]\
fun [~~Configuration~~](-configuration.html)(application: [Application](https://developer.android.com/reference/kotlin/android/app/Application.html), appId: [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), environment: [Streem.Environment](../-environment/index.html)? = null, errorListener: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?)

---

### Deprecated



This constructor is deprecated, please use base constructor



#### Replace with

```kotlin
Configuration(application, appId, appSecret, environment)
```
---



