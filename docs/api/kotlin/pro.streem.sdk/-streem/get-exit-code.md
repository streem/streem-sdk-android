---
title: Streem.getExitCode - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [getExitCode](./get-exit-code.html)

# getExitCode

`abstract fun getExitCode(requestCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, resultCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, data: Intent?): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`

Returns the exit code from the Streem experience if [requestCode](get-exit-code.html#pro.streem.sdk.Streem$getExitCode(kotlin.Int, kotlin.Int, android.content.Intent)/requestCode) represents an Activity that
was started by the Streem SDK. Otherwise returns `null`. This method should be called from
[Activity.onActivityResult](#) or [Fragment.onActivityResult](#).

For a tutorial, this will be the exit code specified in the tutorial's step destination. This
can also be [EXIT_CODE_HELP](-e-x-i-t_-c-o-d-e_-h-e-l-p.html) or [EXIT_CODE_EXIT](-e-x-i-t_-c-o-d-e_-e-x-i-t.html) if the user exited via one of the toolbar
buttons.

