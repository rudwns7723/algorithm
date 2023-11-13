import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int school = in.nextInt();
            String[] name = new String[school];
            int[] n = new int[school];
            for (int j = 0; j < school; j++) {
                name[j] = in.next(); 
                n[j] = in.nextInt(); 
            }
            int max = n[0]; 
            int index = 0;
            for (int k = 0; k < n.length; k++) {
                if (max < n[k]) {
                    max = n[k]; 
                    index = k;
                }
            }

            System.out.println(name[index]);
        }
    }
}