package chapter_3.exercises;
import java.util.Scanner;

public class exercise29 {
    public static void main(String[] args){
        //Input the values of the circles
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double radius1 = sc.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double radius2 = sc.nextDouble();

        //Calculate the distance between the two centers
        double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        
        //First case: does circle2 inside circle1?
        if(distance < (radius1 - radius2) || distance == (radius1 - radius2)){
            System.out.println("Circle2 is inside Circle1.");
        } 
        //Second case: does circle2 overlap circle1? 
        else if( distance < (radius1 + radius2) || distance == (radius1 + radius2)){
            System.out.println("Circle2 overlaps Circle1.");
        } else{
            System.out.println("Circle2 doesn't overlap Circle1.");
        }

    }
}
