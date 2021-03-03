---
title: Streem.getCompanySettings - 
---

[pro.streem.sdk](../index.html) / [Streem](index.html) / [getCompanySettings](./get-company-settings.html)

# getCompanySettings

`abstract fun getCompanySettings(companyCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, resultCallback: (`[`Streem.CompanySettingsResult`](-company-settings-result/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Gets the settings for a specified company.

### Parameters

`companyCode` - the code of the company for which to return settings

`resultCallback` - a function that is called with the [CompanySettingsResult](-company-settings-result/index.html).