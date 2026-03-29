package chapter_3;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if(number % 5 == 0)
            System.out.println("HiFive");
        
        if(number % 2 == 0)
            System.out.println("HiEven");
    }
}