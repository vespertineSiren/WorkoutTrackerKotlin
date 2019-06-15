package dev.vespertine.workouttracker.UI.Animations

import android.view.animation.Animation
import android.view.animation.Transformation
import dev.vespertine.workouttracker.UI.CustomViews.Circle

class CircleAngleAnimation(private val circle: Circle, angleIncrement: Int) : Animation() {

    var oldAngle: Float = 0.toFloat()
    var newAngle: Float = 0.toFloat()
    private val angleIncrement: Float


    init {
        this.oldAngle = circle.angle
        this.newAngle = circle.angle
        this.angleIncrement = angleIncrement.toFloat()
    }

    override fun applyTransformation(interpolatedTime: Float, transformation: Transformation) {
        val angle = oldAngle + (newAngle - oldAngle) * interpolatedTime

        circle.angle = angle


        //     oldAngle = angle;
        circle.requestLayout()


    }

    fun incremenet(toincrease: Float) {
        this.newAngle += toincrease
    }


}

