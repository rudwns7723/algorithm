import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();
        in.close();
         if(min > max){
            int var = 0;
            var = min;
            min = max;
            max = var;
        }
        int mi = 0;//최소공배수
        int ma = 0;//최대공약수
        
        for(int i=min; i>0; i--){
            if(min%i == 0 && max%i == 0){
                ma = i;
                mi = i * (min/i) * (max/i);
                break;
            }
        }
        System.out.println(ma);
        System.out.println(mi);
        
    }
}