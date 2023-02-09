---
title: Companion
---
//[<root>](../../../../index.html)/[pro.streem.sdk](../../index.html)/[Streem](../index.html)/[Companion](index.html)



# Companion



[androidJvm]\
object [Companion](index.html)



## Functions


| Name | Summary |
|---|---|
| [get](get.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [get](get.html)(): [Streem](../index.html)<br>Returns the shared [Streem](../index.html) instance. [Streem.initialize](initialize.html)*MUST* have been called before calling this method. |
| [initialize](initialize.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [initialize](initialize.html)(configuration: [Streem.Configuration](../-configuration/index.html)): [Streem](../index.html)<br>Initializes the Streem SDK. Should be called in the Application's `onCreate` method. |
| [shutdown](shutdown.html) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [shutdown](shutdown.html)()<br>Shuts down the Streem SDK. |


## Properties


| Name | Summary |
|---|---|
| [EXIT_CODE_CALL_REJECTED](-e-x-i-t_-c-o-d-e_-c-a-l-l_-r-e-j-e-c-t-e-d.html) | [androidJvm]<br>const val [EXIT_CODE_CALL_REJECTED](-e-x-i-t_-c-o-d-e_-c-a-l-l_-r-e-j-e-c-t-e-d.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The call did not connect because it was rejected by the remote user. |
| [EXIT_CODE_ERROR](-e-x-i-t_-c-o-d-e_-e-r-r-o-r.html) | [androidJvm]<br>const val [EXIT_CODE_ERROR](-e-x-i-t_-c-o-d-e_-e-r-r-o-r.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>There was an unexpected error. |
| [EXIT_CODE_EXIT](-e-x-i-t_-c-o-d-e_-e-x-i-t.html) | [androidJvm]<br>const val [EXIT_CODE_EXIT](-e-x-i-t_-c-o-d-e_-e-x-i-t.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The user exited the Streem experience using the &quot;Exit&quot; button. |
| [EXIT_CODE_HELP](-e-x-i-t_-c-o-d-e_-h-e-l-p.html) | [androidJvm]<br>const val [EXIT_CODE_HELP](-e-x-i-t_-c-o-d-e_-h-e-l-p.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The user exited the Streem experience using the &quot;Help&quot; button. |
| [EXIT_CODE_NOT_ANSWERED](-e-x-i-t_-c-o-d-e_-n-o-t_-a-n-s-w-e-r-e-d.html) | [androidJvm]<br>const val [EXIT_CODE_NOT_ANSWERED](-e-x-i-t_-c-o-d-e_-n-o-t_-a-n-s-w-e-r-e-d.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The call was not answered within the timeout period. |
| [EXTRA_ERROR](-e-x-t-r-a_-e-r-r-o-r.html) | [androidJvm]<br>const val [EXTRA_ERROR](-e-x-t-r-a_-e-r-r-o-r.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A Serialized Throwable that may be returned if there is an error after starting the Streem experience. |
| [EXTRA_EXIT_CODE](-e-x-t-r-a_-e-x-i-t_-c-o-d-e.html) | [androidJvm]<br>const val [EXTRA_EXIT_CODE](-e-x-t-r-a_-e-x-i-t_-c-o-d-e.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Exit code (as a string) from the Streem experience. |
| [EXTRA_JOINED_CALL_TIME](-e-x-t-r-a_-j-o-i-n-e-d_-c-a-l-l_-t-i-m-e.html) | [androidJvm]<br>const val [EXTRA_JOINED_CALL_TIME](-e-x-t-r-a_-j-o-i-n-e-d_-c-a-l-l_-t-i-m-e.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The time that the user taps the Join Now button in the Lobby |

