import org.pytorch.Tensor
import org.pytorch.Module
import org.pytorch.IValue
import java.util.Arrays

fun main() {
    val tensor = Tensor.fromBlob(intArrayOf(1, 2, 3, 4), longArrayOf(2, 2))
    println(tensor)
    println(Arrays.toString(tensor.shape()))
}