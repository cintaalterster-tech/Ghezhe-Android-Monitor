package com.ghezhe.monitor

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val status = findViewById<TextView>(R.id.status)
        val deviceInfo = findViewById<TextView>(R.id.deviceInfo)

        status.text = "Ghezhe Monitor aktif"
        deviceInfo.text = """
            Perangkat: Android
            Status: Online
            Bridge: Menunggu koneksi server
        """.trimIndent()
    }
}
