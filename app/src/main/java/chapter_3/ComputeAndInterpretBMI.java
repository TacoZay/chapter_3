package chapter_3;
import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        //Prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;      //Constant
        final double METERS_IN_INCHES = 0.0254;             //Constant


        //Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_IN_INCHES;
        double bmi = weightInKilograms /(heightInMeters * heightInMeters);

        //Display the results
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
