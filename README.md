# RhinoSampleApp

Demonstrate [rhino-android](https://github.com/APISENSE/rhino-android) library use with Android.

The point of this app is mainly to show the proguard configuration needed to build an application unsing rhino-android.

# Trying it out.

Branch a device or an emulator through ADB and run one of the two commands:
```bash
$ ./gradlew installDebug
$ ./gradlew installRelease
```

The main activity will switch on the keywords from which you can access the Rhino script engine.

# Configuration

Going to the point, the important part of this project is the [proguard configuration](./app/proguard-rules.pro).

We use R8 as the APK optimizer.
If you have any issue with it, you can [disable R8](./gradle.properties#L16) to force the use of _Proguard_.

# Troubleshooting

## Beware of R8

In this sample project, we had to disable the [R8 compilation tool](https://www.guardsquare.com/en/blog/proguard-and-r8) to make the _Proguard_ configuration work and avoid shrinking too much classes.

The configuration disabling _R8_ can be found in the [gradle.properies](https://github.com/aveuiller/RhinoSampleApp/blob/master/gradle.properties#L16) file.

### Update 2020/02/27

With the latest version of the Android SDK tooling, R8 is now handling our rhino script engine as well as Proguard.
