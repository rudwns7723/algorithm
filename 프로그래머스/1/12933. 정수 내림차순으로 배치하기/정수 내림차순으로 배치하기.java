import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        String nn = "" + n;
        String[] a = nn.split("");
        Arrays.sort(a);
        for(int i=a.length -1; i>=0; i--){
            answer += a[i];
        }
        return Long.parseLong(answer);
    }
}