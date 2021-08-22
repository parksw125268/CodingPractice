import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

//https://www.acmicpc.net/problem/1427

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val str = br.readLine()
    var arr = Array<Int>(10,{0})//카운팅 정렬용
    for (i in 0..str.length-1){
        arr[str.substring(i,i+1).toInt()]++
    }
    for (i in 9 downTo 0){
        for (j in 0..arr[i]-1){
            bw.append("$i")
        }
    }
    bw.flush()
}