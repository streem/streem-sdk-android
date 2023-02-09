---
title: Configuration
---
//[<root>](../../../../index.html)/[pro.streem.sdk](../../index.html)/[Streem](../index.html)/[Configuration](index.html)



# Configuration



[androidJvm]\
data class [Configuration](index.html)(val application: [Application](https://developer.android.com/reference/kotlin/android/app/Application.html), val appId: [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), val environment: [Streem.Environment](../-environment/index.html)? = null, val tokenRefresher: TokenRefresher? = null)



#### Parameters


androidJvm

| | |
|---|---|
| application | the calling application |
| appId | application's ID provided by Streem. |



## Constructors


| | |
|---|---|
| [Configuration](-configuration.html) | [androidJvm]<br>fun [~~Configuration~~](-configuration.html)(application: [Application](https://developer.android.com/reference/kotlin/android/app/Application.html), appId: [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), environment: [Streem.Environment](../-environment/index.html)? = null, errorListener: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?) |
| [Configuration](-configuration.html) | [androidJvm]<br>fun [Configuration](-configuration.html)(application: [Application](https://developer.android.com/reference/kotlin/android/app/Application.html), appId: [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html), environment: [Streem.Environment](../-environment/index.html)? = null, tokenRefresher: TokenRefresher? = null) |


## Types


| Name | Summary |
|---|---|
| [Builder](-builder/index.html) | [androidJvm]<br>class [Builder](-builder/index.html) |
| [Companion](-companion/index.html) | [androidJvm]<br>object [Companion](-companion/index.html) |


## Properties


| Name | Summary |
|---|---|
| [appId](app-id.html) | [androidJvm]<br>val [appId](app-id.html): [CharSequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html) |
| [application](application.html) | [androidJvm]<br>val [application](application.html): [Application](https://developer.android.com/reference/kotlin/android/app/Application.html) |
| [environment](environment.html) | [androidJvm]<br>val [environment](environment.html): [Streem.Environment](../-environment/index.html)? = null |
| [globalErrorListener](global-error-listener.html) | [androidJvm]<br>var [~~globalErrorListener~~](global-error-listener.html): ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null |
| [tokenRefresher](token-refresher.html) | [androidJvm]<br>val [tokenRefresher](token-refresher.html): TokenRefresher? = null |

