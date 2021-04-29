---
title: openTutorial -
---
//[<root>](../../../index.md)/[pro.streem.sdk](../index.md)/[Streem](index.md)/[openTutorial](open-tutorial.md)



# openTutorial  
[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
abstract fun [openTutorial](open-tutorial.md)(currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), tutorials: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)>, errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)  
More info  


Opens the provided AR [tutorials](open-tutorial.md) in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.collections.List[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>currentActivity| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.collections.List[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Activity's onActivityResult method will be called with the tutorial's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.collections.List[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>errorCallback| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.collections.List[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
fun [openTutorial](open-tutorial.md)(currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), vararg tutorial: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html), errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)  
More info  


Opens the provided AR [tutorial](open-tutorial.md)s in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.Array[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>currentActivity| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.Array[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Activity's onActivityResult method will be called with the tutorial's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.Array[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>errorCallback| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.Array[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
fun [openTutorial](open-tutorial.md)(currentActivity: [Activity](https://developer.android.com/reference/kotlin/android/app/Activity.html), @[RawRes](https://developer.android.com/reference/kotlin/androidx/annotation/RawRes.html)()vararg resourceId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null)  
More info  


Opens the AR tutorials from the provided raw [resourceId](open-tutorial.md)s in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.IntArray#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>currentActivity| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.IntArray#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Activity's onActivityResult method will be called with the tutorial's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.IntArray#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>errorCallback| <a name="pro.streem.sdk/Streem/openTutorial/#android.app.Activity#kotlin.IntArray#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
abstract fun [openTutorial](open-tutorial.md)(currentFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html), tutorials: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)>, errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?)  
More info  


Opens the provided AR [tutorials](open-tutorial.md) in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.collections.List[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>currentFragment| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.collections.List[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Fragment's onActivityResult method will be called with the tutorial's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.collections.List[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>errorCallback| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.collections.List[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
fun [openTutorial](open-tutorial.md)(currentFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html), vararg tutorial: [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html), errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?)  
More info  


Opens the provided AR [tutorial](open-tutorial.md)s in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.Array[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>currentFragment| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.Array[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Fragment's onActivityResult method will be called with the tutorial's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.Array[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>errorCallback| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.Array[kotlin.ByteArray]#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.<br><br>|
  
  


[androidJvm]  
Content  
@[MainThread](https://developer.android.com/reference/kotlin/androidx/annotation/MainThread.html)()  
  
fun [openTutorial](open-tutorial.md)(currentFragment: [Fragment](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html), @[RawRes](https://developer.android.com/reference/kotlin/androidx/annotation/RawRes.html)()vararg resourceId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), errorCallback: ([Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)?)  
More info  


Opens the AR tutorials from the provided raw [resourceId](open-tutorial.md)s in a new full-screen Activity. The first tutorial in the list will be the starting tutorial.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.IntArray#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>currentFragment| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.IntArray#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>this Fragment's onActivityResult method will be called with the tutorial's exit code.<br><br>|
| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.IntArray#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a>errorCallback| <a name="pro.streem.sdk/Streem/openTutorial/#androidx.fragment.app.Fragment#kotlin.IntArray#kotlin.Function1[kotlin.Throwable,kotlin.Unit]?/PointingToDeclaration/"></a><br><br>a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error occurs.<br><br>|
  
  



