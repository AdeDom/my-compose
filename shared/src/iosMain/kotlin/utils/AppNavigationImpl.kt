package utils

class AppNavigationImpl : AppNavigation {

    override fun openWebOrDeeplink(url: String?) {
        println("AdeDom :: $url")
    }
}
