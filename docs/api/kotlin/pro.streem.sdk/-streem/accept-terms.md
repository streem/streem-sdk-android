---
title: Streem.acceptTerms - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [acceptTerms](./accept-terms.html)

# acceptTerms

`abstract fun acceptTerms(accepts: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, resultCallback: (`[`Streem.AcceptTermsResult`](-accept-terms-result/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Accept the latest terms and conditions and privacy policy for the current user.

### Parameters

`accepts` - indicates whether or not the current user is accepting or declining the latest terms and conditions and privacy policy.

`resultCallback` - a function that is called with the [AcceptTermsResult](-accept-terms-result/index.html).