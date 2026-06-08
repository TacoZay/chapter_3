package chapter_3.exercises;
/*(Game: rock, paper, scissor)
Write a program that plays the popular rock-paper-scissor game. The program
randomly generates a number 0, 1, or 2 representing rock, paper, and scissor. The program 
prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user
or the computer wins, loses, or draws.  */
import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Rock(0), Paper(1), Scissor(2): ");
        int userOptionNum = sc.nextInt();
        String userOptionString = "";
        if(userOptionNum == 0) userOptionString = "rock"; 
        if(userOptionNum == 1) userOptionString = "paper";
        if(userOptionNum == 2) userOptionString = "scissor";       

        //Compute the computer's option
        int compOptionNum = (int)(Math.random() * 3);
        String compOptionString = "";
        if(compOptionNum == 0) compOptionString = "rock"; 
        if(compOptionNum == 1) compOptionString = "paper";
        if(compOptionNum == 2) compOptionString = "scissor";  

        //Create the cases to determine the winner
        if(userOptionString.equals("rock")){
            if(compOptionString.equals("rock"))
                System.out.printf("The computer is %s. You are %s. This is a draw.\n",compOptionString, userOptionString);
            if(compOptionString.equals("paper"))
                System.out.printf("The computer is %s. You are %s. You lose.\n",compOptionString, userOptionString);
            if(compOptionString.equals("scissor"))
                System.out.printf("The computer is %s. You are %s. You win.\n",compOptionString, userOptionString);
        }else if(compOptionString.equals("paper")){
            if(compOptionString.equals("rock"))
                System.out.printf("The computer is %s. You are %s. You win.\n",compOptionString, userOptionString);
            if(compOptionString.equals("paper"))
                System.out.printf("The computer is %s. You are %s. This is a draw.\n",compOptionString, userOptionString);
            if(compOptionString.equals("scissor"))
                System.out.printf("The computer is %s. You are %s. You lose.\n",compOptionString, userOptionString);
        }else if(compOptionString.equals("scissor")){
            if(compOptionString.equals("rock"))
                System.out.printf("The computer is %s. You are %s. You lose.\n",compOptionString, userOptionString);
            if(compOptionString.equals("paper"))
                System.out.printf("The computer is %s. You are %s. You win.\n",compOptionString, userOptionString);
            if(compOptionString.equals("scissor"))
                System.out.printf("The computer is %s. You are %s. This is a draw.\n",compOptionString, userOptionString);
        }

    }
}
