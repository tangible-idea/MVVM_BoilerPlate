package com.cj.mobilepos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.cj.mobilepos.R
import com.cj.mobilepos.databinding.ActivityMainBinding
import com.cj.mobilepos.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(){

    override val viewModel by viewModels<MainViewModel>()
    override val layoutResID: Int = R.layout.activity_main

    override fun initVariable() {
        binding.viewModel = viewModel
    }

    override fun initView() {
    }

    override fun initObserver() {
    }

    override fun initListener() {
        with(binding){
//            btnRoom.setOnClickListener {
//                val intent = Intent(this@MainActivity, RoomActivity::class.java)
//                startActivity(intent)
//
//            }
//            btnBle.setOnClickListener {
//                val intent = Intent(this@MainActivity, BleActivity::class.java)
//                startActivity(intent)
//            }
        }
    }

}