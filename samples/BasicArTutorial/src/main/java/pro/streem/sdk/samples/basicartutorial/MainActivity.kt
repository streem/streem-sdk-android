package pro.streem.sdk.samples.basicartutorial

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.annotation.RawRes
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.main_activity.*
import pro.streem.sdk.Streem
import pro.streem.sdk.checkSupport

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        arTutorialButton.setOnClickListener { runTutorial(R.raw.tutorial_public) }

        Streem.get().checkSupport(Streem.Feature.TUTORIAL) { streemSupported ->
            if (streemSupported) {
                checkSupportProgress.visibility = View.GONE
                arTutorialButton.isEnabled = true
            } else {
                checkSupportProgressText.setText(R.string.tutorials_not_supported)
                checkSupportProgressSpinner.visibility = View.GONE
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d(TAG, "Got result: requestCode = $requestCode, resultCode = $resultCode")
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            val streemExitCode = Streem.get().getExitCode(requestCode, resultCode, data)
            if (streemExitCode != null) {
                Log.i(TAG, "Streem exit code: $streemExitCode")
                Snackbar.make(container, streemExitCode, Snackbar.LENGTH_SHORT).show()
            }
        } else {
            Snackbar.make(container, R.string.streem_activity_exited_unexpectedly, Snackbar.LENGTH_SHORT)
                .show()
        }
    }

    private fun runTutorial(@RawRes tutorial: Int) {
        Streem.get().identify(
            Streem.UserProfile(
                user = Streem.User.withUserId("jstreem"),
                expert = false,
                name = "Jay Streemington",
                avatarUrl = "https://robohash.org/jay_streemington.png"
            )
        )

        Streem.get().openTutorial(this, tutorial)
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}
