[pro.streem.sdk](../index.md) / [Streem](index.md) / [getExitCode](./get-exit-code.md)

# getExitCode

`abstract fun getExitCode(requestCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, resultCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, data: `[`Intent`](https://developer.android.com/reference/android/content/Intent.html)`?): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`

Returns the exit code from the Streem experience if [requestCode](get-exit-code.md#pro.streem.sdk.Streem$getExitCode(kotlin.Int, kotlin.Int, android.content.Intent)/requestCode) represents an Activity that
was started by the Streem SDK. Otherwise returns `null`. This method should be called from
[Activity.onActivityResult](https://developer.android.com/reference/android/app/Activity.html#onActivityResult(int, int, android.content.Intent)) or [Fragment.onActivityResult](#).

For a tutorial, this will be the exit code specified in the tutorial's step destination. This
can also be [EXIT_CODE_HELP](-e-x-i-t_-c-o-d-e_-h-e-l-p.md) or [EXIT_CODE_EXIT](-e-x-i-t_-c-o-d-e_-e-x-i-t.md) if the user exited via one of the toolbar
buttons.

