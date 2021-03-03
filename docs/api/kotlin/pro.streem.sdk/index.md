---
title: pro.streem.sdk - 
---

[pro.streem.sdk](./index.html)

## Package pro.streem.sdk

### Types

| [Streem](-streem/index.html) | `abstract class Streem` |

### Annotations

| [StreemBeta](-streem-beta/index.html) | `annotation class StreemBeta` |
| [StreemInternal](-streem-internal/index.html) | `annotation class StreemInternal` |

### Functions

| [checkSupport](check-support.html) | `fun `[`Streem`](-streem/index.html)`.checkSupport(vararg feature: `[`Streem.Feature`](-streem/-feature/index.html)`, resultCallback: (`[`Streem.FeatureSupportResult`](-streem/-feature-support-result/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Checks if the requested [feature](check-support.html#pro.streem.sdk$checkSupport(pro.streem.sdk.Streem, kotlin.Array((pro.streem.sdk.Streem.Feature)), kotlin.Function1((pro.streem.sdk.Streem.FeatureSupportResult, kotlin.Unit)))/feature)s are supported on this device. Calls [resultCallback](check-support.html#pro.streem.sdk$checkSupport(pro.streem.sdk.Streem, kotlin.Array((pro.streem.sdk.Streem.Feature)), kotlin.Function1((pro.streem.sdk.Streem.FeatureSupportResult, kotlin.Unit)))/resultCallback) asynchronously with the result. |

