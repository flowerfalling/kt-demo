fun main() {
    var a = 1
    val b = a.mLet {
        println(it)
        ++a
    }
    println(b)
}

private inline fun<I, O> I.mLet(lambda: (I) -> O) = lambda(this)