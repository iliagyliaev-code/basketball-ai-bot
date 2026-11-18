
package com.basketball.aibot

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(32, 60, 32, 32)

        val title = TextView(this)
        title.text = "🏀 Basketball AI Bot"
        title.textSize = 26f
        layout.addView(title)

        val status = TextView(this)
        status.text = "Бот готов к настройке"
        status.textSize = 18f
        layout.addView(status)

        val button = Button(this)
        button.text = "Настроить управление"
        button.setOnClickListener {
            startActivity(
                Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
            )
        }
        layout.addView(button)

        val info = TextView(this)
        info.text = "Включай управление только после настройки бота."
        layout.addView(info)

        setContentView(layout)
    }
}
