import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int arr[] = new int[tc*2];//테스트 케이스 
        int pe[][] = new int[15][15];//아파트 사람
        
        
        for(int i=0; i<tc*2; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=1; i<15; i++){
            pe[0][i] = i;
        }
        
        for(int i=1; i<15; i++){
            for(int j=1; j<15; j++){
                if(j==1)pe[i][j] = 1;
                else{
                   pe[i][j] = pe[i][j-1] + pe[i-1][j];    
                }
            }    
        }
        for(int i=0; i<arr.length; i+=2){
            System.out.println(pe[arr[i]][arr[i+1]]); 
        }
    }
}