package chapter_3.exercises;
/*3.22(Geometry: point in a circle) Write a program that prompts  the user to enter a point 
(x,y) and checks whether the point is within a circle centered at (0,0) with radius 10. 
For example, (4,5) is inside the circle and (9,9) is outside the circle */
import java.util.Scanner;


public class exercise22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = Math.sqrt(Math.pow((x2 - 0),2) + Math.pow((y2 - 0),2));
        if(distance < 10 || distance == 10){
            System.out.printf("Point (%.1f, %.1f) is in the circle",x2, y2);
        }else{
            System.out.printf("Point (%.1f, %.1f) is not in the circle",x2, y2);
        }
    }
}
