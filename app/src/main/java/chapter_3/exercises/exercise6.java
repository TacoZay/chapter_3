package chapter_3.exercises;
/*(Health application: BMI) Revise Listing 3.4, 
ComputeAndInterpretBMI.java to let the user enter weight, 
feet, and inches. For example, if a person is 5 feet and 10 inches
you will enter 5 for feet and 10 for inches.*/

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        
        //Prompt the user to enter feet
        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        double feetToInches = feet * 12;

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254; //Constant
        
        //Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (inches + feetToInches) * METERS_PER_INCH;
        double bmi = weightInKilograms /(heightInMeters * heightInMeters);

         System.out.println("BMI is "+ bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if(bmi < 25)
            System.out.println("Normal");
        else if(bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }    
}
