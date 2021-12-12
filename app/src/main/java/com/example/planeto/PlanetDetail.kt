package com.example.planeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_planet_detail.*

class PlanetDetail : AppCompatActivity() {
    private lateinit var obj:PlanetData
    private var planetImg:Int?=null
    private var backImg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_detail)
        window.decorView.apply { systemUiVisibility=
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN }

        obj= intent.getParcelableExtra("planet")!!
        planetImg=intent.getIntExtra("planetImage",-1)
        backImg=intent.getIntExtra("back_planetImage",-1)
        setData(obj, planetImg!!, backImg!!)

//        button_info.setOnClickListener{
//            val intent=Intent(this,finalActivity::class.java)
//            startActivity(intent)
//        }
    }
    private fun setData(obj: PlanetData, planetImg: Int, backImg: Int)
    {
        title_info.text=obj.title
        floor_info.text=obj.floor+" floor"
        capacity_info.text=obj.capacity+" people"
        overview_info.text=obj.overview
        building_info.text=obj.building
        planet_img_info.setImageResource(planetImg)
        back_img_info.setImageResource(backImg)

    }
}