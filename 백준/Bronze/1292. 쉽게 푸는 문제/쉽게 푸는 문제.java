import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0, k = 1; i<1000; i++){
            for(int j=1; j<=i+1; j++){
                arr.add(k);
            }
            k++;
        }
        
        int sum = 0;
        for(int i=a-1; i<=b-1; i++){
            sum += arr.get(i);
        }
        System.out.println(sum);
        
      
        
    }
}