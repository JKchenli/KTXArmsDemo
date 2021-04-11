package com.cl.core.base

import android.app.Application

/**
 * @author Chenli
 * @Date 2021/3/29
 * @Description
 */
abstract class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        init()
    }

    abstract fun init()

}