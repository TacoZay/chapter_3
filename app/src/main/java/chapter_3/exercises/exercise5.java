package chapter_3.exercises;
/*(Find future dates)
Write a program that prompts the user to enter an integer
for today's day of the week (Sunday is 0, Monday is 1, ...
and Saturday is 6). Also prompt the user to enter the number
of days after today for a future day and display the
future day of the week. */
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the day (0 - 6): ");
       int day = sc.nextInt();

       System.out.print("Enter the number of days that passed: ");
       int elapsed = sc.nextInt();

       String dayString = "";
       
       //Determine the day based on the user input
       switch(day){
        case 0: dayString = "Sunday"; break;
        case 1: dayString = "Monday"; break;
        case 2: dayString = "Tuesday"; break;
        case 3: dayString = "Wednesday"; break;
        case 4: dayString = "Thursday"; break;
        case 5: dayString = "Friday"; break;
        case 6: dayString = "Saturday"; break;
        default: dayString = "BLANK"; break;
       }
       
       
       //2. Determine the new day based on the elapsed time that was entered
       int newDay = (day + elapsed) % 7;
       //how should i handle the case if newday number is not within the week range (0 -6)?
       String newDayString = "";
       switch(newDay){
        case 0: newDayString = "Sunday"; break;
        case 1: newDayString = "Monday"; break;
        case 2: newDayString = "Tuesday"; break;
        case 3: newDayString = "Wednesday"; break;
        case 4: newDayString = "Thursday"; break;
        case 5: newDayString = "Friday"; break;
        case 6: newDayString = "Saturday"; break;
       }

       System.out.println("Today is "+dayString +" and the future day is " + newDayString);
       System.out.println("Check over these");
       System.out.println("elapsed amount: "+ elapsed);
    }
}
