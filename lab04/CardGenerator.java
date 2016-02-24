//This program generates a random card from a deck of cards

public class CardGenerator {
    public static void main(String[] args) {
        
        int card = (int) (Math.random()*52)+1; //this generates a random number from 1-52
        String suit;
        String cardNumber = "";
        
        if (card<=13) { //this assigns the suit
            suit = "Diamonds";
        }
        else if (card<=26) {
            suit = "Clubs";
        }
        else if (card<=39) {
            suit = "Hearts";
        }
        else {
            suit = "Spades";
        }
        
        switch (card%13) { //assigns the card number
            case 0:
                cardNumber = "King";
                break;
            case 1:
                cardNumber = "Queen";
                break;
            case 2:
                cardNumber = "Jack";
                break;
            case 3:
                cardNumber = "10";
                break;
            case 4:
                cardNumber = "9";
                break;
            case 5:
                cardNumber = "8";
                break;
            case 6:
                cardNumber = "7";
                break;
            case 7:
                cardNumber = "6";
                break;
            case 8:
                cardNumber = "5";
                break;
            case 9:
                cardNumber = "4";
                break;
            case 10:
                cardNumber = "3";
                break;
            case 11:
                cardNumber = "2";
                break;
            case 12:
                cardNumber = "Ace";
                break;
        }
        
        System.out.println("You picked the "+cardNumber+" of "+suit);
    }    
}