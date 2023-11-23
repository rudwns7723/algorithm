import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int chk = 0;
        int a = 666;
        
        
        while(true){
            String aa = String.valueOf(a);
            if(aa.contains("666")){
                chk++;
            }
            if(chk == tc)break;
            a++;
        }
        System.out.println(a);
    }
}