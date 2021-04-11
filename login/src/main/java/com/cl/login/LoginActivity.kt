package com.cl.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.alibaba.android.arouter.launcher.ARouter

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        ARouter.init(application)
        ARouter.getInstance().inject(this)
        findViewById<Button>(R.id.bt_login).setOnClickListener {
            ARouter.getInstance().build(getMode(this, "mode")).navigation()
        }
    }

    fun getMode(context: Context, fieldName: String): String? {
        val clazz = Class.forName(context.packageName + ".BuildConfig")
        val field = clazz.getField(fieldName)
        return field.get(null).toString()
    }
}