import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        int le = 64;
        while(true){
            if(tc / le > 0){
                cnt++;
            }
            tc = tc % le;
            if(le == 1)break;
            le = le / 2;
        }
        System.out.print(cnt);
    }
}
