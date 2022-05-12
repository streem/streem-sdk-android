### v0.21.0 - May 11, 2022

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
