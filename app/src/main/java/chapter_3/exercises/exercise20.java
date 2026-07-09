package chapter_3.exercises;
/*3.20(Science: wind-chill temperature) Programming exercise 2.17 gives a formula to compute
the wind-chill temperature. The formula is valid for temperatures in range between -58F and 41F
and wind speed greater than or equal to 2. 
Write a program that prompts the user to enter a temperature and a wind speed. The program 
displays a message indicating whether the temperature and/or wind speed is invalid.*/
import java.util.Scanner;


public class exercise20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit betwween -58F and 41F: ");
        double temp = sc.nextDouble();

        if(temp > 41 || temp < -58){
            System.out.println("The temperature input is invalid");
        } else {
            System.out.print("Enter a wind speed >= 2: ");
            double windSpeed = sc.nextDouble();
            if(windSpeed < 2){
                System.out.println("The wind speed input is invalid.");
            }else{
                //Calculate the wind-chill index
                double index = 
                35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) 
                + (0.4275 * temp * Math.pow(windSpeed, 0.16));

                //How is the scale applied to round the index?
                double scale = Math.pow(10, 5);
                double roundedIndex = Math.round(index * scale) / scale;
                System.out.println("The wind chill index is " + roundedIndex);
            }
        }
    }
}
