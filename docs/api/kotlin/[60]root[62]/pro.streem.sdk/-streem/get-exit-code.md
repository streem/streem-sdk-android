---
title: getExitCode -
---
//[<root>](../../../index.md)/[pro.streem.sdk](../index.md)/[Streem](index.md)/[getExitCode](get-exit-code.md)



# getExitCode  
[androidJvm]  
Content  
abstract fun [getExitCode](get-exit-code.md)(requestCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), resultCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), data: [Intent](https://developer.android.com/reference/kotlin/android/content/Intent.html)?): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  
More info  


Returns the exit code from the Streem experience if [requestCode](get-exit-code.md) represents an Activity that was started by the Streem SDK. Otherwise returns null. This method should be called from [Activity.onActivityResult](https://developer.android.com/reference/kotlin/android/app/Activity.html#onactivityresult) or [Fragment.onActivityResult](https://developer.android.com/reference/kotlin/androidx/fragment/app/Fragment.html#onactivityresult). It should only be called when [resultCode](get-exit-code.md) == RESULT_OK in order to avoid calling Streem.get() before the Streem SDK has been initialized.



For a tutorial, this will be the exit code specified in the tutorial's step destination. This can also be [EXIT_CODE_HELP](-companion/-e-x-i-t_-c-o-d-e_-h-e-l-p.md) or [EXIT_CODE_EXIT](-companion/-e-x-i-t_-c-o-d-e_-e-x-i-t.md) if the user exited via one of the toolbar buttons.

  



