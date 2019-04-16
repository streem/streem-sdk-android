# streem-sdk-android

Documentation and examples for using the Streem SDK on Android.

**Important**: The published SDK is currently just a stub of the API.  Actual implementation coming soon

## Company/App Setup

* Obtain your `companyId` from Streem
* Provide your Android app `package` for any apps you are going to use the Streem SDK in (later you will be able to do this from a self-service portal)
* Streem will provide you with an `appId` and `appSecret` for each of your Android apps


## Installation

Add the Streem repository to your `build.gradle` file:

```gradle
repositories {
    ...
    maven {
        url "https://maven.sandbox.streem.cloud/"
    }
    ...
}
```

Add `streem-sdk` to your dependencies:

```gradle
dependencies {
    ...
    implementation "pro.streem:streem-sdk:0.1.0"
    ...
}
```


## Using the SDK in Your Code

### Initialization

Initialize the SDK by calling `Streem.initialize` with your App ID.  This should be done in your `Application.onCreate` method:

```java
public class MyApplication extends Application {
    private static final String TAG = MyApplication.class.getSimpleName();
    private static final String MY_APP_ID = "APP_ID";

    @Override
    public void onCreate() {
        super.onCreate();
        Streem.initialize(
                this,
                MY_APP_ID,
                new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable t) {
                        Log.e(TAG, "Error from Streem", t);
                    }
                }
        );
    }
}
```

### Logging In

Once the user has logged into your app, inform Streem they are logged in by calling `Streem.identify` with the necessary user information:

```java
    Streem.get().identify(Streem.UserProfile.builder()
        .user(Streem.User.withUserId("alice"))
        .expert(false)
        .name("Alice Smith")
        .avatarUrl("https://robohash.org/alice.png")
        .build()
    );
```


### AR Tutorials

Check Tutorial support using the `Streem.checkSupport` method.  

```java
    Streem.get().checkSupport((supported -> {
        // Show tutorial button when supported == true
    }), Streem.Feature.TUTORIAL);
```

This checks whether the device has the necessary components to run Tutorials, including ARCore and SceneForm support.  If the above check returns `true`, show whatever UI makes sense for your app to indicate AR Tutorial support.

When you are ready to kick off a Tutorial, call `Streem.openTutorial` with the `tutorial` resource you received from Streem, and the current activity or fragment.

```java
    Streem.get().openTutorial(activityOrFragment, R.raw.tutorial);
```


### Streem Exit Codes

There are a few different ways that Streem can exit, including the user pressing the Cancel or Help button, or by finishing a Tutorial in a certain state.  You can check the exit code (and kick off a Help Chat experience, for example) by listening for the result from your `Activity` or `Fragment`.

```java
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String exitCode = Streem.get().getExitCode(requestCode, resultCode, data);
        if (Streem.EXIT_CODE_HELP.equals(exitCode)) {
            // Kick off Help experience
        }
    }
```

## Further Documentation

* [Kotlin API docs](https://streem.github.io/streem-sdk-android/api/)
