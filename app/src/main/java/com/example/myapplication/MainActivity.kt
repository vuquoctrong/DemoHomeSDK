package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding
import com.lib.FunSDK
import com.viettel.vht.sdk.databinding.ActivitySdkVhomeMainBinding
import com.viettel.vht.sdk.funtionsdk.VHomeSDKLoginListener
import com.viettel.vht.sdk.funtionsdk.VHomeSDKManager
import com.viettel.vht.sdk.jfmanager.JFCameraManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var vHomeSDKManager: VHomeSDKManager
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this,R.layout.activity_main)
        test()
//        vHomeSDKManager.loginAccountVHome("0986784498","12345678aA@",object :VHomeSDKLoginListener{
//            override fun onFailed(var1: Int) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onSuccess(token: String) {
//                TODO("Not yet implemented")
//            }
//
//        })
        binding.addCamera.setOnClickListener {
            vHomeSDKManager.openAddCameraJF(this)
        }
        binding.detailCamera.setOnClickListener {
            vHomeSDKManager.openDetailCameraJF(this)
        }

    }

    fun test(){
       JFCameraManager.init(this)
    }
}