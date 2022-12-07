fun main() {
    println(show(Demo.F4("demo")))
}

fun show(demo: Demo): String =
    when (demo) {
        is Demo.F1 -> "fxxk"
        is Demo.F2 -> "寄"
        is Demo.F3 -> "ok"
        is Demo.F4 -> "good, name is ${demo.name}"
    }


sealed class Demo {
    object F1 : Demo()
    object F2 : Demo()
    object F3 : Demo()
    class F4(val name: String) : Demo()
}