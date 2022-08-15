package com.ansela.skincareproject.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class SkincareData(
    var nama: String = "",
    var harga: String = "",
    var manfaat: String = "",
    var photo: Int = 0,
) : Parcelable


