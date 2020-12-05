package com.example.weatherappplayground.PresentationLayer.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject
import org.koin.core.qualifier.named
import kotlin.coroutines.CoroutineContext

fun startKoin(context: Context) {
    startKoin {
        androidContext(context)
        modules(listOf())
    }
}

class CoroutineProvider : KoinComponent {
    val Main: CoroutineContext by inject(named("main"))
    val IO: CoroutineContext by inject(named("io"))
}