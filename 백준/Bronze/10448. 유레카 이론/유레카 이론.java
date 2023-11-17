import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int arr[] = new int[tc];
        int va[] = new int[45];
        
        for(int i=0; i<tc; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i=0; i<45; i++){
            va[i] = (i+1)*(i+2) / 2;
        }
        
        boolean tf = false;
        for(int a=0; a<tc; a++){
            tf = false;
            for(int i=0; i<45; i++){
                for(int j=0; j<45; j++){   
                    for(int k=0; k<45; k++){
                           if(va[i] + va[j] + va[k] == arr[a])tf = true;
                           if(tf)break;
                    }
                    if(tf)break;
                }
                if(tf)break;
            }
            if(tf)System.out.println("1");
            else System.out.println("0");
        }
    }
}