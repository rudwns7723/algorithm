import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> c = new HashMap<>();
        
        
        for(int i=0; i<array.length; i++){
            c.put(array[i], c.getOrDefault(array[i], 0) + 1);
        }
        int count = 0;
        for (Integer val : c.keySet()) {
            if(c.get(val) > count) {
                count = c.get(val);
                answer = val;
            }else if(c.get(val) == count){
                answer = -1;
            }
        }
        
        
        return answer;
    }
}