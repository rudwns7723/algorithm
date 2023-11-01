import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int sum = 0;//총합
        double avg = 0;//평균
        int cnt = 0;//평균이상 학생수  
        int tc = in.nextInt();//테스트 케이스 개수
        
        for(int i=0; i<tc; i++){
            int student = in.nextInt(); //학생수
            sum = 0; 
            avg = 0;
            cnt = 0;
            int arr[] = new int[student];//학생 성적
            for(int j=0; j<student; j++){
                arr[j] = in.nextInt();
                sum += arr[j];
            }
            avg = (double)sum/student;
            for(int k=0; k<student; k++){
                if(avg < arr[k])cnt++;
            }
            System.out.println(Math.round((double)cnt/student*100000)/1000.0 + "%");
        }
        in.close();
    }
}