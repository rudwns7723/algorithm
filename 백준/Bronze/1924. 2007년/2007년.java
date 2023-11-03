import java.util.*;
import java.io.*;
import java.time.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
            // 1. LocalDate 생성
        LocalDate date = LocalDate.of(2007, m, d);
 
        // 2. DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
 
        // 3. 숫자 요일 구하기
        int dayOfWeekNumber = dayOfWeek.getValue();
 
        if(dayOfWeekNumber == 1){
            System.out.println("MON");
        }else if(dayOfWeekNumber == 2){
            System.out.println("TUE");
        }else if(dayOfWeekNumber == 3){
            System.out.println("WED");
        }else if(dayOfWeekNumber == 4){
            System.out.println("THU");
        }else if(dayOfWeekNumber == 5){
            System.out.println("FRI");
        }else if(dayOfWeekNumber == 6){
            System.out.println("SAT");
        }else{
            System.out.println("SUN");
        }
        
    }
}