import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int fnum = num % 10;//첫번째 값 
        int sum = 0;//합 값
        int cnt = 0;//사이클 길이
        boolean tf = true;
        if(num < 10){
            sum = num;
        }else{
            sum = (num/10 + num %10)%10;    
        }
        
        while(tf){
            cnt++;
            sum = fnum*10 + sum;
            if(sum == num){
                break;
            }
            fnum = sum %10;
            sum = (sum/10 + sum %10)%10;
        }
        System.out.println(cnt);
    }
}