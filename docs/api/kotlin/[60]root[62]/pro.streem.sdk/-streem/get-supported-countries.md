---
title: getSupportedCountries
---
//[<root>](../../../index.html)/[pro.streem.sdk](../index.html)/[Streem](index.html)/[getSupportedCountries](get-supported-countries.html)



# getSupportedCountries



[androidJvm]\
abstract fun [getSupportedCountries](get-supported-countries.html)(resultCallback: ([Streem.SupportedCountriesResult](-supported-countries-result/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))



Returns a list of countries supported by the Streem service. Typically this is used before calling [createInvitation](create-invitation.html) when submitting a phone param, which must include a country code. First call [getSupportedCountries](get-supported-countries.html), then use the countries list to populate a form field for country code, and/or validate user-entered phone numbers before submitting them phone number to [createInvitation](create-invitation.html).



## Parameters


androidJvm

| | |
|---|---|
| resultCallback | a function that is called with a SupportedCountriesResult |




