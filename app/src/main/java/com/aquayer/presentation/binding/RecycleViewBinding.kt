package com.aquayer.presentation.binding

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecycleViewBinding {


    @BindingAdapter("setupRecyclerView")
    fun RecyclerView.setupGridView(hasFixedSize: Boolean) {
        setHasFixedSize(hasFixedSize)
        layoutManager = LinearLayoutManager(context)
    }


}