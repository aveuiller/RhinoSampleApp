-keep class android.support.v7.widget.** { *; }

-keep public class io.github.aveuiller.** { public *; }

## Rhino
-keep class javax.script.** { *; }
-keep class com.sun.script.javascript.** { *; }
-keep class org.mozilla.javascript.** { *; }
-dontwarn org.mozilla.javascript.**
-dontwarn sun.**
