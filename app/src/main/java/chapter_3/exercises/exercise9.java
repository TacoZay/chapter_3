package chapter_3.exercises;
/*Write a program that prompts the user to enter the first 9 digits 
and displays the 10-digit ISBN (including leading zeros) */
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        long ISBN = sc.nextLong();

        //split the isbn into 9 separate nums
        //must use a mathematical approach to split the numbers 
        // ISBN /= 10;

        int d9 = (int) ISBN % 10;
        ISBN /= 10;
        int d8 = (int) ISBN % 10;
        ISBN /= 10;
        int d7 = (int) ISBN % 10;
        ISBN /= 10;
        int d6 = (int) ISBN % 10;
        ISBN /= 10;
        int d5 = (int) ISBN % 10;
        ISBN /= 10;
        int d4 = (int) ISBN % 10;
        ISBN /= 10;
        int d3 = (int) ISBN % 10;
        ISBN /= 10;
        int d2 = (int) ISBN % 10;
        ISBN /= 10;
        int d1 = (int) ISBN % 10;
        
        //calculate the checksum
        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9 ) % 11;

        //Determine the checksum value and display the results
        if (checksum == 10){
            String d10 = "X";
            System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
        }else{
            int d10 = checksum;
            System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
        }

    
        
    }
}
