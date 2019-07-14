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
