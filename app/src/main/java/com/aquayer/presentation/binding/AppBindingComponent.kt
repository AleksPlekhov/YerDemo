package com.aquayer.presentation.binding

import androidx.databinding.DataBindingComponent


class AppBindingComponent : DataBindingComponent {

    override fun getRecycleViewBinding() = RecycleViewBinding()
    override fun getTextViewBinding() = TextViewBinding()
    override fun getImageViewBinding() = ImageViewBinding()


}

