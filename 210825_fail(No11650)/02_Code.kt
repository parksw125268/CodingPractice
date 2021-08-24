import java.io.BufferedWriter
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = br.readLine().toInt()
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()
    var station = 0
    for (i in 0..n-1){
        val st = StringTokenizer(br.readLine())
        list1.add(st.nextToken().toInt())
        list2.add(st.nextToken().toInt())
    }
    for (i in n - 2 downTo 1) {
        for (j in 0..i) {
            if (list1[j] > list1[j + 1]) {
                station = list1[j]
                list1[j] = list1[j + 1]
                list1[j + 1] = station

                station = list2[j]
                list2[j] = list2[j + 1]
                list2[j + 1] = station
            } else if (list1[j] == list1[j + 1]) {
                if (list2[j] > list2[j + 1]) {
                    station = list2[j]
                    list2[j] = list2[j + 1]
                    list2[j + 1] = station
                }
            }
        }
    }
    for (i in 0.. n-1){
        bw.append("${list1[i]} ${list2[i]}\n")
    }
    bw.flush()
}