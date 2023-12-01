import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int[4][4];
        for(int i=0; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
        }
        boolean tf[][] = new boolean[101][101];
        for(int i=0; i<4; i++){
            for(int j=arr[i][0]; j<arr[i][2]; j++){
                for(int k=arr[i][1]; k<arr[i][3]; k++){
                    tf[j][k] = true;
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<100; i++){
            for(int a=0; a<100; a++){
                if(tf[i][a]==true)cnt++;
            }    
        }
        System.out.println(cnt);
    }
}