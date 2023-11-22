import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int arr[][] = new int[tc][2];
        for(int i=0; i<tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<tc; i++){
            int rn = 1;
            for(int j=0; j<tc; j++){
                if(i == j)continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])rn++;
            }
            System.out.print(rn + " ");
        }
        
    }
}