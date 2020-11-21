---
title: Streem.getSupportedCountries - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [getSupportedCountries](./get-supported-countries.html)

# getSupportedCountries

`abstract fun getSupportedCountries(countriesHandler: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Streem.Country`](-country/index.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, errorHandler: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Returns a list of countries supported by the Streem service. Typically this is used before
calling [createInvitation](create-invitation.html) when submitting a [phone](#) param, which must include a country
code. First call [getSupportedCountries](./get-supported-countries.html), then use the countries list to populate a form
field for country code, and/or validate user-entered phone numbers before submitting them
phone number to [createInvitation](create-invitation.html).

### Parameters

`countriesHandler` - a function that is called with a list of [Country](-country/index.html) when successful.

`errorHandler` - a function that is called with a [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) when an error
occurs.