package com.lst11.learnpolish.presentation.utils

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.lst11.learnpolish.R
import android.view.LayoutInflater
import com.lst11.learnpolish.databinding.TopBarViewBinding
import com.lst11.learnpolish.presentation.base.BaseViewModel
import com.lst11.learnpolish.presentation.screen.Router


class TopBarView(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {

    private val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    private val binding = TopBarViewBinding.inflate(inflater)

    init {
        inflate(context, R.layout.top_bar_view, this)

        val buttonBack: ImageView = findViewById(R.id.buttonBack)
        val buttonSettings: ImageView = findViewById(R.id.buttonSettings)
        val name: TextView = findViewById(R.id.nameTextView)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.TopBarView)
        if (attributes.getBoolean(R.styleable.TopBarView_visibilityButtonBack, false)) buttonBack.visibility = View.VISIBLE
        else buttonBack.visibility = View.INVISIBLE
        if (attributes.getBoolean(R.styleable.TopBarView_visibilityButtonSettings, false)) buttonSettings.visibility = View.VISIBLE
        else buttonSettings.visibility = View.INVISIBLE
        name.text = attributes.getText(R.styleable.TopBarView_textName)
        attributes.recycle()

        buttonBack.setOnClickListener {
            binding.viewModel?.onClickBack()
        }
    }

    fun setViewModel(viewModel: BaseViewModel<Router>) {
        Log.e("aaa","TopBarView setViewModel ${viewModel.javaClass}")
        binding.viewModel = viewModel
    }
}