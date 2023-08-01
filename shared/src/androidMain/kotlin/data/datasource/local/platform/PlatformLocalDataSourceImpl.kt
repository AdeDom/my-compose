package data.datasource.local.platform

class PlatformLocalDataSourceImpl : PlatformLocalDataSource {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}
