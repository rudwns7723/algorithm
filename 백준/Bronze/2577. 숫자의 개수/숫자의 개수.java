import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int var = 1;
        for(int i=0; i<3; i++){
            var *= in.nextInt();
        }
        
        String[] a = String.valueOf(var).split("");
        int b[] = new int[10];
        
        for(int i=0; i<a.length; i++){
            b[Integer.valueOf(a[i])] = b[Integer.valueOf(a[i])] + 1;
        }
        
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
            
    }
}