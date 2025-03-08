class Solution {
    public int[][] solution(int[][] arr) {
        int a = arr.length;
        int b = arr[0].length;
        int c = Math.max(a,b);
        
        int[][] answer = new int[c][c];
        System.out.println("a : " + a);
        System.out.println("b : " + a);
        if(a > b || a<b){
             for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    answer[i][j] = arr[i][j];
                }   
            }    
        }else{
            answer = arr;
        }
        
        
        return answer;
    }
}