import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> a = new ArrayList<>();
        for(int i=0; i<ingredient.length; i++){
            a.add(ingredient[i]);
            while(a.size() >= 4){
                int size = a.size();
                if(!(a.get(size - 1) == 1 
                     && a.get(size - 2 ) == 3 
                     && a.get(size - 3) == 2 
                     && a.get(size - 4) == 1)) break;
                for(int j=0; j<4; j++){
                    a.remove(a.size() - 1);
                }
                answer++;
            }
        }
        return answer;
    }
}