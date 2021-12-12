package com.example.planeto

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mikhaellopez.circularprogressbar.CircularProgressBar
import kotlinx.android.synthetic.main.activity_planet_detail.view.*
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var planet: List<PlanetData>) : RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var planetimg = view.planet_img
        var building = view.building
        var floor = view.floor
        var capacity = view.capacity

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        var dummyImage2: Int? = null

        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,PlanetDetail::class.java)
            intent.putExtra("planet",planet[position])
            intent.putExtra("planetImage",dummyImage)
            intent.putExtra("back_planetImage",dummyImage2)
            holder.itemView.context.startActivity(intent)

        }
        holder.title.text = planet[position].title
        holder.building.text = planet[position].building
        holder.floor.text = planet[position].floor + " floor"
        holder.capacity.text = planet[position].capacity + " people"

        when (planet[position].title!!.toLowerCase()) {
            "library" -> {
                dummyImage = R.drawable.ic_slibrary
                dummyImage2 = R.drawable.bg_slibrary
            }
            "learning commons1" -> {
                dummyImage = R.drawable.ic_lc1
                dummyImage2 = R.drawable.bg_lc1
            }
            "learning commons2" -> {
                dummyImage = R.drawable.ic_lc2
                dummyImage2 = R.drawable.bg_lc2
            }
            "learning commons3" -> {
                dummyImage = R.drawable.ic_lc3
                dummyImage2 = R.drawable.bg_lc3
            }
            "learning commons4" -> {
                dummyImage = R.drawable.ic_lc4
                dummyImage2 = R.drawable.bg_lc4
            }
            "s306" -> {
                dummyImage = R.drawable.ic_s306
                dummyImage2 = R.drawable.bg_s306
            }
            "s307" -> {
                dummyImage = R.drawable.ic_s307
                dummyImage2 = R.drawable.bg_s307
            }
            "s311" -> {
                dummyImage = R.drawable.ic_s311
                dummyImage2 = R.drawable.bg_s311
            }
            "s312" -> {
                dummyImage = R.drawable.ic_s312
                dummyImage2 = R.drawable.bg_s312
            }
            "advanced hall" -> {
                dummyImage = R.drawable.ic_advanced
                dummyImage2 = R.drawable.bg_advanced
            }
            "sagano hall" -> {
                dummyImage = R.drawable.ic_sagano
                dummyImage2 = R.drawable.bg_sagano
            }
            "science praza" -> {
                dummyImage = R.drawable.ic_mws
                dummyImage2 = R.drawable.bg_mws
            }
            "electronic workshop" -> {
                dummyImage = R.drawable.ic_ews
                dummyImage2 = R.drawable.bg_ews
            }
        }
        holder.planetimg.setImageResource(dummyImage!!)

    }

    override fun getItemCount(): Int {
        return planet.size
    }
}

