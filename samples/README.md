## Android SDK Samples

Code is for sample use only.

## Running the sample

If you would like to run this code:

-   Update the Android application ID in the project build.gradle
-   Contact Streem to obtain a Streem App ID (this will be self-serve in the future).
-   After receiving your Streem App ID, update this value in the Application class (RemoteStreemExampleApplication)

### Troubleshooting

-   Verify the compile sdk version is installed from the sdk manager:
    -   SDK version 30 for RemoteStreemExample

### Running AR apps on an emulator

The sample will give a better experience on a physical device, but can be run on an emulator.

In short:

-   Requires Android emulator 27.2.9 or later and Android Studio 3.1 or later
-   Download the latest `Google_Play_Services_for_AR_1.26.0_x86_for_emulator.apk` from the [Github Releases page](https://github.com/google-ar/arcore-android-sdk/releases)
-   Install the apk by dragging the downloaded APK onto the running emulator or via `adb` while the emulator is running:

```
$ adb install -r Google_Play_Services_for_AR_1.26.0_x86_for_emulator.apk
```

See documentation for more details:
[Run AR Apps in Android Emulator](https://developers.google.com/ar/develop/c/emulator)
