### v0.28.0 - November 14, 2023

-   Added more robust logs for any button taps
-   Added wall items to support sharing call connectivity type, battery level, and device type

### v0.27.1 - May 1, 2023

-   Updated URL for accessing Streem REST API

### v0.27.0 - April 20, 2023

-   Update logs to properly log call end reason and log roomId correctly in context
-   Add support for flashlight when world facing camera is active

### v0.26.3 - March 31, 2023

-   Hotfix to fix end of call crash with lobby camera setup

### v0.26.2 - March 22, 2023

-   Fixed bug where Android user could not exit call if network connection was lost
-   Fixed race condition occurring when starting a call
-   Updated logs

### v0.26.1 - March 13, 2023

-   Addition of EXIT_CODE_CANCELED to capture the situation when a user cancels the call before an expert answers
-   Added logs for call quality statistics
-   Update Twilio Video SDK version to 7.3.1
-   Various stability upgrades and bug fixes

### v0.26.0 - February 7, 2023

-   You will need to update your application's compileSdkVersion to at least 32, because of update to androidx.appcompat version 1.5.1.
-   Added the ability to set an app theme (see [ReadMe](./docs/integrating.md#setting-your-app-theme-optional))
-   Added support for expert bios in the lobby
-   Removed support for AR, including ARCore, Sceneform, and all transitive dependencies
-   Added support for integrationId for any call
-   Updated Lottie version from 3.6.0 to 5.1.1
-   Various stability upgrades and bug fixes

### v0.25.2 - November 4, 2022

-   Updated lobby to access user information given an external user id
-   Updated startStreemToRemoteUser to take in optional reference id
-   Updated exit codes to include EXIT_CODE_CALL_REJECTED and EXIT_CODE_NOT_ANSWERED and exposed the error extra for better error handling

### v0.25.1 - October 18, 2022

-   Added method startStreemToRemoteUser that starts a Streem to a UserId and takes you to the Lobby
-   Updated internal API calls to fix 403 with createRoomInvitationAndUser method

### v0.25.0 - September 1, 2022

-   Replaced Glide dependency with Streem's own Slide dependency
-   Analytics and logging added for login/logout processes
-   Updates to onsite Streems including flashlight, removing tools and AR, and bypassing creating a video room
-   Updated login response to include company name
-   Updated API to support upcoming expert features

### v0.24.0 - August 3, 2022

-   Small UI updates for more consistency in call controls
-   Updated Gradle Plugin version to 7.2.1 to support use on new M1 macbook
-   Increased stability when handling incoming calls

### v0.23.0 - July 6, 2022

-   Breaking Change: Upgraded to Kotlin 1.5.32 to support updating to Twilio v7 (see compatibility guide [here](https://kotlinlang.org/docs/compatibility-guide-15.html))
-   Update target SDK to 31 (see compatibility guide [here](https://developer.android.com/google/play/requirements/target-sdk#pre12))
-   Updated location permission requests to request fine and coarse location required by update to target SDK 31
-   Add feature flag for expert-side features
-   Updates to expert-side login/logout (behind feature flag, not yet available)

### v0.22.0 - June 8, 2022

-   Fix crash due to race condition
-   Update log level for a few logs to provide better debug logging
-   Fix calling issue present on some OnePlus devices
-   Update to strategy for restoring Streem calls
-   Fix crash occurring in lobby for some older devices
-   Fix crash relating to ARCore losing tracking
-   Updates to certain expert-side functionality (in beta, not yet available)

### v0.21.0 - May 12, 2022

-   Increased stability for Pixel 3 users
-   Update to timing for heartbeats verifying a user is in a Streem room
-   Fix bug where Streem logo animation was persisting during call
-   Update lobby to ensure buttons are set/disabled when join call is initiated
-   Update to backend API endpoint for settings
-   Fix bug relating to AR element tracking
-   Various updates to unreleased Beta features

### v0.20.5 - April 27, 2022

-   Patch for bug fixes relating to a beta feature

### v0.20.4 - April 26, 2022

-   Patch for bug fixes relating to a beta feature

### v0.20.3 - March 31, 2022

-   Hotfix to improve lighting for beta feature

### v0.20.2 - March 30, 2022

-   Hotfix to update proguard rules for SDK users on Gradle plugin versions below 4.2.0

### v0.20.1 - March 23, 2022

-   Hotfix to downgrade source and target Java version back to Java 8

### v0.20.0 - March 16, 2022

-   Fix bug relating to rear camera introduced with lobby animations
-   Fix bug relating to issues when Picture-in-picture is turned off at app level
-   Updates to fragment transitions to fix multiple cameras in use issue
-   Remove deprecated references to ArSource

### v0.19.0 - March 3, 2022

-   Fix bug related to refreshing SDK token
-   Updated protobuf handling of API error responses
-   Updated animation for entering a Streem call in face-to-face mode
-   Upgraded to Java 11 (see [ReadMe](./docs/integrating.md#installation))

### v0.18.0 - February 2, 2022

-   Add ability to login using Streem SDK token
-   Add ClientVersionTooOldException which can be returned if the Streem SDK version is outdated
-   Fix bug where UploadManagerService failed to unload and remained active in memory
-   Bug fixes for 3d elements intermittently failing to show
-   Work on new features that are coming soon

### v0.17.0 - December 15, 2021

-   Fixed bugs related to thread safety to ensure stability
-   Updated lifecycle handling for AR elements when using face-to-face mode and changing cameras
-   Improvements to system picture-in-picture to fix content resizing and support orientation changes
-   Upgrade pbandk library dependency from v0.10.0 to v0.12.1 (see version changes in [pbandk changelog](https://github.com/streem/pbandk/blob/master/CHANGELOG.md#0121---2021-11-11))
-   Upgraded from Twilio v5.8.1 to Twilio v6.4.0 (see specific upgrades in the [Twilio Video Android Changelog](https://www.twilio.com/docs/video/changelog-twilio-video-android-v6))

### v0.16.0 - November 10, 2021

-   Minor face-to-face mode UI updates including microphone icon for pro video and prompt for users when in system PiP and camera swap request comes through
-   Improvement to system PiP experience when view is in landscape
-   API endpoint migration for environments to support multi-region work
-   Additional API methods to parse Streem URL on app's behalf (see API and [ReadMe](./docs/authenticating.md#logging-in) for more info)
-   Minor bug fixes including the bug where user name and mic status were not previously appearing on expert web side

### v0.15.0 - September 29, 2021

-   Minor face-to-face mode UI updates including microphone icon for customer video
-   Add easier access to call controls by opening when user taps on their face-to-face video
-   Bug fixes including lifecycle enhancements for system picture in picture mode
-   Update to newly released Streem Sceneform version to support above lifecycle enhancements

### v0.14.0 - September 1, 2021

-   Added lobby experience with camera preview to classic Streem and face-to-face experiences
-   Deprecated `startStreemActivity` API calls in favor of the [Activity Results API](https://developer.android.com/training/basics/intents/result) launch (see API and [ReadMe](./docs/remote.md#remote-streems) for more info)
-   Added analytics events surrounding usage of two way video
-   Bug fixes including smoother handling of system picture-in-picture mode and animation improvements

### v0.13.0 - August 5, 2021

-   Fixed Android PiP exception due to invalid aspect ratio
-   Reduced redundant logging of device orientation
-   3D labels (TextNodes) always face the camera
-   Improved face-to-face rotation support, and compatibility with older devices
-   Other bug fixes and UI improvements

### v0.12.0 - June 30, 2021

-   Add logic for using face-to-face on a per company basis
-   Add logic for using new ARaaS pipeline on a per company basis
-   User experience enhancements for face-to-face mode
-   API updates to encourage Streem lobby use (see README.md for more information)
-   Update to Streem Sceneform fork version 2.0.4 which has an updated Filament version of 1.8.0
-   Stability updates

### v0.11.0 - May 26, 2021

-   Bug fix for Streemshots not showing AR data post call
-   Bug fix for incorrect log level
-   Analytics platform in place
-   Analytics added for login events
-   Interface added for communicating between app and SDK (for Streem Internal use only)

### v0.10.1 - May 12, 2021

-   Update the PB&K version being used to remove protobuf-javalite dependency conflict
-   Move PB&K to Maven Central
-   Move Streem's Sceneform fork to Maven Central

### v0.10.0 - April 29, 2021

-   A lot of added behind the scenes code to support upcoming features (feature flagged off for production)
-   Stability/bug fixes
