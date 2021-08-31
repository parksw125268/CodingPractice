import org.omg.CORBA.INTERNAL
import java.io.BufferedWriter
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val st = StringTokenizer(br.readLine())
val n = st.nextToken().toInt()
val m = st.nextToken().toInt()
val resultArr = Array<Int>(m,{0})

fun main(){

    val mutableList = mutableListOf<Int>()
    for (i in 0..n-1){
        mutableList.add(i,i+1)
    }
    select1(mutableList ,0)
}
fun select1(mList: MutableList<Int>, idx : Int){
         for (i in 0..mList.size-1){
        //골라
        resultArr[idx]=mList[i]
        //빼
        val k = mList.get(i)
        val newList = mutableListOf<Int>()
        for (j in i+1..mList.size-1){
            newList.add(j-(i+1),mList.get(j))
        }
        //조건체크
        if (idx+1 == m){
            resultArr.forEach {
                print("${it} ")
            }
            println()
            continue
        }
        select1(newList,idx+1)
    }
}


