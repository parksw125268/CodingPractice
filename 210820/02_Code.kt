import java.io.*
import java.util.*

fun main(){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.`out`))
    var n = br.readLine().toInt()
    var arr = IntArray(n)
    var a = 0
    for (i in 0..n-1){
        arr[i] = br.readLine().toInt()
    }
    //버블 정렬
    for (i in n-2 downTo 0){
        for (j in 0..i){ //제일 큰 수 를 맨 마지막으로 보냄.
            if (arr[j] > arr[j+1]){
                a= arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=a
            }
        }
    }
    for (i in 0..n-1)
        bw.append(arr[i].toString()+"\n")
    bw.flush()
}