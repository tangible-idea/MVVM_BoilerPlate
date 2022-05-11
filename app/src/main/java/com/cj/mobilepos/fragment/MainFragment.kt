package com.cj.mobilepos.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.cj.mobilepos.R
import com.cj.mobilepos.databinding.FragmentMainBinding
import com.cj.mobilepos.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {
    override val viewModel by activityViewModels<MainViewModel>()
    override val layoutResID: Int = R.layout.fragment_main

    override fun initVariable() {
        binding.viewModel = viewModel
    }
    override fun initView() {
        with(binding) {
        }
    }

    override fun initListener() {

    }

    override fun initObserver() {

    }
}