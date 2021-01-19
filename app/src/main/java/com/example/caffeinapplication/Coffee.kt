package com.example.caffeinapplication

import android.os.Parcel
import android.os.Parcelable


class Coffee (
    var photo: Int = 0,
    var title: String? = "",
    var time: String? = "",
    var type: String? = "",
    var ingredients: String? = "",
    var steps: String? = "",
    var detail: String? = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(photo)
        parcel.writeString(title)
        parcel.writeString(time)
        parcel.writeString(type)
        parcel.writeString(ingredients)
        parcel.writeString(steps)
        parcel.writeString(detail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Coffee> {
        override fun createFromParcel(parcel: Parcel): Coffee {
            return Coffee(parcel)
        }

        override fun newArray(size: Int): Array<Coffee?> {
            return arrayOfNulls(size)
        }
    }
}