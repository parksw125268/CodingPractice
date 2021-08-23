import java.io.BufferedWriter
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var s = br.readLine()
    var cnt = 0

    for (i in 0..s.length-1){
        if (s.get(i) == 'c' && i != s.length-1 && (s.get(i+1) == '=' || s.get(i+1) == '-')) {
            cnt--
        }else if (s.get(i) == 'l' && i != s.length-1 && s.get(i+1) == 'j') {
            cnt--
        }else if (s.get(i) == 'n' && i != s.length-1 && s.get(i+1) == 'j') {
            cnt--
        }else if (s.get(i) == 's' && i != s.length-1 && s.get(i+1) == '=') {
            cnt--
        }else if (s.get(i) == 'z' && i != s.length-1 && s.get(i+1) == '=') {
            cnt--
        }else if (s.get(i) == 'd' && i != s.length-1 && s.get(i+1) == '-') {
            cnt--
        }else if (s.get(i) == 'd' &&  i < s.length-2 && s.get(i+1) == 'z' && s.get(i+2) == '=') {
            cnt--
        }
        cnt++
    }
    bw.append(cnt.toString())
    bw.flush()
}