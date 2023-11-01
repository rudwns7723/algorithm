import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        String str[] = new String[num];
        
        
        for(int i=0; i<num; i++){
            str[i] = in.next();
            int count = 0;
            int sum = 0;
            for(int j=0; j<str[i].length(); j++){
                if(str[i].charAt(j) == 'O'){
                    count++;
                }else{
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }
    }
}


