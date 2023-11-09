import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = new String[5];
        int max = 0;//제일긴 문자열 길이
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<5; i++){
            arr[i] = br.readLine();
            if(arr[i].length() > max)max = arr[i].length();
        }
        
        
        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++){
                if(arr[j].length() > i){
                    sb.append(arr[j].charAt(i));   
                }
            }
        }
        System.out.println(sb);
    }
}