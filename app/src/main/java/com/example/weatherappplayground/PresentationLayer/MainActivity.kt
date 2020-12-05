package com.example.weatherappplayground.PresentationLayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.weatherappplayground.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragmentOnTop(DailyWeatherFragment.build())

    }

    /**
     * Replace a fragment on top of the current stack
     */
    fun replaceFragmentOnTop(
        fragment: Fragment,
        openFragmentAnimation: OpenFragmentAnimation? = null
    ) {
        supportFragmentManager
            .beginTransaction().apply {
                when (openFragmentAnimation) {
                    OpenFragmentAnimation.SLIDE_FROM_BOTTOM -> setCustomAnimations(
                        R.anim.slide_top_in, R.anim.slide_bottom_out,
                        R.anim.slide_bottom_in, R.anim.slide_top_out
                    )
                    OpenFragmentAnimation.SLIDE_FROM_RIGHT -> setCustomAnimations(
                        R.anim.slide_right_in, R.anim.slide_left_out,
                        R.anim.slide_left_in, R.anim.slide_right_out
                    )
                    OpenFragmentAnimation.SLIDE_FROM_LEFT -> setCustomAnimations(
                        R.anim.slide_left_in, R.anim.slide_right_out,
                        R.anim.slide_right_in, R.anim.slide_left_out
                    )
                    OpenFragmentAnimation.SLIDE_FROM_TOP -> setCustomAnimations(
                        R.anim.slide_bottom_in, R.anim.slide_top_out,
                        R.anim.slide_top_in, R.anim.slide_bottom_out
                    )
                }
            }
            .replace(R.id.flMain, fragment)
            .addToBackStack(null)
            .commitAllowingStateLoss()
    }

}

enum class OpenFragmentAnimation {
    SLIDE_FROM_BOTTOM, SLIDE_FROM_RIGHT, SLIDE_FROM_LEFT, SLIDE_FROM_TOP
}