package chapter_3.exercises;
/*3.21(Science: day of the week) Zeller's congruence is an algorithm developed by Christian Zeller
to calculate the day of the week. Using the Zeller's congruence, write a program that prompts the 
user to enter a year, month, and a day of the month, and then displays the name of the day
of the week*/
import java.util.Scanner;

public class exercise21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = sc.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = sc.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = sc.nextInt();
        // year -= 1; 
        //calculate the month
        switch(month){
            case 1: 
                month = 13; 
                year -= 1; 
                break;
            case 2: 
                month = 14; 
                year -= 1; 
                break;
        }
        
    


        // calculate the day
        int yearInCentury
         = year % 100;
        int k = year % 100;
        int j = year / 100;
        int answer = 
        (day + ((26 * (month + 1))/10) + k + (k/4) + (j/4) + (5 * j) ) % 7;

        //Display the results
        switch(answer){
            case 0:
                System.out.println("Day of the week is Saturday");
                break;
            case 1: 
                System.out.println("Day of the week is Sunday");
                break;
            case 2:
                System.out.println("Day of the week is Monday");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday");
                break;
            case 5:
                System.out.println("Day of the week is Thursday");
                break;
            case 6:
                System.out.println("Day of the week is Friday");
                break;
        }
    }
}