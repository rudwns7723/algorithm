import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int i=0; i<lines.length; i++){
            for(int j = lines[i][0]; j<lines[i][1]; j++){
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }
        
        for(Integer v : map.values()){
            if(v >= 2) answer++;
        }
        
        return answer;
    }
}