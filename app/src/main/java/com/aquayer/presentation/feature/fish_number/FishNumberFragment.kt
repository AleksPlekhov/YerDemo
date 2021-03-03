package com.aquayer.presentation.feature.fish_number

import com.aquayer.R
import com.aquayer.databinding.FragmentFishNumberBinding
import com.aquayer.presentation.base.fragment.BindingFrag

class FishNumberFragment : BindingFrag<FragmentFishNumberBinding, FishNumberVM, IFishNumberContract.ViewModel>() {


    override val provideLayoutId = R.layout.fragment_fish_number
    override var provideViewModel = FishNumberVM::class.java


    companion object {
        fun newInstance() = FishNumberFragment()
    }


}