package view.extensions

actual fun String.appColor(): Int {
    return android.graphics.Color.parseColor(this)
}
