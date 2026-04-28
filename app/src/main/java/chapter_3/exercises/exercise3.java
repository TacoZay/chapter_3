package chapter_3.exercises;
/*(Algebra: solve 2 * 2)
Linear equations can be solved using Cramer's rule 
to given Programming Exercise 1.13. Write a program
that prompts the user to enter a, b, c, d, e, and f
and displays the result. If add - bc is 0, report
that "The equation has no soluion"*/

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, and f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        if(((a * d) - (b * c)) ==0 ){
            System.out.println("The equation has no solution");
            System.exit(0);
        } else{
            double x = (((e * d) - (b * f))/((a * d) - (b * c)));
            double y = (((a * f) - (e * c))/((a * d) - (b * c)));
            System.out.printf("x is %f andy is %f", x, y);
            
        }
    }    
}
