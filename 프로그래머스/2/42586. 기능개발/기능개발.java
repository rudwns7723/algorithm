import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> day = new LinkedList<>();
        
        for(var i=0; i<progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                day.add((100 - progresses[i]) / speeds[i]);    
            }else{
                day.add((100 - progresses[i]) / speeds[i] + 1);    
            }
        }
        var count = 1;
        var vari = day.poll();
        System.out.println("vari : " + vari);
        while(!day.isEmpty()){
            if(vari >= day.peek()){
                count++;
                day.poll();
            }else{
                list.add(count);
                count = 1;
                vari = day.poll();
            }
        }
        list.add(count);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        
        return answer;
    }
}