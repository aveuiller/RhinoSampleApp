-keep class android.support.v7.widget.** { *; }

-keep public class io.github.aveuiller.** { public *; }

# Mozila Rhino
-keep class javax.script.** { *; }
-keep class com.sun.script.javascript.** { *; }
-keep class org.mozilla.javascript.** { *; }

-printconfiguration /tmp/rhinosampleapp-r8-config.txt
