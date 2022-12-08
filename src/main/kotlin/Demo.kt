fun main() {
    val a = create {
        123
    }.map {
        "[$this]"
    }.map {
        "@@$this@@"
    }.observer {
        println(this)
    }
}

inline fun <output> create(action: () -> output) = Demo(action())

class Demo<T>(val valueItem: T)

inline fun <I, O> Demo<I>.map(mapAction: I.() -> O) = Demo(mapAction(valueItem))

inline fun <I> Demo<I>.observer(observerAction: I.() -> Unit) = observerAction(valueItem)
