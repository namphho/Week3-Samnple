package com.example.week3samnple

import android.view.View
import androidx.databinding.BindingAdapter

/**
 * Created by nampham on 4/9/21.
 */

@BindingAdapter("paddingHorizontal")
fun setHorizontalPadding(view : View, padding : Int){
    view.setPadding(padding, view.paddingTop, padding, view.paddingBottom)
}

@BindingAdapter("paddingVertical")
fun setVerticalPadding(view : View, padding : Int){
    view.setPadding(view.paddingLeft, padding , view.paddingRight, padding)
}