fun main() {
    val data1 = Demo1(1)
    val data2 = Demo1(1)
    val demo1 = Demo()
    val demo2 = Demo()
    println(data1 == data2)
    println(demo1 == demo2)
}

data class Demo1(var num: Int)

class Demo