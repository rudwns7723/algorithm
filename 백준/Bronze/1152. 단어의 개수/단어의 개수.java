import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b[] = a.split(" ");
        int cnt = 0;
        for(int i=0; i<b.length; i++){
            if(b[i].length() > 0)cnt++;
        }
        System.out.println(cnt);
    }
}