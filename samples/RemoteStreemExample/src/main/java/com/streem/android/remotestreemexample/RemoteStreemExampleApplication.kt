package com.streem.android.remotestreemexample

import android.app.Application
import pro.streem.sdk.Streem

class RemoteStreemExampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val configuration = Streem.Configuration(
            application = this,
            appId = MY_APP_ID,
            environment = Streem.Environment.SANDBOX
        )
        Streem.initialize(configuration)
    }

    companion object {
        // You will need an App Id provided to you from somebody at Streem.
        // More information can be found here: https://github.com/streem/streem-sdk-android
        private const val MY_APP_ID = "your_app_id_here"
    }
}
