package com.example.weatherappplayground.PresentationLayer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.weatherappplayground.R

class DailyWeatherFragment : Fragment(R.layout.fragment_daily_weather) {

    companion object {
        fun build(): DailyWeatherFragment {
            return  DailyWeatherFragment()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}