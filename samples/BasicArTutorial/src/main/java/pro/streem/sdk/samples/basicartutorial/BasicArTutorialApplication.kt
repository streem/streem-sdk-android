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
                appId = getString(R.string.streemAppId),
                appSecret = getString(R.string.streemAppSecret),
                environment = Streem.Environment.SANDBOX
            ) {
                Log.e(TAG, "Error while Streeming", it)
                Toast.makeText(this, it.localizedMessage, Toast.LENGTH_LONG).show()
            }
        )
    }

    companion object {
        private val TAG = BasicArTutorialApplication::class.java.simpleName
    }
}
