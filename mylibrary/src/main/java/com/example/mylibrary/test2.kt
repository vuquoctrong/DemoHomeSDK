package com.example.mylibrary

import android.content.Context
import com.lib.FunSDK
import com.viettel.vht.sdk.jfmanager.JFCameraManager


fun alo(context: Context){
    JFCameraManager.init(context)
    FunSDK.s_bInitNetSDK
}