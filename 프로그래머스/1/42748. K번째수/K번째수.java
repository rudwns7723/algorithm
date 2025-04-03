import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int[] array2;
        answer = new int[commands.length];
        for(int i=0; i< commands.length; i++){
            int ed = commands[i][1];
            int st = commands[i][0];
            array2 = new int[ed - st + 1];
            
            for(int j=0; j<=ed -st; j++){
                array2[j] = array[j + st - 1];
            }
            
            Arrays.sort(array2);
            answer[i] = array2[commands[i][2] - 1];
        }
        
        return answer;
    }
}