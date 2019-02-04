package com.lst11.learnpolish.presentation.utils

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import com.lst11.learnpolish.R

class TopBarView(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {

    init {
        inflate(context, R.layout.top_bar_view, this)

        val buttonBack: ImageView = findViewById(R.id.buttonBack)
        val buttonSettings: ImageView = findViewById(R.id.buttonSettings)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.TopBarView)
        if (attributes.getBoolean(R.styleable.TopBarView_visibilityButtonBack, false)) buttonBack.visibility = View.VISIBLE
        else buttonBack.visibility = View.INVISIBLE
        if (attributes.getBoolean(R.styleable.TopBarView_visibilityButtonSettings, false)) buttonSettings.visibility = View.VISIBLE
        else buttonSettings.visibility = View.INVISIBLE
        attributes.recycle()
    }
}