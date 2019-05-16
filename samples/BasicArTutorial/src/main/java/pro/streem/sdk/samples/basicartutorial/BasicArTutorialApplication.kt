/*
 * Copyright © 2019. Streem, Inc. All rights reserved.
 */

package pro.streem.sdk.samples.basicartutorial

import android.support.multidex.MultiDexApplication
import android.support.v4.util.Consumer
import android.util.Log
import android.widget.Toast
import pro.streem.sdk.Streem

class BasicArTutorialApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        Streem.initialize(
            this,
            getString(R.string.streemAppId),
            Consumer {
                Log.e(TAG, "Error while Streeming", it)
                Toast.makeText(this, it.localizedMessage, Toast.LENGTH_LONG).show()
            }
        )
    }

    companion object {
        private val TAG = BasicArTutorialApplication::class.java.simpleName
    }
}
