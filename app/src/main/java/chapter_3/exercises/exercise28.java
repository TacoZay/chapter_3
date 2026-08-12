/*3.28 (Geometry: two rectangles) Write a program that prompts the user to enter the center x-,
y-coordinates, width, and height of two rectangles and determines whether the second rectangle
is inside the first or overlaps with the first. Test the program to cover all cases  */
package chapter_3.exercises;
import java.util.Scanner;

public class exercise28{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Enter the rectangles' center, width, and height
        System.out.print("Enter R1's center x-, y-coordinates, width, and height: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double width1 = sc.nextDouble();
        double height1 = sc.nextDouble();

        System.out.print("Enter R2's center x-, y-coordinates, width, and height: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double width2 = sc.nextDouble();
        double height2 = sc.nextDouble();

        //Define R1 x-interval = [Left, Right]
        double leftR1 = x1 - (width1/2);
        double rightR1 = x1 + (width1/2);
        //Define R1 y-interval = [Bottom, Up]
        double bottomR1 = y1 - (height1/2);
        double topR1 = y1 + (height1/2);

        //Define R2 x-interval = [Left, Right]
        double leftR2 = x2 - (width2/2);
        double rightR2 = x2 + (width2/2);
        //Define R2 y-interval = [Bottom, Up]
        double bottomR2 = y2 - (height2/2);
        double topR2 = y2 + (height2/2);

        //Test case 1: is R2 in R1?
        if((topR1 > topR2 || topR1 == topR2) && (leftR1 < leftR2 || leftR1 == leftR2)
            && (bottomR1 < bottomR2 || bottomR1 == bottomR2) && 
            (rightR1 > rightR2 || rightR1 == rightR2)){
                System.out.println("R2 is inside R1");
        /*Test case 2: do the rectangles miss each other?
        Check the x-axis to see R2's position
        Note: if neither of the conditions are true for the x-axis, then check to see if they miss
        each other on the y-axis.
        If any of the conditions are true, then the rectangles don't overlap*/
        } else if((rightR2 < leftR1) || (leftR2 > rightR1) || (topR2 < bottomR1) || (bottomR2 > topR1)){
            System.out.println("R2 doesn't overlap R1");
        } else{
            System.out.println("R2 overlaps R1");
        }
    }
}