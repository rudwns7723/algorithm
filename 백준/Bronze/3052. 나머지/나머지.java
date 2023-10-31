import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        HashSet<Integer> arr =  new HashSet<>();
        for(int i=0; i<10; i++){
            arr.add(in.nextInt() % 42);
        }
        System.out.print(arr.size());
    }
}