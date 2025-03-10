import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] r = new int[rank.length];
        int a=0;
        
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                r[i] = rank[i];
            }else{
                rank[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(rank);
        System.out.println(r[0]);
        System.out.println(r[1]);
        System.out.println(r[2]);
        
        for(int i=0; i<r.length; i++){
            if(rank[0] == r[i]){
                answer += i * 10000 ;
            }else if(rank[1] == r[i]){
                answer += i * 100 ;
            }else if(rank[2] == r[i]){
                answer += i;
            }
        }
        
        return answer;
    }
}