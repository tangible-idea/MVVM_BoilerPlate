package com.cj.mobilepos.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import com.cj.mobilepos.databinding.FragmentBaseBinding
import com.cj.mobilepos.view.BaseActivity


abstract class BaseFragment<T : ViewDataBinding, R : ViewModel> : Fragment() {
    lateinit var binding: T
    abstract val viewModel: R
    abstract val layoutResID: Int
    val baseActivity: BaseActivity<*, *>
        get() = activity as BaseActivity<*, *>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, layoutResID, container, false)

        binding.lifecycleOwner = this@BaseFragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initVariable()
        initView()
        initListener()
        initObserver()
    }

    fun onBackPressed(): Boolean {
        return false
    }

    abstract fun initVariable()
    abstract fun initListener()
    abstract fun initObserver()
    abstract fun initView()
}