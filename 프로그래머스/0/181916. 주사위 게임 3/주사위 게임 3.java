import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        int[] arrvar = new int[4];
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        for(int i=0; i<4; i++){
            arrvar[i] = map.get(arr[i]);
        }
        
        int aa = 0;
        int bb = 0;
        
        if(map.containsValue(4)){
            return answer = 1111*a;
        }else if(map.containsValue(3)){
          for(int i=0; i<4; i++){
              if(arrvar[i] == 3){
                aa = arr[i];  
              } 
              else if(arrvar[i] == 1){
                  bb = arr[i];
              }
          }
          return (int)Math.pow((10 * aa + bb), 2);
        }else if(map.containsValue(2) && map.containsValue(1)){
           for(int i=0; i<4; i++){
              if(arrvar[i] == 1 && aa== 0){ 
                  aa = arr[i];
              }else if(arrvar[i] == 1){
                  return aa * arr[i];
              }
          }
        }else if(map.containsValue(2)){
           for(int i=0; i<4; i++){
              if(arrvar[i] == 2 && aa == 0){ 
                  aa = arr[i];
              }else if(arrvar[i] == 2 && arr[i] != aa){
                  return (aa + arr[i]) * (Math.abs(aa - arr[i]));
              }
          }
        }else{
            aa= 7;
            for(int i=0; i<4; i++){
                if(arr[i] < aa)    {
                    aa = arr[i];
                }
            }
            return aa;
        }
      
        
        return answer;
    }
}