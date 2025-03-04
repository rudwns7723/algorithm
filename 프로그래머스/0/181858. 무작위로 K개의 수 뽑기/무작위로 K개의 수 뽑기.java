import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        
        Set<Integer> set = new LinkedHashSet <Integer>();
        
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println("set : " + set);
        int count = 0;
        Iterator<Integer> iter = set.iterator();
        while(count < k){
            if(iter.hasNext()){
                answer[count] = iter.next();    
            }else{
                answer[count] = -1;    
            }
            count++;
        }
        
        return answer;
        }
}