//https://www.acmicpc.net/problem/15652
import java.io.BufferedWriter
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.`out`))
val st = StringTokenizer(br.readLine())
val n = st.nextToken().toInt()
val m = st.nextToken().toInt()
val result = Array<Int>(m) { 0 }
fun main(){
    select(0,0)
    bw.flush()
}
private fun select(srt:Int, idx:Int){
    for (i in srt..n-1){
        result[idx] = i+1
        if(idx+1 == m){
            result.forEach {
                bw.append("${it} ")
            }
            bw.newLine()
            continue
        }
        select(i,idx+1)
    }
}
