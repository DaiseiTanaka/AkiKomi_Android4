package com.example.planeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.mikhaellopez.circularprogressbar.CircularProgressBar
import kotlinx.android.synthetic.main.activity_main.*

//MQTT Import
import org.eclipse.paho.android.service.MqttAndroidClient
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions
import org.eclipse.paho.client.mqttv3.IMqttActionListener
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken
import org.eclipse.paho.client.mqttv3.IMqttToken
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended
import org.eclipse.paho.client.mqttv3.MqttConnectOptions
import org.eclipse.paho.client.mqttv3.MqttException
import org.eclipse.paho.client.mqttv3.MqttMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.apply { systemUiVisibility=
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN }
        my_recycler.adapter=Adapter(setData.SetPlanets())
        my_recycler.layoutManager=LinearLayoutManager(this)

        val circularProgressBar = findViewById<CircularProgressBar>(R.id.circularProgressBar)
//        circularProgressBar.apply {
//            // Set Progress
//            progress = 65f
//            // or with animation
//            setProgressWithAnimation(65f, 1000) // =1s
//

//            // Set Progress MAX
//            progressMax = 100f
//
//            // Other
//            roundBorder = true
//            startAngle = 180f
//            progressDirection = CircularProgressBar.ProgressDirection.TO_RIGHT
//        }
    }
}