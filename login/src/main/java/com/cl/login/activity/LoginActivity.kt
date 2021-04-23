package com.cl.login.activity

import android.content.Context
import android.widget.Toast
import com.cl.core.base.BaseActivity

class LoginActivity : BaseActivity() {

    override fun initUI() {
        Toast.makeText(this, packageName,
                Toast.LENGTH_LONG).show();
    }

}