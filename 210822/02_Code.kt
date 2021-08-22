import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.round

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val n = br.readLine().toInt()
    var arr = Array<Int>(n,{0})
    var answer = 0
    for (i in 0..n-1)
        arr[i] = br.readLine().toInt()
    //-4000 ~ 4000 이니깐 총 8001개의 숫자의 범위이므로 카운팅정렬을 이용해서 오름차순으로 일단 정렬해보자
    var range1 = Array<Int>(8001,{0}) //0~8000
    for (i in arr)
        range1[i+4000]++ //범위가 -4000부터 시작이므로 +4000해준다.
    var idx = 0
    for (i in 0..range1.size-1){
        for (j in 0..range1[i]-1){
            arr[idx]=i-4000 //아까 +4000해줬으니 원래 배열에 넣을때는 -4000
            idx++
        }
    }
    /////
    /*for (i in arr){
        bw.append("$i\n")
    }
    bw.flush()  */

    //산술평균
    for (i in arr)
        answer += i
    answer = round(answer/n.toDouble()).toInt()
    bw.append("$answer\n")
    //중앙값
    answer = arr[(n-1)/2]
    bw.append("$answer\n")
    //최빈값
    var max = 0
    for (i in 0..range1.size-1){
        if (i == 0)
            max= range1[0]
        else{
            if (range1[i]>max)
                max = range1[i]
        }
    }
    var cnt = 0 //--두번째로 작은 값 찾기
    for (i in 0..range1.size-1){
        if (range1[i] == max){
            cnt++
            idx= i
        }
        if (cnt == 2){
            idx= i
            break
        }
    }
    answer = idx-4000
    bw.append("$answer\n")
    //범위
    var min = 0
    for (i in 0..range1.size-1){
        if( range1[i] !=0 ){
            min = i-4000
            break
        }
    }
    for (i in range1.size-1 downTo 0){
        if( range1[i] !=0 ){
            max = i-4000
            break
        }
    }
    answer = max - min
    bw.append("$answer\n")

    bw.flush()



}