package chapter_3.exercises;
import java.util.Scanner;
/*(Palindrome integer) Write a program that prompts the user to enter a 3-digit integer and
determines whether it's a palindrome integer. An integer is a palindrome if it reads the same 
from right to left and from left to right. A negative integer is treated the same as a positive
integer */

public class exercise11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");

        int num = sc.nextInt();
        num = Math.abs(num);
        String origin = String.valueOf(num);
        

         String reverseString = "";
         String numString = "";
        
         //getting the first digit for reverse
         numString = String.valueOf(num % 10);
         reverseString += numString;
         num /= 10;

         //getting the second digit
         numString = String.valueOf(num % 10);


         reverseString += numString;

         numString = String.valueOf(num / 10);
         reverseString += numString;

        //  System.out.printf("num: %d\n", num);
        //  System.out.printf("origin: %s\n", origin);
        //  System.out.printf("Reverse String: %s\n", reverseString);

         if(reverseString.equals(origin)){
            System.out.printf("%s is a palindrome", origin);
         } else{
            System.out.printf("%s is not a palindrome", origin);
         }


    }
}
   