package com.streem.android.remotestreemexample

import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import pro.streem.sdk.StartStreemFromInvitation
import pro.streem.sdk.StartStreemFromInvitationRequest
import pro.streem.sdk.StartStreemFromInvitationResult
import pro.streem.sdk.Streem

class MainActivity : AppCompatActivity() {

    private val startStreem = registerForActivityResult(StartStreemFromInvitation()) { result ->
        when (result) {
            is StartStreemFromInvitationResult.Completed ->
                Snackbar.make(container, R.string.streem_completed, Snackbar.LENGTH_SHORT).show()
            is StartStreemFromInvitationResult.Error.InvitationDeclined ->
                Snackbar.make(
                    container, R.string.streem_declined, Snackbar.LENGTH_SHORT
                ).show()
            is StartStreemFromInvitationResult.Error.UnexpectedError ->
                Snackbar.make(
                    container,
                    R.string.streem_activity_exited_unexpectedly,
                    Snackbar.LENGTH_SHORT
                )
                    .show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        startStreemButton.setOnClickListener {
            checkPermissionsBeforeStartingStreem()
        }
    }

    private fun checkPermissionsBeforeStartingStreem() {
        val missingPermissions = Streem.get().getMissingPermissions(this)
        if (missingPermissions.isNotEmpty()) {
            ActivityCompat.requestPermissions(
                this,
                missingPermissions.toTypedArray(),
                PERMISSION_CODE_STREEM
            )
        } else {
            startStreem()
        }
    }

    private fun startStreem() {
        // First we must authenticate the user with the invitation code given
        val invitationCode = invitationCode.text.toString()
        if (invitationCode.length != 9 || !invitationCode.all { it.isDigit() }) {
            logErrorAndShowSnackbar("Invitation code must be nine digits, was $invitationCode")
        } else {
            Streem.get().login(
                invitationCode = invitationCode,
                isExpert = false
            ) { result ->
                when (result) {
                    is Streem.LoginInvitationResult.LoggedIn -> {
                        Log.i(TAG, "Received invitation from: ${result.invitation.fromName}")
                        startStreem.launch(StartStreemFromInvitationRequest(result.invitation))
                    }
                    is Streem.LoginInvitationResult.Error.InvitationConsumed -> {
                        logErrorAndShowSnackbar("The invitation you entered has already been used. Please reach out to your expert to get a new code.")
                    }
                    is Streem.LoginInvitationResult.Error.InvitationInvalid -> {
                        logErrorAndShowSnackbar("The invitation you entered is invalid. Please reach out to your expert to get a new code.")
                    }
                    is Streem.LoginInvitationResult.Error.UnexpectedError -> {
                        logErrorAndShowSnackbar(
                            "There was an unexpected error while trying to Streem.",
                            result.error
                        )
                    }
                }
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == PERMISSION_CODE_STREEM) {
            when {
                grantResults.isEmpty() -> {
                    return
                }
                grantResults.all { it == PackageManager.PERMISSION_GRANTED } -> {
                    Log.d(TAG, "All missing permissions granted")
                    startStreem()
                }
                else -> {
                    AlertDialog.Builder(this).apply {
                        setTitle(R.string.dialog_permission_not_granted_title)
                        setMessage(
                            String.format(
                                getString(R.string.dialog_permission_not_granted_message)
                            )
                        )
                        setPositiveButton(R.string.dialog_permission_not_granted_button) { dialog, _ ->
                            dialog.dismiss()
                        }
                        create()
                        show()
                    }
                }
            }
        }
    }

    private fun logErrorAndShowSnackbar(errorMessage: String, error: Throwable? = null) {
        Log.e(TAG, errorMessage, error)
        Snackbar.make(container, errorMessage, Snackbar.LENGTH_LONG).show()
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
        private const val PERMISSION_CODE_STREEM = 1
    }
}
