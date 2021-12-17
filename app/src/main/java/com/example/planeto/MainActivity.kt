package com.example.planeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.recyclerview.widget.LinearLayoutManager
import com.mikhaellopez.circularprogressbar.CircularProgressBar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_planet_detail.*
import kotlinx.android.synthetic.main.view.*
import com.example.anoopm.mqtt.manager.MQTTConnectionParams
import com.example.anoopm.mqtt.manager.MQTTmanager
import com.example.anoopm.mqtt.protocols.UIUpdaterInterface

class MainActivity : AppCompatActivity() , UIUpdaterInterface {

    var mqttManager:MQTTmanager? = null




    // Interface methods
    override fun resetUIWithConnection(status: Boolean) {

//        ipAddressField.isEnabled  = !status
//        topicField.isEnabled      = !status
//        messageField.isEnabled    = status
 //         connectBtn.isEnabled      = !status
//        sendBtn.isEnabled         = status

    // Update the status label.
//        if (status){
//            updateStatusViewWith("Connected")
//        }else{
//            updateStatusViewWith("Disconnected")
//        }
    }

    override fun updateStatusViewWith(status: String) {
        //statusLabl.text = status
    }

    override fun update(message: String) {

        var text = messageHistoryView.text.toString()
        var newText = "$message"
        //var newText = text.toString() + "\n" + message +  "\n"
        messageHistoryView.setText(newText)
        //messageHistoryView.setSelection(messageHistoryView.text.length)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.apply { systemUiVisibility=
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN }
        my_recycler.adapter=Adapter(setData.SetPlanets())
        my_recycler.layoutManager=LinearLayoutManager(this)

        resetUIWithConnection(false)

//        circularProgressBar.apply {
//            //setProgressWithAnimation(50f,1000)
//            progress = 10f
//        }
    }

    fun connect(view: View){
            var host = "tcp://" + "192.168.1.111" + ":1883"
            var topic = "topic_advanced"
            var connectionParams = MQTTConnectionParams("MQTTSample",host,topic,"","")
            mqttManager = MQTTmanager(connectionParams,applicationContext,this)
            mqttManager?.connect()

    }

}
