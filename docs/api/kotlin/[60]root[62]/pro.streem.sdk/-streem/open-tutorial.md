---
title: openTutorial
---
//[<root>](../../../index.html)/[pro.streem.sdk](../index.html)/[Streem](index.html)/[openTutorial](open-tutorial.html)



# openTutorial



[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



abstract fun [openTutorial](open-tutorial.html)(currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), tutorials: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)&gt;, errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)



Opens the provided AR [tutorials](open-tutorial.html) in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters


androidJvm

| | |
|---|---|
| currentActivity | this Activity's onActivityResult method will be called with the tutorial's exit code. |
| errorCallback | a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs. |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



open fun [openTutorial](open-tutorial.html)(currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), vararg tutorial: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html), errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)



Opens the provided AR [tutorial](open-tutorial.html)s in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters


androidJvm

| | |
|---|---|
| currentActivity | this Activity's onActivityResult method will be called with the tutorial's exit code. |
| errorCallback | a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs. |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



open fun [openTutorial](open-tutorial.html)(currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), @[RawRes](https://developer.android.com/reference/kotlin/androidx/annotation/RawRes.html)vararg resourceId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)



Opens the AR tutorials from the provided raw [resourceId](open-tutorial.html)s in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters


androidJvm

| | |
|---|---|
| currentActivity | this Activity's onActivityResult method will be called with the tutorial's exit code. |
| errorCallback | a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs. |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



abstract fun [openTutorial](open-tutorial.html)(currentFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html), tutorials: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)&gt;, errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?)



Opens the provided AR [tutorials](open-tutorial.html) in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters


androidJvm

| | |
|---|---|
| currentFragment | this Fragment's onActivityResult method will be called with the tutorial's exit code. |
| errorCallback | a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs. |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



open fun [openTutorial](open-tutorial.html)(currentFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html), vararg tutorial: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html), errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?)



Opens the provided AR [tutorial](open-tutorial.html)s in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters


androidJvm

| | |
|---|---|
| currentFragment | this Fragment's onActivityResult method will be called with the tutorial's exit code. |
| errorCallback | a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs. |





[androidJvm]\




@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)



open fun [openTutorial](open-tutorial.html)(currentFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html), @[RawRes](https://developer.android.com/reference/kotlin/androidx/annotation/RawRes.html)vararg resourceId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?)



Opens the AR tutorials from the provided raw [resourceId](open-tutorial.html)s in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters


androidJvm

| | |
|---|---|
| currentFragment | this Fragment's onActivityResult method will be called with the tutorial's exit code. |
| errorCallback | a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs. |




