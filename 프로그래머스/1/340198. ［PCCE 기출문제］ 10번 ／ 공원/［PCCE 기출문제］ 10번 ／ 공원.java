import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int ga = 0;
        int count = 0;
        Arrays.sort(mats);
        for(int k=0; k<mats.length; k++){
            for(int i=0; i<park.length - mats[k] + 1; i++){
                for(int j=0; j<park[0].length - mats[k] + 1; j++){
                    count = 0;
                    for(int l=0; l<mats[k]; l++){
                         for(int m=0; m<mats[k]; m++){
                            if(park[i + l][j + m].equals("-1"))count++;
                            else continue;
                        }
                    }
                    if(count == mats[k] * mats[k] && mats[k] >= answer) answer = mats[k];
                }
            }    
        }
        
        return answer;
    }
}