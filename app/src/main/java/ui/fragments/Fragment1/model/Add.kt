package com.example.homework_recyclerview

import androidx.annotation.DrawableRes
import ui.fragments.Fragment1.model.Parent

data class Add1(
    val text: String,
    @DrawableRes val flag: Int
): Parent
