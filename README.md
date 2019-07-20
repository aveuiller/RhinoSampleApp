# RhinoSampleApp

Demonstrate [rhino-android](https://github.com/APISENSE/rhino-android) library use with Android.

The point of this app is mainly to show the proguard configuration needed to build an application unsing rhino-android.

# Trying it out.

Branch a device or an emulator through ADB and run one of the two commands:
```bash
$ ./gradlew installDebug
$ ./gradlew installRelease
```

The main activity will swith on the keywords from which you can access the Rhino script engine.

# Troubleshooting

## Beware of R8

In this sample project, we had to disable the [R8 compilation tool](https://www.guardsquare.com/en/blog/proguard-and-r8) to make the Proguard configuration work and avoid shrinking too much classes.

The configuration disabling R8 can be found in the [gradle.properies](https://github.com/aveuiller/RhinoSampleApp/blob/master/gradle.properties#L16) file.
