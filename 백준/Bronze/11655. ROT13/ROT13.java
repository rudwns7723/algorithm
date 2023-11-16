import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        
        for(int j=0; j<a.length(); j++){
            char c = a.charAt(j);
            if(c >='a' && c<='z'){
                if(c + 13 > 'z')c = (char)(c - 13);
                else c = (char)(c + 13);
            }else if(c>='A' && c<='Z'){
                if(c + 13 > 'Z')c = (char)(c - 13);
                else c = (char)(c + 13);
            }
            sb.append(c);
        }
        
        
        System.out.println(sb);
    }
}