package chapter_3.exercises;
/*(Geometry: points in triangle) Suppose a right triangle is placed in a plane as shown below.
 The right-angle point is placed at (0,0) and other two points are placed at (200,0) and 
 (0,100). Write a program that prompts the user to enter a point with a x- and y-coordinates 
 and determines whether the point is inside the triangle */

 import java.util.Scanner;

public class exercise27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //First define the triangle using vertices
        double xA = 0;
        double yA = 0;
        double xB = 0;
        double yB = 100;
        double xC = 200;
        double yC = 0;

        System.out.print("Enter a point's x- and y- coordinates: ");
        double xP = sc.nextDouble();
        double yP = sc.nextDouble();

        //Calculate the total area for the triangle
        double totalArea = (1.0/2.0) * Math.abs( (xA *(yB - yC)) + (xB *(yC - yA)) + (xC *(yA - yB)));
        
        //Calculate the subareas: PBC, APC, ABP
        double areaPBC = (1.0/2.0) * Math.abs( (xP *(yB - yC)) + (xB *(yC - yP)) + (xC *(yP - yB)));
        double areaAPC = (1.0/2.0) * Math.abs( (xA *(yP - yC)) + (xP *(yC - yA)) + (xC *(yA - yP)));
        double areaABP = (1.0/2.0) * Math.abs( (xA *(yB - yP)) + (xB *(yP - yA)) + (xP *(yA - yB)));
        
        //Add all of the sub-areas
        double subAreasTotal = areaPBC + areaAPC + areaABP;

        //Print the results
        if(subAreasTotal == totalArea || subAreasTotal < totalArea)
            System.out.println("The point is in the triangle.");
        else
            System.out.println("The point is not in the triangle.");
    }
}