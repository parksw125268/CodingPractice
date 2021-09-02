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
val result = Array<Int>(m,{0})
fun main(){
    select(0)
    bw.flush()
}
private fun select(idx:Int){
    for (i in 0..n-1){
        result.set(idx,i+1)
        if(idx+1 == m){
            result.forEach {
                bw.append("${it} ")
            }
            bw.newLine()
            continue
        }
        select(idx+1)
    }
}
