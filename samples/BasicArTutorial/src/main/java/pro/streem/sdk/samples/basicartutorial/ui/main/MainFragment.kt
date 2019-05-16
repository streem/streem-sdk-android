package pro.streem.sdk.samples.basicartutorial.ui.main

import android.content.Intent
import android.os.Bundle
import android.support.annotation.RawRes
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.main_fragment.*
import pro.streem.sdk.Streem
import pro.streem.sdk.checkSupport
import pro.streem.sdk.samples.basicartutorial.R
import java.util.concurrent.TimeUnit

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arTutorialButton.setOnClickListener { runTutorial(R.raw.tutorial_public) }

        // Delay the `checkSupport()` call by a couple seconds so that the effect is noticeable.
        // Otherwise all of this runs too fast :)
        view.postDelayed(
            {
                Streem.get().checkSupport(Streem.Feature.TUTORIAL) { streemSupported ->
                    if (streemSupported) {
                        checkSupportProgress.visibility = View.GONE
                        arTutorialButton.isEnabled = true
                    } else {
                        checkSupportProgressText.setText(R.string.tutorials_not_supported)
                        checkSupportProgressSpinner.visibility = View.GONE
                    }
                }
            },
            TimeUnit.SECONDS.toMillis(2)
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d(TAG, "Got result: requestCode = $requestCode, resultCode = $resultCode")
        super.onActivityResult(requestCode, resultCode, data)

        val streemExitCode = Streem.get().getExitCode(requestCode, resultCode, data)
        if (streemExitCode != null) {
            Log.i(TAG, "Streem exit code: $streemExitCode")
            if (view != null) {
                Snackbar.make(view!!, streemExitCode, Snackbar.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), streemExitCode, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun runTutorial(@RawRes tutorial: Int) {
        Streem.get().identify(
            Streem.UserProfile.builder()
                .user(Streem.User.withUserId("jstreem"))
                .expert(false)
                .name("Jay Streemington")
                .avatarUrl("https://robohash.org/jay_streemington.png")
                .build()
        )

        Streem.get().openTutorial(this, tutorial)
    }

    companion object {
        private val TAG = MainFragment::class.java.simpleName
    }
}
