---
title: Streem.getMissingPermissions - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [getMissingPermissions](./get-missing-permissions.html)

# getMissingPermissions

`abstract fun getMissingPermissions(context: `[`Context`](https://developer.android.com/reference/android/content/Context.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`

Returns a list of the permissions required to use the Streem SDK that are not presently
granted.

### Parameters

`context` - the Context to use when checking each required permission's grant status.