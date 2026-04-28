package chapter_3.exercises;
/*(Random Color)
Write a program that randomly generates an integer 
between 1 and 7 and displays the name of a color in the
rainbow--violet, indigo, blue, greem, yellow, orange,
and red--for numbers 1,2,3 ... 7 accordingly */

//import the random library
import java.util.Random;

public class exercise4 {
    public static void main(String[] args){
        //Create an instance of the class
        Random random = new Random();
        
        //Create a random variable in the range between 1-7
        int val = random.nextInt((7-1)+1) + 1;

        //Uses a switch to to print the one of the following colors of a rainbow
        switch(val){
            case 1: System.out.println("Violet");break;
            case 2: System.out.println("Indigo");break;
            case 3: System.out.println("Blue");break;
            case 4: System.out.println("Green");break;
            case 5: System.out.println("Yellow");break;
            case 6: System.out.println("Orange");break;
            case 7: System.out.println("Red");break;
        }
    }
}
