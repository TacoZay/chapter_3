package chapter_3.exercises;
/*3.30 (Current Time) Revise programming exercise 2.8 to display the hour usin ga 12-hour clock */
import java.util.Scanner;

public class exercise30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Compute the current time
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        int currentSecond = (int) totalSeconds % 60;

        int totalMinutes = (int) totalSeconds / 60;
        int currentMinute = totalMinutes % 12;

        int totalHours = totalMinutes / 60;
        int currentHour = totalHours % 12;
        //Handle the case if currentHour = 0
        if(currentHour == 0){
            currentHour = 12;
        }
        System.out.printf("The current time is %d:%d:%d GMT\n", currentHour, currentMinute, currentSecond);

        //Apply the offset
        System.out.print("Enter the time zone offset: ");
        int offset = sc.nextInt();
        totalHours += offset;
        currentHour = totalHours % 12;
        if(currentHour == 0){
            currentHour = 12;
        }

        //Display the "new" time in 12-hour format
        System.out.printf("The current time is %d:%d:%d GMT\n", currentHour, currentMinute, currentSecond);
    }
}