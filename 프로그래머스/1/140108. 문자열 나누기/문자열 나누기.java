import java.util.*;
class Solution {
     public int solution(String s) {
        int answer = 0;
        int countX = 0;
        int countOther = 0;
        char x = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if(countX == 0 && countOther == 0) {
                x = s.charAt(i);
                countX++;
            } else {
                if (s.charAt(i) == x) {
                    countX++;
                } else {
                    countOther++;
                }
            }
            
            if (countX == countOther) {
                answer++;
                countX = 0;
                countOther = 0;
            }
        }
        
        if (countX != 0 || countOther != 0) {
            answer ++;
        }
        
        return answer;
    }
}