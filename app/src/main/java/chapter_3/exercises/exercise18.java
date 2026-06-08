package chapter_3.exercises;
import java.util.Scanner;
/*(Cost of shipping) A shipping company uses the following function to calculate the cost 
(in dollars) of shipping based on the weight of the package (in pounds).

Write a program that prompts the user to enter the weight of the package and display the shipping 
cost. If the weight is greater than 20, display the message "the package cannot be delivered"*/


public class exercise18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double weight = sc.nextDouble();
        
        //Apply the functio
        if(weight > 0 && ((weight < 2) || (weight == 2))){
            double cost = 2.5;
            System.out.printf("A package with a weight of %.2f will cost $%.2f.", weight, cost);
        }
        if(weight > 2 && ((weight < 4) || (weight == 4))){
            double cost = 4.5;
            System.out.printf("A package with a weight of %.2f will cost $%.2f.", weight, cost);
        }
        if(weight > 4 && ((weight < 10) || (weight == 10))){
            double cost = 7.5;
            System.out.printf("A package with a weight of %.2f will cost $%.2f.", weight, cost);
        }
        if(weight > 10 && ((weight < 20) || (weight == 20))){
            double cost = 10.5;
            System.out.printf("A package with a weight of %f will cost $%.2f.", weight, cost);
        }
        if(weight > 20)
            System.out.println("The package cannot be delivered");
    }
}
