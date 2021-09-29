### v0.15.0 - September 29, 2021

-   Minor face-to-face mode UI updates including microphone icon for customer video
-   Add easier access to call controls by opening when user taps on their face-to-face video
-   Bug fixes including lifecycle enhancements for system picture in picture mode
-   Update to newly released Streem Sceneform version to support above lifecycle enhancements

### v0.14.0 - September 1, 2021

-   Added lobby experience with camera preview to classic Streem and face-to-face experiences
-   Deprecated `startStreemActivity` API calls in favor of the [Activity Results API](https://developer.android.com/training/basics/intents/result) launch (see API and [ReadMe](./README.md#remote-streems) for more info)
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
