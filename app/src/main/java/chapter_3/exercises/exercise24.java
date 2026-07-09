package chapter_3.exercises;
/* 3.24 (Game: pick a cord) Write a program that simulates picking a card from a deck of 
52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, Jack, Queen, 
King) and suit (Clubs, Diamonds, Hearts, Spades) of the card*/

public class exercise24 {
    public static void main(String[] args){
        int cardNum = (int) (Math.random() * 13);
        int suitNum = (int)(Math.random() * 4);

        String cardString = "";
        String suitString = "";

        switch(cardNum){
            case 0: cardString = "Ace";break;
            case 1: cardString = "2";break;
            case 2: cardString = "3";break;
            case 3: cardString = "4";break;
            case 4: cardString = "5";break;
            case 5: cardString = "6";break;
            case 6: cardString = "7";break;
            case 7: cardString = "8";break;
            case 8: cardString = "9";break;
            case 9: cardString = "10";break;
            case 10: cardString = "Jack";break;
            case 11: cardString = "Queen";break;
            case 12: cardString = "King";break;
        }

        switch(suitNum){
            case 0: suitString = "Clubs";break;
            case 1: suitString = "Diamonds";break;
            case 2: suitString = "Hearts";break;
            case 3: suitString = "Spades";break;
        }
        //Display the results
        System.out.printf("The card you picked is %s of %s", cardString, suitString);
    }
}
