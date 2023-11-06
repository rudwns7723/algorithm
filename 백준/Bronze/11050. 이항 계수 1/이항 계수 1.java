import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        int a1 = 1;
        int a2 = 1;
        
        for(int i=0; i<num2; i++){
            a1 *= (num1 - i);
            a2 *= (i + 1);
        }
        
        
        System.out.println(a1 / a2);        
        
      
        
    }
}