import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int m = in.nextInt();//올라가는 길이
        int n = in.nextInt();//떨어지는 길이
        int h = in.nextInt();//총 높이
        int th = m - n;//하루 올라가는 높이
        int d = 0; //걸린 날짜
        if(m>=h){
            System.out.println('1');
        }else{
            if((h-m)%(th) > 0){
                d = (h-m)/(th) + 2;
            }else{
                d = (h-m)/(th) + 1;
            }
            System.out.println(d);    
        }
        
        
    }
}