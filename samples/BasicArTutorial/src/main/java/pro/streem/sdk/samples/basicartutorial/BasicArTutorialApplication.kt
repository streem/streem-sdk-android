/*
 * Copyright © 2019. Streem, Inc. All rights reserved.
 */

package pro.streem.sdk.samples.basicartutorial

import android.util.Log
import android.widget.Toast
import androidx.multidex.MultiDexApplication
import pro.streem.sdk.Streem

class BasicArTutorialApplication : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        Streem.initialize(
            Streem.Configuration(
                application = this,
                appId = MY_APP_ID,
                environment = Streem.Environment.SANDBOX
            )
        )
    }

    companion object {
        private val TAG = BasicArTutorialApplication::class.java.simpleName
        // You will need an App Id provided to you from somebody at Streem.
        // More information can be found here: https://github.com/streem/streem-sdk-android
        private const val MY_APP_ID = "your_app_id_here"
    }
}
