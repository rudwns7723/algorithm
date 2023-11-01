import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[26];
        String val = in.next();
        val = val.toUpperCase();
        
        for(int i=0; i<val.length(); i++){
            char c = val.charAt(i);
            int cc = (int)c - 65;
            arr[cc] += 1;
        }
        
        int max = 0;  //최대확인
        int maxi = 0; //최대인 i값
        int cnt = 0;  //중복확인
        for(int i=0; i<arr.length; i++){
            if(max == arr[i])cnt++;
            else if(max < arr[i]){
                max = arr[i];
                maxi = i + 65;
                cnt = 0;
            }
        }
        
        if(cnt == 0)System.out.println((char)maxi);
        else System.out.println('?');
        
        
    }
}