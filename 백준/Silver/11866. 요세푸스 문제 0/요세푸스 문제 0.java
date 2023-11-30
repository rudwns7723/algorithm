import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        int j = k;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        System.out.print("<");
        while(true){
            if(list.size() >= k){
                if(list.size()==1){
                    System.out.print(list.get(0));
                    break;
                }
                System.out.print(list.get(k-1) + ", ");
                list.remove(k-1);
            }else{
                if(list.size()==1){
                    System.out.print(list.get(0));   
                    break;
                }else{
                    System.out.print(list.get(k-1) + ", ");   
                    list.remove(k-1);
                }
            }
            
            k+= j-1;
            if(k>list.size()){
                while(k > list.size()){
                    k = k - list.size();
                }
            } 
        }
         System.out.print(">");
    }
}   