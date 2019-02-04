package com.lst11.learnpolish.presentation.utils

import android.content.Context
import android.graphics.*
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.view.View
import com.lst11.learnpolish.R


class CustomProgressBar(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var amount: Int = 360
    private var progress: Int = 90


    private val paintPrimary = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paintPrimaryDark = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paintFont = Paint(Paint.ANTI_ALIAS_FLAG)
    private val fontSize: Float = 40F

    init {
        val attributes = context.obtainStyledAttributes(attrs, R.styleable.CustomProgressBar)
        amount = attributes.getResourceId(R.styleable.CustomProgressBar_amount, 0)
        progress = attributes.getResourceId(R.styleable.CustomProgressBar_progress, 0)
        paintPrimary.color = ContextCompat.getColor(context, R.color.colorPrimary)
        paintPrimaryDark.color = ContextCompat.getColor(context, R.color.colorPrimaryDark)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        drawText(canvas)
        drawScale(canvas)
//        drawCircle(canvas)
    }

    private fun drawScale(canvas: Canvas) {
        paintPrimaryDark.style = Paint.Style.STROKE
        paintPrimaryDark.strokeWidth = 3f
        paintPrimary.style = Paint.Style.STROKE
        paintPrimary.strokeWidth = 3f

        val radius = Math.min(width / 2, height / 2).toFloat()
        val xLine = (width / 2).toFloat()
        val yStartLine = radius * 0.2f
        var yEndLine = radius * 0f
        val step = (360 / 24).toFloat()

        canvas.save()

        val stepsDark = (360 / 360 * 90) / step

        canvas.drawLine(xLine, yStartLine, xLine, yEndLine, paintPrimaryDark)

        for (i in 1 until 24) {
            if (i % 4 == 0) {
                yEndLine = radius * 0f
            } else yEndLine = radius * 0.1f

            canvas.rotate(step, (width / 2).toFloat(), (height / 2).toFloat())
            if (i < stepsDark) {
                canvas.drawLine(xLine, yStartLine, xLine, yEndLine, paintPrimaryDark)
            } else canvas.drawLine(xLine, yStartLine, xLine, yEndLine, paintPrimary)
        }
        canvas.restore() //change rotate to canvas.save
    }

    private fun drawText(canvas: Canvas) {
        val processPercent = (90f / 360 * 100)
        val text = "${processPercent.toInt()}%"
        paintFont.textSize = fontSize
        paintFont.style = Paint.Style.STROKE
        paintFont.color = Color.GRAY

        val textBoundRect = Rect()
        paintFont.getTextBounds(text, 0, text.length, textBoundRect)
        val textWidth = paintFont.measureText(text)
        val textHeight = textBoundRect.height().toFloat()
        val centerX = width / 2
        val centerY = height / 2

        canvas.drawText(text, centerX - (textWidth / 2f), centerY + (textHeight / 2f), paintFont)
    }

    private fun drawCircle(canvas: Canvas) {
        val centerX = width / 2
        val centerY = height / 2

        val radius = Math.min(width / 2, height / 2).toFloat()
        val oval = RectF()
        oval.set(centerX - radius,
                centerY - radius,
                centerX + radius,
                centerY + radius)

        paintPrimaryDark.style = Paint.Style.STROKE
        canvas.drawArc(oval, 45f, 270f, false, paintPrimaryDark)
    }
}