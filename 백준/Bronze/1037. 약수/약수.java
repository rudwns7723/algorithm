import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int arr[] = new int[cnt];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<cnt; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        if(arr.length % 2 == 0){
            System.out.println(arr[0] * arr[arr.length - 1]);
        }else{
            System.out.println(arr[arr.length / 2] * arr[arr.length / 2]);
        }
    }
}