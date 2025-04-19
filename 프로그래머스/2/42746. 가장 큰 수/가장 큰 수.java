import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(); 
        
        String[] st = new String[numbers.length];
        for(int i=0; i< numbers.length; i++){
            st[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(st, (a, b) -> (b + a).compareTo(a + b)); 

        
        if (st[0].equals("0")) {
            return "0";
        }

        Arrays.stream(st)
                .forEach(sb::append);

        return sb.toString();
    }
}