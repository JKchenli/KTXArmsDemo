package com.cl.core.base

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author Chenli
 * @Date 2021/3/29
 * @Description
 */
open class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        ARouter.init(this)
        initApp()
    }

    open fun initApp() {
    }
}