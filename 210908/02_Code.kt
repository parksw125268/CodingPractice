//https://www.acmicpc.net/problem/1003
import java.io.BufferedWriter
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    var n = br.readLine().toInt()
    val arr1 = Array<Int>(n,{-1})
    var max = 0
    for (i in 0 until n) {
        arr1[i] = br.readLine().toInt()
        if (i == 0) {
            max = arr1[0]
        } else {
            if (arr1[i] > max) {
                max = arr1[i]
            }
        }
    }
    val arr2 = Array<Int>(max+1,{-1}) //피보나치 수열 배열
    arr2[0] = 0
    if (max>0){
        arr2[1] = 1
        for (i in 2 until arr2.size){ //피보나치 수열 세팅
            arr2[i]=arr2[i-1]+arr2[i-2]
        }
    }
    //출력
    arr1.forEach {
        when (it) {
            0 -> {
                bw.append("1 0\n")
            }
            1 -> {
                bw.append("0 1\n")
            }
            else -> {
                bw.append("${arr2[it-1]} ${arr2[it]}\n")
            }
        }
    }
    bw.flush()
}