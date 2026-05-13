package chapter_3.exercises;
/*(Financial application: monetary units)
Modify Listing 2.10, ComputeChange.java to display the nonzero
denominations only, using singular words for single units
such as 1 dollar and 1 penny, and plural words for more than
one unit such as 2 dollars and 3 pennies */
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Recieve the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = sc.nextDouble();

        int remainingAmount = (int)(amount * 100);

        //Find the number of one dollars
        int numberOfDollars = remainingAmount / 100;
        String numberOfDollarsString;
        if(numberOfDollars == 1){
            numberOfDollarsString = "dollar";
        } else{
            numberOfDollarsString = "dollars";
        }
        remainingAmount %= 100;

        //Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        String numberOfQuartersString;
        if(numberOfQuarters == 1){
            numberOfQuartersString = "quarter";
        } else{
            numberOfQuartersString = "quarters";
        }
        remainingAmount %= 25;

        //Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        String numberOfDimesString;
        if(numberOfDimes == 1){
            numberOfDimesString = "dime";
        } else{
            numberOfDimesString = "dimes";
        }
        remainingAmount = remainingAmount % 10;

        //Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        String numberOfNickelsString;
        if(numberOfNickels == 1){
            numberOfNickelsString = "nickel";
        } else{
            numberOfNickelsString = "nickels";
        }
        remainingAmount = remainingAmount % 5;

        //Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        String numberOfPenniesString;
        if(numberOfPennies == 1){
            numberOfPenniesString = "penny";
        } else{
            numberOfPenniesString = "pennies";
        }

        //Display results
        System.out.println("Your amount " + amount + " consists of");

        /*Conditions to include for the program:
        if number = 1, make the string corresponding with 
        the word singular. Else make it plural
        else */
        System.out.printf("%d %s\n",numberOfDollars, numberOfDollarsString);
        System.out.printf("%d %s\n",numberOfQuarters, numberOfQuartersString);
        System.out.printf("%d %s\n",numberOfDimes, numberOfDimesString);
        System.out.printf("%d %s\n",numberOfNickels, numberOfNickelsString);

    }
}
