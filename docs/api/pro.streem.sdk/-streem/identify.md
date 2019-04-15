[pro.streem.sdk](../index.md) / [Streem](index.md) / [identify](./identify.md)

# identify

`abstract fun identify(userProfile: `[`Streem.UserProfile`](-user-profile/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Identifies the current user to the Streem SDK. New users are automatically provisioned on
first use. Existing users will have their profile information updated to match [userProfile](identify.md#pro.streem.sdk.Streem$identify(pro.streem.sdk.Streem.UserProfile)/userProfile).

