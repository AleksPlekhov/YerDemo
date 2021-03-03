package com.aquayer.presentation.feature.plants_kind

import com.aquayer.R
import com.aquayer.databinding.FragmentPlantsKindBinding
import com.aquayer.presentation.base.fragment.BindingFrag

class PlantsKindFragment : BindingFrag<FragmentPlantsKindBinding, PlantsKindVM, IPlantsKindContract.ViewModel>() {


    override val provideLayoutId = R.layout.fragment_plants_kind
    override var provideViewModel = PlantsKindVM::class.java


    companion object {
        fun newInstance() = PlantsKindFragment()
    }


}