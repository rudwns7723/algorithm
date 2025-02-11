class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int video_lenI = Integer.parseInt(video_len.replace(":",""));
        int startposI = Integer.parseInt(pos.replace(":",""));
        int posI = Integer.parseInt(pos.replace(":",""));
        int op_startI = Integer.parseInt(op_start.replace(":",""));
        int op_endI = Integer.parseInt(op_end.replace(":",""));
        
        for(String com : commands){
            if(com.equals("next")){
                posI += 10;
                if(op_startI <= startposI && startposI <= op_endI)posI = op_endI + 10;
                if(posI % 100 >= 60)posI += 40;
                if(op_startI <= posI && posI <= op_endI)posI = op_endI;
            }else{
                posI -= 10;
                if(op_startI <= startposI && startposI <= op_endI)posI = op_endI - 10;
                if(posI % 100 >= 60)posI -= 40;
                if(op_startI <= posI && posI <= op_endI)posI = op_endI;
            }
            if(posI < 0)posI = 0;  
            if(posI > video_lenI)posI = video_lenI;
            startposI = posI;
        }
        
        if(posI / 100 < 10){
            answer += ("0" + posI / 100);
        }else{
            answer +=  String.valueOf(posI / 100);
        }
        answer += ":";
        if(posI % 100 < 10){
            answer += ("0" + posI % 100);
        }else{
            answer +=  String.valueOf(posI % 100);
        }
        return answer;
    }
}