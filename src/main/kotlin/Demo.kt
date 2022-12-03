fun main() {
    demo("hello") {
        println(it)
    }
}

fun demo(str: String, func: (String) -> Unit) {
    func(str)
}

fun show(str: String) {
    println(str)
}