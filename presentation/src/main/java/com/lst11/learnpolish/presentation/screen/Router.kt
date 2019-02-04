package com.lst11.learnpolish.presentation.screen

import android.app.Activity
import android.content.Intent
import com.lst11.learnpolish.presentation.base.BaseRouter


class Router(activity: HomeActivity) : BaseRouter<HomeActivity>(activity) {

    fun goToMenuItem(selectedActivity: Activity) {
        val myIntent = Intent(activity, selectedActivity::class.java)
        activity.startActivity(myIntent)
    }
}