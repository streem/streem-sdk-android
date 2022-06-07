&nbsp; &nbsp; &nbsp; &nbsp;
[Home](../README.md)
&nbsp; &nbsp; &nbsp; &nbsp;
[Integrating Streem SDK >](integrating.md)

## App ID

-   Provide your Android app `package` for any apps you are going to use the Streem SDK in (later you will be able to do this from a self-service portal)
-   Streem will provide you with an `appId` for each of your Android apps

#### Note About Android App Links

If you want to use Android App Links in your app you will have to tell Streem when you provide your Android app `package`. You will also need to provide the SHA-256 fingerprint of your app's signing certificate. Streem will then update Streem's Digital Asset Links JSON file to handle your app. You will then need to add a few `https` schemes with hosts of `<companyCode>.swac.prod-us.streem.cloud`, `<companyCode>.cv.prod-us.streem.cloud`, `<companyCode>.streem.me`, and `<companyCode>.streem.us` to your app manifest. Details on how to do this can be found at https://developer.android.com/training/app-links/deep-linking. You should also review the information here for more about Android App Links: https://developer.android.com/training/app-links/verify-site-associations#request-verify. Once Streem lets you know that the Digital Asset Link JSON file has been updated, you are ready to start using Android App Links.

&nbsp;
&nbsp; &nbsp; &nbsp; &nbsp;
[Home](../README.md)
&nbsp; &nbsp; &nbsp; &nbsp;
[Integrating Streem SDK >](integrating.md)
