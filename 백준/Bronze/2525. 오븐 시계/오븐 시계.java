import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int min = in.nextInt();
        int cooking = in.nextInt();
        
        if(min + cooking >= 60){
            int mok = (min + cooking) /60;
            int na = (min + cooking) % 60;
            min = na;
            hour += mok;
        }else{
            min = min + cooking;
        }
        if(hour >= 24){
            hour = hour % 24; 
        }
        System.out.print(hour + " " + min);
    }
}