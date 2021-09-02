class Solution {
    fun solution(record: Array<String>): Array<String> {
        var id_nameMap = mutableMapOf<String, String>()
        var cnt = 0
        record.forEach{
            val sArr : List<String> = it.split(" ")
            if (sArr.get(0) == "Enter" || sArr.get(0) == "Change"){
                if (sArr.get(0) == "Enter") {
                    cnt++
                }
                id_nameMap.put(sArr.get(1),sArr.get(2))//넣어
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