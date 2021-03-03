package com.aquayer.presentation.binding

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import java.util.*


class ImageViewBinding {


    @BindingAdapter("setRemoteImageView")
    fun ImageView.setupImageView(url: String) {
        Log.d("setupImageView", "url: $url")


        Glide.with(this.context)
            .load(url + "?=${UUID.randomUUID()}")
            .into(this)

    }


}