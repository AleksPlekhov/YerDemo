package com.aquayer.presentation.feature.plants_number

import com.aquayer.R
import com.aquayer.databinding.FragmentPlantsNumberBinding
import com.aquayer.presentation.base.fragment.BindingFrag

class PlantsNumberFragment : BindingFrag<FragmentPlantsNumberBinding, PlantsNumberVM, IPlantsNumberContract.ViewModel>() {


    override val provideLayoutId = R.layout.fragment_plants_number
    override var provideViewModel = PlantsNumberVM::class.java


    companion object {
        fun newInstance() = PlantsNumberFragment()
    }


}