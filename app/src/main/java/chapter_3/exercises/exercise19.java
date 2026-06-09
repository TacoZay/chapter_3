package chapter_3.exercises;
/*(Compute the perimeter of a rectangle) Write a program that read two edges of a rectangle
and computes the perimeter if the input is valid. Otherwise, display that input is invalid.
The input is valid if both edges are of different length */
import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side 1 and side 2: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();

        //Display the results
        if(side1 == side2){
            System.out.println("The input is invalid.");
        }else{
            double perimeter = (2 * side1) + (2 * side2);
            System.out.printf("Perimeter: %.2f", perimeter);
        }

    }
}
