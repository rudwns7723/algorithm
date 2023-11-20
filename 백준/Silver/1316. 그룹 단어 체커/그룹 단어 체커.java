import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String arr[] = new String[tc];
        int cnt = 0;//이전에 값 있는지 확인
        int ccnt = 0;//저장값
        for(int i=0; i<tc; i++){
            cnt = 0;
            arr[i] = br.readLine();
            if(arr[i].length() == 1)ccnt++;
            else{
                ArrayList<Character> ch = new ArrayList<>();
                char a = arr[i].charAt(0);
                ch.add(a);
                for(int j=1; j<arr[i].length(); j++){
                    a = arr[i].charAt(j);
                    boolean chk = ch.contains(a);
                    ch.add(a);
                    if(ch.get(j-1) != ch.get(j) &&  chk){
                        cnt = 0;
                        break;
                    }else{
                        cnt++;
                    }
                }
                if(cnt > 0)ccnt++;
                
            }
        }
        
        System.out.println(ccnt);
    }
}