import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        for (int i = 2; i <= Math.sqrt(num); i++){
			while (num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
		if (num != 1) {
			System.out.println(num);
		}
    }
}