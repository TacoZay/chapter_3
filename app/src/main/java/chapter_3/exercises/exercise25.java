package chapter_3.exercises;
/*Two points on line1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3,y3) and (x4,y4) 
as shown in Figure 3.8a and b. The intersecting point of two lines can be found by solving the
following linear equations in the example*/
import java.util.Scanner;


public class exercise25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble(); 
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3  = sc.nextDouble();
        double y3  = sc.nextDouble();
        double x4  = sc.nextDouble();
        double y4  = sc.nextDouble();
        
        //Apply the linear equations
        double a = (y1 - y2);
        double b = (x1 - x2);
        double e = (a * x1) - (b * y1);

        double c = (y3 - y4);
        double d = (x3 - x4);
        double f = (c * x3) - (d * y3);
        
        // //Apply Cramer's rule
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c))/((a * d) - (b * c));

        
        if(x == 0 && y == 0){
            System.out.println("The two lines are parallel.");
        }else{
            System.out.printf("The intersecting point is at (%.4f, %.4f)", x,y);
        }


     
      
    }
}