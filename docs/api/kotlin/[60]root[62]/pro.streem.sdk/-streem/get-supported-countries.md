---
title: getSupportedCountries -
---
//[<root>](../../../index.md)/[pro.streem.sdk](../index.md)/[Streem](index.md)/[getSupportedCountries](get-supported-countries.md)



# getSupportedCountries  
[androidJvm]  
Content  
abstract fun [getSupportedCountries](get-supported-countries.md)(resultCallback: ([Streem.SupportedCountriesResult](-supported-countries-result/index.md)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Returns a list of countries supported by the Streem service. Typically this is used before calling [createInvitation](create-invitation.md) when submitting a phone param, which must include a country code. First call [getSupportedCountries](get-supported-countries.md), then use the countries list to populate a form field for country code, and/or validate user-entered phone numbers before submitting them phone number to [createInvitation](create-invitation.md).



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="pro.streem.sdk/Streem/getSupportedCountries/#kotlin.Function1[pro.streem.sdk.Streem.SupportedCountriesResult,kotlin.Unit]/PointingToDeclaration/"></a>resultCallback| <a name="pro.streem.sdk/Streem/getSupportedCountries/#kotlin.Function1[pro.streem.sdk.Streem.SupportedCountriesResult,kotlin.Unit]/PointingToDeclaration/"></a><br><br>a function that is called with a SupportedCountriesResult<br><br>|
  
  



