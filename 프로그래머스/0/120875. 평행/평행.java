class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
	    double a = 0;
        double b = 0;
        for(int i=0; i<dots.length; i++){
           for(int j=0; j<dots.length; j++){
              if(i != j && 3-i != j && 3-j != i){
            a = (double)(dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
            b = (double)(dots[3-i][1] - dots[3-j][1]) / (dots[3-i][0] - dots[3-j][0]);   
            if(a == b){
                answer++;
            }
            }
           }
        }
        
        if(answer > 0)answer = 1;
        return answer;
    }
}