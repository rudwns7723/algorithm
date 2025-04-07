class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        int n = board.length;
        int[] aa= {0, -1, 1, 0};
        int[] bb= {-1, 0, 0, 1};
        for(int i=0; i<4; i++){
            int a = h + bb[i];
            int b = w + aa[i];
            if(a >= 0 && a < n && b >= 0 && b < n){
                String color1 = board[a][b];
                if(color.equals(color1)){
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}