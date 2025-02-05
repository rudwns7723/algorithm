import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      for(var i =0; i<participant.length; i++){
          if(map.containsKey(participant[i])){
            map.put(participant[i], map.get(participant[i]) + 1);  
          }else{
            map.put(participant[i], 1);    
          }
      }
      for(var i =0; i<completion.length; i++){
          if(map.containsKey(completion[i])){
              map.put(completion[i], map.get(completion[i]) - 1);
          }
      }
        
        for (var i=0; i<map.size(); i++) {
			if(map.get(participant[i]) != 0){
                return participant[i];
            }
			
		}
        return "";
        
    }
}