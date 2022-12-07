fun main() {
    val context = Context().apply5 {
        toast("success")
        toast(it)
        toast(name)
    }
    println(context.info)
}

class Context {
    val info = "info"
    val name = "demo"

    fun toast(str: String) = println("toast: $str")
}

inline fun Context.apply5(lambda: Context.(String) -> Unit): Context {
    lambda(info)
    return this
}