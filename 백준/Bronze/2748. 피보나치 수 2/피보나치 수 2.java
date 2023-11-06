import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long db[] = new long[91];
        db[1] = 1;
            
        for(int i=2; i<=num; i++){
            db[i] = db[i-1] + db[i-2];
        }
        System.out.println(db[num]);
           
        
    }
}