---
title: Streem.openTutorial - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [openTutorial](./open-tutorial.html)

# openTutorial

`@MainThread abstract fun openTutorial(currentActivity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`, tutorials: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens the provided AR [tutorials](open-tutorial.html#pro.streem.sdk.Streem$openTutorial(android.app.Activity, kotlin.collections.List((kotlin.ByteArray)))/tutorials) in a new full-screen Activity. The first tutorial in the
list will be the starting tutorial.

### Parameters

`currentActivity` - this Activity's `onActivityResult` method will be called with the
tutorial's exit code.`@MainThread fun openTutorial(currentActivity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`, vararg tutorial: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens the provided AR [tutorial](open-tutorial.html#pro.streem.sdk.Streem$openTutorial(android.app.Activity, kotlin.Array((kotlin.ByteArray)))/tutorial)s in a new full-screen Activity. The first tutorial in the
list will be the starting tutorial.

### Parameters

`currentActivity` - this Activity's `onActivityResult` method will be called with the
tutorial's exit code.`@MainThread fun openTutorial(currentActivity: `[`Activity`](https://developer.android.com/reference/android/app/Activity.html)`, @RawRes vararg resourceId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens the AR tutorials from the provided raw [resourceId](open-tutorial.html#pro.streem.sdk.Streem$openTutorial(android.app.Activity, kotlin.IntArray)/resourceId)s in a new full-screen Activity. The
first tutorial in the list will be the starting tutorial.

### Parameters

`currentActivity` - this Activity's `onActivityResult` method will be called with the
tutorial's exit code.`@MainThread abstract fun openTutorial(currentFragment: Fragment, tutorials: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens the provided AR [tutorials](open-tutorial.html#pro.streem.sdk.Streem$openTutorial(androidx.fragment.app.Fragment, kotlin.collections.List((kotlin.ByteArray)))/tutorials) in a new full-screen Activity. The first tutorial in the
list will be the starting tutorial.

### Parameters

`currentFragment` - this Fragment's `onActivityResult` method will be called with the
tutorial's exit code.`@MainThread fun openTutorial(currentFragment: Fragment, vararg tutorial: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens the provided AR [tutorial](open-tutorial.html#pro.streem.sdk.Streem$openTutorial(androidx.fragment.app.Fragment, kotlin.Array((kotlin.ByteArray)))/tutorial)s in a new full-screen Activity. The first tutorial in the
list will be the starting tutorial.

### Parameters

`currentFragment` - this Fragment's `onActivityResult` method will be called with the
tutorial's exit code.`@MainThread fun openTutorial(currentFragment: Fragment, @RawRes vararg resourceId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Opens the AR tutorials from the provided raw [resourceId](open-tutorial.html#pro.streem.sdk.Streem$openTutorial(androidx.fragment.app.Fragment, kotlin.IntArray)/resourceId)s in a new full-screen Activity. The
first tutorial in the list will be the starting tutorial.

### Parameters

`currentFragment` - this Fragment's `onActivityResult` method will be called with the
tutorial's exit code.