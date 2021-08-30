import java.io.BufferedWriter
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

val resultMutableList = mutableListOf<Int>()
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.`out`))
val st = StringTokenizer(br.readLine())
val n = st.nextToken().toInt()
val m = st.nextToken().toInt()
fun main(){
    val mutableList = mutableListOf<Int>()
    for (i in 0..m-1)
        resultMutableList.add(i,0)
    for (i in 0..n-1)
        mutableList.add(i,i+1)
    select(mutableList ,0)
}
fun select(mList: MutableList<Int>,  idx : Int){
    for (i in 0..mList.size-1){
        //고르기==========================
        resultMutableList.set(idx,mList.get(i))
        //빼기============================
        val k = mList.get(i)
        mList.removeAt(i)
        val newList = mutableListOf<Int>()
        for (j in 0..mList.size-1)
            newList.add(j,mList.get(j))
        mList.add(i,k)
        //Check====================
        if(m == idx+1){
            //Print
            for (i in 0..resultMutableList.size-1){
                bw.append("${resultMutableList.get(i)} ")
            }
            bw.newLine()
            continue
        }
        select(newList, idx+1)
    }
    bw.flush()
}

