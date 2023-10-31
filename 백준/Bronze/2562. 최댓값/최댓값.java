import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int val = 0;
        int idx = 0;
        int max = 0;
        for(int i=0; i<9; i++){
            val = in.nextInt();
            if(max < val){
                max = val;
                idx = i + 1;
            }
        }
        in.close();
        System.out.println(max);
        System.out.print(idx);
    }
}