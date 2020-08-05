package pro.streem.sdk.samples.basicartutorial

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.RawRes
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.vanniktech.rxpermission.Permission
import com.vanniktech.rxpermission.RealRxPermission
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import kotlinx.android.synthetic.main.main_activity.*
import pro.streem.sdk.Streem
import pro.streem.sdk.checkSupport

class MainActivity : AppCompatActivity() {

    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        arTutorialButton.setOnClickListener { runTutorial(R.raw.tutorial_public) }

        checkPermissions()

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

    override fun onDestroy() {
        compositeDisposable.clear()
        super.onDestroy()
    }

    private fun checkPermissions() {
        val missingPermissions = Streem.get().getMissingPermissions(this)
        if (missingPermissions.isNotEmpty()) {
            RealRxPermission.getInstance(this)
                .requestEach(*missingPermissions.toTypedArray())
                .doOnNext { result -> Log.d(TAG, "Permission result: $result") }
                .filter { result -> result.state() != Permission.State.GRANTED }
                .toList()
                .subscribeBy(
                    onSuccess = { deniedPermissions ->
                        if (deniedPermissions.isNotEmpty()) {
                            AlertDialog.Builder(this).apply {
                                setTitle(R.string.dialog_permission_not_granted_title)
                                setMessage(
                                    String.format(
                                        getString(R.string.dialog_permission_not_granted_message_format),
                                        deniedPermissions.joinToString { it.name() }
                                    )
                                )
                                setPositiveButton(R.string.dialog_permission_not_granted_button) { dialog, _ ->
                                    dialog.dismiss()
                                }
                                create()
                                show()
                            }
                        }
                    },
                    onError = {
                        Log.e(TAG, "Error requesting permissions", it)
                    }
                )
                .addTo(compositeDisposable)
        }
    }

    private fun runTutorial(@RawRes tutorial: Int) {
        Streem.get().login(
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
