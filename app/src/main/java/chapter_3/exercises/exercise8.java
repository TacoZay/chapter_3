package chapter_3.exercises;
/*(Sort three integers)
Write a program that promptsthe user to enter three integers
and display the integers in non-decreasing order */
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in three integers: ");
        int num1 = sc.nextInt(); //4
        int num2 = sc.nextInt();// 8
        int num3 = sc.nextInt();// 1

        int small = 0;

        if(num1 <= num2 && num1 <= num3){
           small = num1;
           System.out.print(small);
           if(num2 <= num3){
            small = num2;
            System.out.print(" "+small);
            small = num3;
            System.out.print(" "+small);
           } else{
            small = num3;
            System.out.print(" "+small);
            small = num2;
            System.out.print(" "+small);
           } 
        }
        if(num2 <= num3 && num2 <= num1){
            small = num2;
            System.out.print(small);
            if(num3 <= num1){
                small = num3;
                System.out.print(" "+small);
                small = num1;
                System.out.print(" "+small);
            } else{
                small = num1;
                System.out.print(" "+small);
                small = num3;
                System.out.print(" "+small);
            }
        }
        if(num3 <= num1 && num3 <= num2){
            small = num3;
            System.out.print(" "+small);
            if(num1 <= num2){
                small = num1;
                System.out.print(" "+small);
                small = num2;
                System.out.print(" "+small);
            } else{
                small = num2;
                System.out.print(" "+small);
                small = num1;
                System.out.print(" "+small);
            }
        }
    }
}
