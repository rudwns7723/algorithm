import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        for (Integer key: map.keySet()) {
			list.add(map.get(key));
		}
        Collections.sort(list, Collections.reverseOrder());
        int count = 0;
        for(int i=0; i<list.size(); i++){
            count += list.get(i);
            answer++;
            if(k <= count)return answer;
        }
        
        return answer;
    }
}