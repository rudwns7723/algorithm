import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num == 0)break;
            String snum = Integer.toString(num);
            String sarr[] = snum.split("");
        
        
            if(sarr.length!=1){
                int cnt = 0;
                for(int i=0; i<sarr.length/2; i++){
                    if(sarr[i].equals(sarr[sarr.length - 1 - i]))cnt++;
                }
                if(cnt == sarr.length/2)System.out.println("yes");
                else System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
}