package com.lst11.learnpolish.presentation.screen

import android.content.Intent
import com.lst11.learnpolish.presentation.base.BaseActivity
import com.lst11.learnpolish.presentation.base.BaseRouter


class Router(activity: BaseActivity) : BaseRouter<BaseActivity>(activity) {

    fun goToMenuItem(selectedActivity: BaseActivity) {
        val myIntent = Intent(activity, selectedActivity::class.java)
        activity.startActivity(myIntent)
    }
}