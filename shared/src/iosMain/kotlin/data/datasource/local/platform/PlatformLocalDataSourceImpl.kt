package data.datasource.local.platform

import platform.UIKit.UIDevice

class PlatformLocalDataSourceImpl : PlatformLocalDataSource {
    override val name: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}
