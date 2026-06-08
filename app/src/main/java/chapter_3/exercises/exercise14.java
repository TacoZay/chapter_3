package chapter_3.exercises;
import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int answer = (int) (Math.random() * 2);
        
        System.out.print("Heads or tails: ");
        String guessString = sc.nextLine().toLowerCase();
        
        int guessInt = 0;
        if(guessString.equals("heads")){
            guessInt = 0;
        } else if(guessString.equals("tails")){
            guessInt = 1;
        }

        if(answer == guessInt){
            System.out.println("You are correct!");
        } else{
            System.out.println("You are incorrect!");
        }

    }
}
