package com.aquayer.presentation.feature.aquarium_age

import com.aquayer.R
import com.aquayer.databinding.FragmentAquariumAgeBinding
import com.aquayer.presentation.base.fragment.BindingFrag

class AquariumAgeFragment : BindingFrag<FragmentAquariumAgeBinding, AquariumAgeVM, IAquariumAgeContract.ViewModel>() {


    override val provideLayoutId = R.layout.fragment_aquarium_age
    override var provideViewModel = AquariumAgeVM::class.java


    companion object {
        fun newInstance() = AquariumAgeFragment()
    }


}