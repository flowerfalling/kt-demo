fun main() {
    123 go 1 go 2 go 3
}

private infix fun <C1, C2> C1.go(c2: C2): C1 {
    println("$this, $c2")
    return this
}