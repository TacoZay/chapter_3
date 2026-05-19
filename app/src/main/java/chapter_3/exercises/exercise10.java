package chapter_3.exercises;
import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month then the year(MM YYYY): ");
        int month = sc.nextInt();
        int year = sc.nextInt();

        String monthString;
        int days = 0;
        switch(month){
            case 1: 
                monthString = "January";
                days = 31;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
            case 2: 
                monthString = "February";
                if(year % 4 == 0){
                    days = 29;
                    System.out.printf("%s in %d has %s", monthString, year, days);
                    break;
                }else{
                   days = 28;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break; 
                }
                
            case 3: 
                monthString = "March";
                days = 31;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
            case 4: 
                monthString = "April";
                days = 30;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
            case 5: 
                monthString = "May";
                days = 31;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
            case 6: 
                monthString = "June";
                days = 30;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
            case 7: 
                monthString = "July";
                days = 31;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
            case 8: 
                monthString = "August";
                days = 31;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
            case 9: 
                monthString = "September";
                days = 30;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
            case 10: 
                monthString = "October";
                days = 31;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
            case 11: 
                monthString = "September";
                days = 30;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
            case 12: 
                monthString = "January";
                days = 31;
                System.out.printf("%s in %d has %s", monthString, year, days);
                break;
        }
    }
}
