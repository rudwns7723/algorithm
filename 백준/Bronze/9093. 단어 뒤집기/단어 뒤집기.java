import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tc = Integer.parseInt(br.readLine());//테스트 케이스
        StringBuilder ans = new StringBuilder();
        
        for(int i=0; i<tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                StringBuilder sb = new StringBuilder(st.nextToken());
                ans.append(sb.reverse() + " ");
            }
            ans.append('\n');
        }
        System.out.println(ans);
    }
}