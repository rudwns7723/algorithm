import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String arr[] = a.split("");
        int va[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            va[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(va);
        for(int i=va.length-1; i>=0; i--){
            System.out.print(va[i]);
        }
    }
}