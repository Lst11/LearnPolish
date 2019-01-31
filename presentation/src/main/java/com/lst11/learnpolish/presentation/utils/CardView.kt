package com.lst11.learnpolish.presentation.utils

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.lst11.learnpolish.R

class CardView(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {

    init {
        inflate(context, R.layout.card_view, this)
        val imageView: ImageView = findViewById(R.id.image)
        val textView: TextView = findViewById(R.id.caption)
        val line: ImageView = findViewById(R.id.line)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.CardView)
        imageView.setImageResource(attributes.getResourceId(R.styleable.CardView_image, 0))
        textView.text = attributes.getString(R.styleable.CardView_text)
        line.setBackgroundColor(attributes.getColor(R.styleable.CardView_lineColor, 0))
        attributes.recycle()
    }
}