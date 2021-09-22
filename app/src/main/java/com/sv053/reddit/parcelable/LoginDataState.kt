package com.sv053.reddit.parcelable

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginDataState (
    val login:String

): Parcelable

