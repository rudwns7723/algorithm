import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            if(num1 == 0)break;
            arr.add(num1);
            arr.add(num2);
            arr.add(num3);
        }
        int mok = 0;
        int na = 0;
        int cnt = 1;
        for(int i=0; i<arr.size(); i+=3){
            mok = arr.get(i+2) / arr.get(i+1);
            if(arr.get(i+2) % arr.get(i+1) < arr.get(i)){
                na = arr.get(i+2) % arr.get(i+1);    
            }else{
                na = arr.get(i);
            }
            
            mok = mok * arr.get(i);
            mok = mok + na;
            System.out.println("Case " + cnt + ": " + mok);
            cnt++;
        }
    }
}