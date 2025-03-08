class Solution {
    public int solution(int n) {
        int answer = 0;
        String nn = Integer.toBinaryString(n); 
        String nnn = ""; 
        
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < nn.length(); i++) {            
            if (nn.charAt(i) == '1') {                
                a++;            
            }        
        }  
        while(a != b){
            c = ++n;
            nnn = Integer.toBinaryString(c); 
            b = 0;
            for (int i = 0; i < nnn.length(); i++) {            
                if (nnn.charAt(i) == '1') {                
                    b++;            
                }        
            }
            if(a == b)answer = c;
        }
        
        
        return answer;
    }
}