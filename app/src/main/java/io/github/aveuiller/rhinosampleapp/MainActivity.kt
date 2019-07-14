package io.github.aveuiller.rhinosampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import android.widget.TextView
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG: String = "MainActivity"

        private val SWITCH_IDS = intArrayOf(
            R.id.keyword_rhino,
            R.id.keyword_js,
            R.id.keyword_upper_js,
            R.id.keyword_upper_javascript,
            R.id.keyword_javascript
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var switch: Switch?
        var keyword: String

        findViewById<TextView>(R.id.build_mode_label).text = BuildConfig.BUILD_TYPE.toUpperCase()

        for (id in SWITCH_IDS) {
            switch = findViewById(id)

            keyword = switch.text.toString()
            switch.isChecked = ScriptEngineManager().getEngineByName(keyword) != null
            Log.i(TAG, "Fetching ScriptEngine for label '%s' (success: %b)".format(keyword, switch.isChecked))
        }


    }
}
