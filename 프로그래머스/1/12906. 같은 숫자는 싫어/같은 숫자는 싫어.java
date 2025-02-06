import java.util.*;

import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> st = new Stack<>();
        for(int a : arr){
            if(st.size()==0){
                st.push(a);
            }else{
                if(st.peek() == a){ 
                    continue;
                }
                else st.add(a);
            }
        }
        int[] answer = new int[st.size()];
        for(int i=answer.length -1; i>=0; i--){
            answer[i] = st.pop();
        }

        return answer;
    }
}