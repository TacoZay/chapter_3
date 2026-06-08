package chapter_3.exercises;
import java.util.Scanner;

public class testArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // int lottery = (int) (Math.random() * 1000);
        int lottery = 875;
        System.out.printf("lottery: %d\n",lottery);
        System.out.print("Enter a three-digit integer: ");
        int guess = sc.nextInt();
        
        System.out.println();
        //Get the digits to lottery
        int lotteryDigit1 = lottery % 10;
        lottery /= 10;
        int lotteryDigit2 = lottery % 10;
        lottery /= 10;
        int lotteryDigit3 = lottery % 10;

        //Get the digits to guess
        int guessDigit1 = guess % 10;
        guess /= 10;
        int guessDigit2 = guess % 10;
        guess /= 10;
        int guessDigit3 = guess % 10;


        System.out.printf("guess: %d\n",guess);
        System.out.printf("lottery: %d\n",lottery);
        System.out.println();
        System.out.printf("lottery Digit 1: %d\n",lotteryDigit1);
        System.out.printf("lottery Digit 2: %d\n",lotteryDigit2);
        System.out.printf("lottery Digit 3: %d\n",lotteryDigit3);

        if(lottery == guess){
            System.out.println("You won");
        } else if(
            /*this if statement isnt able to be process. I need to make the if statement handle the 
            case when the given user's guess has all the same digits in the in the lottery digit */
            (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
                && (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3 || guessDigit2 == lotteryDigit2)
                && (guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 || guessDigit1 == lotteryDigit1)){
                System.out.println("Your guess matches all the digits in the wrong order");
        } else if(
            /*this if statement isnt able to be process. I need to make the if statement handle the 
            case when the given user's guess has all the same digits in the in the lottery digit */
            (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
                || (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3 || guessDigit2 == lotteryDigit2)
                || (guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 || guessDigit1 == lotteryDigit1)){
                System.out.println("This only have one digit matching");
        } else{
            System.out.println("None are matching ");
        }

        
    }    
}
