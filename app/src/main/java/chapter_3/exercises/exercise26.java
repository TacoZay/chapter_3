package chapter_3.exercises;
/*3.26 (User the &&, ||, and ^ operators) Write a program that prompts the user to enter an 
integer and determines whether it is divisible by 4 and 5, whether it is divisible by 4 or 5,
and whether it is divisible by 4 or 5 but not both.*/
import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        double num = sc.nextDouble();
        boolean test1 = false;
        boolean test2 = false; 
        boolean test3 = false;

        //determine the values for the test cases
        if(num % 4 == 0 && num % 5 == 0) test1 = true;
        if(num % 4 == 0 || num % 5 == 0) test2 = true;
        if(num % 4 == 0 ^ num % 5 == 0) test3 = true;

        //Print the results
        System.out.println("Is divisible by 4 and 5? " + test1);
        System.out.println("Is divisible by 4 or 5? " + test2);
        System.out.println("Is divisible by 4 or 5 but not both? " + test3);
    }
}
