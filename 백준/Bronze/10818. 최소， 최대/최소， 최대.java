import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        int arr[] = new int[val];
        
        for(int i=0; i<val; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[val - 1]);
        
    }
}