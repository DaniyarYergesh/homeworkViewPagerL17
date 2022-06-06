package com.example.homework_recyclerview

import androidx.annotation.DrawableRes
import ui.fragments.Fragment1.model.Parent

data class Currency(
    var text: Int,
    val type: String,
    @DrawableRes val flag: Int,
    val course: Int
): Parent