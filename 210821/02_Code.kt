import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.`out`))
    var n = br.readLine().toInt()
    var arr = Array<Int>(n,{0})
    for(i in 0..n-1){
        arr[i] = br.readLine().toInt()
    }
    arr.sort()
    for (i in arr){
        bw.append("$i\n")
    }
    bw.flush()
}