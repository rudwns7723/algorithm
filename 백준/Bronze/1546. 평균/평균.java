import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int arr[] = new int[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += (double)arr[i]/arr[arr.length - 1]*100;
        }
        System.out.println(sum/cnt);
    }
}