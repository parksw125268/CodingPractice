import java.io.BufferedWriter
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(){
    val record = arrayOf<String>("Enter uid1234 Muzi", "Enter uid4567 Prodo", "Change uid1234 Psw", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan")

    val result = Solution().run {
        solution(record)
    }
    result.forEach {
        println(it)
    }

}
class Solution {
    fun solution(record: Array<String>): Array<String> {
        var id_nameMap = mutableMapOf<String, String>()
        var cnt = 0
        record.forEach{
            val sArr : List<String> = it.split(" ")
            if (sArr.get(0) == "Enter"){
                cnt++
                if (id_nameMap.containsKey(sArr.get(1))){//key가 이미 있는지
                    id_nameMap.put(sArr.get(1),sArr.get(2))//바꿔
                }else{
                    id_nameMap.put(sArr.get(1),sArr.get(2))//넣어
                }
            }else if (sArr.get(0) == "Change"){
                id_nameMap.put(sArr.get(1),sArr.get(2))//바꿔
            }else if (sArr.get(0) == "Leave"){
                cnt++
            }
        }
        var answer = Array<String>(cnt,{""})
        var idx = 0
        record.forEach{
            val sArr : List<String> = it.split(" ")
            if (sArr.get(0) == "Enter"){
                answer.set((idx),"${id_nameMap.get(sArr.get(1))}님이 들어왔습니다.")
                idx++
            }else if (sArr.get(0) == "Leave"){
                answer.set(idx,"${id_nameMap.get(sArr.get(1))}님이 나갔습니다.")
                idx++
            }
        }
        return answer
    }
}

