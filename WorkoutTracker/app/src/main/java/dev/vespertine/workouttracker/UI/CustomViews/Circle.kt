package dev.vespertine.workouttracker.UI.CustomViews

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import android.view.animation.Animation

class Circle(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private val paint: Paint
    private val rect: RectF

    var angle: Float = 360F

    init {

        val strokeWidth = 30

        paint = Paint()
        paint.isAntiAlias = true
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = strokeWidth.toFloat()
        //Circle color
        paint.color = Color.RED

        rect = RectF()
    }




    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val height = (height / 2.0).toFloat()
        val width = (width / 2.0).toFloat()

        var size: Float
        if (height < width) {
            size = height
        } else {
            size = width
        }

        size -= paint.strokeWidth

        rect.set(width - size, height - size, width + size, height + size)

        canvas.drawArc(rect, START_ANGLE_POINT.toFloat(), angle, false, paint)

    }


    companion object {

        private val START_ANGLE_POINT = 90
    }
}