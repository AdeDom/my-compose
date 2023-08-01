package utils

import di.greetingModule
import di.iosModule
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(
            iosModule,
            greetingModule
        )
    }
}
