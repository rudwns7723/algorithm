class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<timelogs.length; i++){
            count = 0;
            for(int j=0; j<timelogs[0].length; j++){
                int hour = schedules[i] / 100;
                int minute = schedules[i] % 100;
                int savetime = hour * 100 + (minute + 10);
                if(savetime % 100 >= 60)savetime += 40;
                if(timelogs[i][j] <= savetime && startday < 6){
                    count++;
                }
                startday++;
                if(startday > 7)startday = 1;
            }
            if(count == 5)answer++;
        }
        return answer;
    }
}
