import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

 //https://www.acmicpc.net/problem/10989

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.`out`))
    var n = br.readLine().toInt()
    var arr = Array<Int>(10001,{0})

    //try with Counting sort
    repeat (n){
        arr[br.readLine().toInt()]++
    }
    for (i in 0..arr.size-1){
        repeat(arr[i]){
            bw.append("$i\n")
        }
    }
    bw.flush()
}