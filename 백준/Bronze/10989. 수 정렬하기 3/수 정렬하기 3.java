import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[10001];
        
        for(int i=0; i<num; i++){
            arr[Integer.parseInt(br.readLine())] += 1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)continue;
            else{
                for(int j=0; j<arr[i]; j++){
                    sb.append(i).append('\n');
                }
            }
        }
        System.out.println(sb);
        
        
    }
}