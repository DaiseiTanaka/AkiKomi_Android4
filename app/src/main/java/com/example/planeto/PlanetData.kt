package com.example.planeto

import android.os.Parcel
import android.os.Parcelable

data class PlanetData(
    val id:Int?,
    val title:String?,
    val building:String?,
    val floor:String?,
    val capacity:String?,
    val overview:String?,
    val topic:String?
):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()

    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(building)
        parcel.writeString(floor)
        parcel.writeString(capacity)
        parcel.writeString(overview)
        
        parcel.writeString(topic)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlanetData> {
        override fun createFromParcel(parcel: Parcel): PlanetData {
            return PlanetData(parcel)
        }

        override fun newArray(size: Int): Array<PlanetData?> {
            return arrayOfNulls(size)
        }
    }

}
