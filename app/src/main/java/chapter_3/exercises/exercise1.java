package chapter_3.exercises;
/*(Alebra: solve quadratic equations)
Write a program that prompts the user to enter values for a, 
b, and c and displays the result based onthe discriminant.
If the discriminant is positive, display two roots. If the
discriminant is 0, display one roor. Otherwise, display "The
equation has no real roots" */

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

       //Calculate the discriminant 
       double disc = Math.pow(b,2) - (4 * a * c);
        double scale = Math.pow(10,7);
       //Print the results
       if(disc > 0){
        double root1 = (-b + Math.pow(disc,0.5))/ (2 *a);
        root1 = Math.round(root1 * scale) / scale;
        double root2 = (-b - Math.pow(disc,0.5))/ (2 *a);  
        root2 = Math.round(root2 * scale) / scale;
        System.out.println("The equation has two roots "+root1+" "+root2);
       } else if(disc == 0){
        double root1 = -b + Math.pow((Math.pow(b,2)-(4 * a *c)),5) / (2 * a);
        System.out.println("The equation has one root "+ root1);
       } else{
        System.out.println("The equation has not real roots");
       }
    }
}
