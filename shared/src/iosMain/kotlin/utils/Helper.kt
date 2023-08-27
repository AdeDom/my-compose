package utils

import di.champModule
import di.commonModule
import di.greetingModule
import di.iosModule
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(
            commonModule,
            iosModule,
            greetingModule,
            champModule
        )
    }
}
