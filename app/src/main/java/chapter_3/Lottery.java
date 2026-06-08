package chapter_3;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args){
        //Generate a lottery number
        int lottery = (int)(Math.random() * 100);

        //Prompt the user to enter a guess
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = sc.nextInt();

        //Get digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        //Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        //Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10k");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3k");
        else if (guessDigit2 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1k");      
        else
            System.out.println("Sorry, no match");
    }
}
