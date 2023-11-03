import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[9];//난쟁이 키
        int sum = 0;//전체 키합
        int cnt = 1;//더한 난쟁이 수
            
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        
        int na = 0;//거짓말 난쟁이 키합
        na = sum - 100;
        
        int nan1 = 0;//거짓말 난쟁이
        int nan2 = 0;//거짓말 난쟁이
        
        Loop1 :
        for(int i=0;i<8; i++){
            Loop2 :
            for(int j=i+1; j<9; j++){
                if(na == arr[i]+arr[j]){
                    nan1 = arr[i];
                    nan2 = arr[j];
                    break Loop1;
                }
            }
        }
        
        Arrays.sort(arr);
        for(int i=0; i<9; i++){
            if(arr[i]==nan1 || arr[i]==nan2)continue;
            System.out.println(arr[i]);
        }
            
    }
}