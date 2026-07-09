package chapter_3.exercises;
/*(Geometry: point in a rectangle) Write a program that prompts the user to enter a point 
(x,y) and checks whether the point is within the rectangle centered at (1,1) with width of 10 
and a height of 5. For example, (2,2) is inside the rectangle and (6,4) is outside the 
rectangle.
Hint: A point is in the rectangle if its horizontal distance to (1,1) is less than or equal to
 10.0 / 2 and its vertical distance to (1,1) is less than or equal to 5.0/ 2 */
 import java.util.Scanner;


public class exercise23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        int point = sc.nextInt();

        double y2 = point % 10;
        double x2 = point / 10;
        //Compute the distance
        double distance = Math.sqrt(Math.pow((x2 - 1),2) - Math.pow((y2 - 1),2));

        if(((distance < 10 / 2) || (distance == 10 / 2)) &&
            ((distance < 5 / 2) || (distance == 5 / 2))){
            System.out.printf("Point (%.1f, %.1f) is in the rectangle",x2,y2);
        } else{
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle",x2,y2);
        }
 
    }
}
