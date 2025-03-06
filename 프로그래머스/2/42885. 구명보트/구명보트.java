import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int a = 0;
        
        for (int i = people.length - 1; i >= a; i--) {
            if (people[i] + people[a] <= limit) {
                a++;
            }
            answer++;
        }

        return answer;
    }
}