//This program gives the user the option to play three different games

import java.util.Scanner;
import java.util.Random;

public class Games {
    public static void guessTheBox() { //method for the guessTheBox game
        Random randomGenerator = new Random();
        Scanner input = new Scanner(System.in);
        boolean acceptable = false; //tells whether the input is acceptable
        int guess = 0; //the user's guess for which box it is
        
        int box1 = randomGenerator.nextInt(1); //chooses a random number from 0-1 for box1
        int box2 = randomGenerator.nextInt(1); //chooses a random number from 0-1 for box2
        int box3; //third box
        if (box1 == box2) { //if box1 and box2 are the same number then the prize is in box3
            box3 = 1 - box1; //sets box3 equal to either 0 or 1. Whatever the other two are not
        } else {
            box3 = randomGenerator.nextInt(1); //makes box3 either 1 or 0 randomly. this determines whether box1 or box2 wins because if it gets to this else statement then box3 cannot win
        }
        
        while (!acceptable) { //checks if the input is acceptable
            System.out.print("Guess box 1, 2, or 3: ");
            if (input.hasNextInt()) { //determines whether the input is an integer
                guess = input.nextInt(); //assigns guess to the integer
                if (guess >=1 && guess <= 3) { //determines if the input is 1, 2, or 3
                    acceptable = true; //this means it is an acceptable input
                } else { //this will print if the input is not acceptable
                    System.out.println("Enter either 1, 2, or 3.");
                }
            } else { //this will print if the input is not acceptable
                System.out.println("Enter either 1, 2, or 3.");
                input.next();
            }
        }
        
        if (guess == 1) { //the user guesses that the prize is in box1 (or that box1 is the different number)
            if (box1 != box2 && box1 != box3) { //determines if box1 is the box that is different from the other two
                System.out.println("congratulations. you win $5");
            } else { //if it is not different, this will print
                System.out.println("you lose");
            }
        } else if (guess == 2) { //the user guesses that the prize is in box2
            if (box2 != box1 && box2 != box3) { //determines if box2 is the box that is different from the other two
                System.out.println("congratulations. you win $5");
            } else { //if it is not different, this will print
                System.out.println("you lose");
            }
        } else { //the user guesses that the prize is in box3
            if (box3 != box1 && box3 != box2) { //determines if box3 is the box that is different from the other two
                System.out.println("congratulations. you win $5");
            } else { //if it is not different, this will print
                System.out.println("you lose");
            }
        }
    }
    
    public static void spinTheWheel() { //method for spinTheWheel game
        Random randomGenerator = new Random();
        Scanner input = new Scanner(System.in);
        boolean acceptable = false; //tells if the input is acceptable
        String color = ""; //user's guess of the color of the spin
        int number = 0; //user's guess of the number of the spin
        int spin = randomGenerator.nextInt(10); //randomly chooses the spin
        
        while (!acceptable) { //determines if the input is acceptable
            System.out.print("Guess the color: ");
            color = input.next(); //assigns color to the user's guess of the color
            color = color.toLowerCase(); //changes it to lower case so it does not matter if the user types with capital letters
            if (color.equals("black") || color.equals("red")) { //determines if the user inputs an acceptable color
                acceptable = true; //the input is acceptable
            } else {
                System.out.println("Please type black or red."); //this will print if the user does not input black or red
            }
        }
        acceptable = false; //assigns acceptable back to false so the next while loop will run
        
        while (!acceptable) { //determines if the input is acceptable
            System.out.print("Guess the number: ");
            if (input.hasNextInt()) { //determines if the user inputs an integer
                number = input.nextInt(); //assigns number to that integer
                if (number <=5 && number >= 1) { //determines if the number is between 1 and 5
                    acceptable = true; //the input is acceptable
                } else {
                    System.out.println("It has to be between 1 and 5."); //this will print if the number is not between 1 and 5
                }
            } else {
                System.out.println("Please type an integer between 1 and 5"); //this will print if the input is not an integer
                input.next();
            }
        }
        
        switch (spin) {
            case 0: //if the randomly generated number is 0, then red 1 wins
                if (color.equals("red") && number == 1) { //checks if color is red and number is 1
                    System.out.println("The spin was red 1. You win");
                } else {
                    System.out.println("The spin was red 1. You lose");
                }
                break;
            case 1: //if the randomly generated number is 1, then red 2 wins
                if (color.equals("red") && number == 2) { //checks if color is red and number is 2
                    System.out.println("The spin was red 2. You win");
                } else {
                    System.out.println("The spin was red 2. You lose");
                }
                break;
            case 2: //if the randomly generated number is 2, then red 3 wins
                if (color.equals("red") && number == 3) { //checks if color is red and number is 3
                    System.out.println("The spin was red 3. You win");
                } else {
                    System.out.println("The spin was red 3. You lose");
                }
                break;
            case 3: //if the randomly generated number is 3, then red 4 wins
                if (color.equals("red") && number == 4) { //checks if color is red and number is 4
                    System.out.println("The spin was red 4. You win");
                } else {
                    System.out.println("The spin was red 4. You lose");
                }
                break;
            case 4: //if the randomly generated number is 4, then red 5 wins
                if (color.equals("red") && number == 5) { //checks if color is red and number is 5
                    System.out.println("The spin was red 5. You win");
                } else {
                    System.out.println("The spin was red 5. You lose");
                }
                break;
            case 5: //if the randomly generated number is 5, then black 1 wins
                if (color.equals("black") && number == 1) { //checks if color is black and number is 1
                    System.out.println("The spin was black 1. You win");
                } else {
                    System.out.println("The spin was black 1. You lose");
                }
                break;
            case 6: //if the randomly generated number is 6, then black 2 wins
                if (color.equals("black") && number == 2) { //checks if color is black and number is 2
                    System.out.println("The spin was black 2. You win");
                } else {
                    System.out.println("The spin was black 2. You lose");
                }
                break;
            case 7: //if the randomly generated number is 7, then black 3 wins
                if (color.equals("black") && number == 3) { //checks if color is black and number is 3
                    System.out.println("The spin was black 3. You win");
                } else {
                    System.out.println("The spin was black 3. You lose");
                }
                break;
            case 8: //if the randomly generated number is 8, then black 4 wins
                if (color.equals("black") && number == 4) { //checks if color is black and number is 4
                    System.out.println("The spin was black 4. You win");
                } else {
                    System.out.println("The spin was black 4. You lose");
                }
                break;
            case 9: //if the randomly generated number is 9, then black 5 wins
                if (color.equals("black") && number == 5) { //checks if color is black and number is 5
                    System.out.println("The spin was black 5. You win");
                } else {
                    System.out.println("The spin was black 5. You lose");
                }
                break;
        }
        
    }
    
    
    public static void scrambler() { //method for scrambler game
        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();
        System.out.print("Enter a word: ");
        String word = input.next(); //the word the user inputs
        String word2 = ""; //this will store the word later
        
        for (int i=0; i<10; i++) { //repeats 10 times to scramble the letters enough
            int x = randomGenerator.nextInt(word.length()); //generates a random number between 0 and the length of the word the user inputs minus 1
            char letter = word.charAt(x); //assings a char called letter to a random letter of the word
            word2 = Character.toString(letter); //assings word2 to the randomly chosen letter as a String
            for (int j=1; j<word.length(); j++) { //repeats from j=1 because it should start from the second letter to the length of the word
                if (j!=x) { //when j is not the letter that was randomly chosen, word2 will become word2 plus the rest of the word. j counts the rest of the word.
                    word2 += Character.toString(word.charAt(j)); //adds the next letter
                } else { //when j=x it should add the first letter because it is replacing the first letter with the randomly chosen letter
                    word2 += Character.toString(word.charAt(0)); //adds the first letter where the randomly chosen letter was
                }
            }
            word = word2; //reassings word to the slightly more scrambled word
        }
        System.out.println(word); //prints the scrambled word
        
    }
    
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean acceptable = false; //tells if the input is acceptable
        String game = ""; //creates a String that will be the game the user chooses
        
        while (!acceptable) { //determines if the input is acceptable
            System.out.print("Enter the game you want to play: ");
            game = input.next(); //assings game to the user's input
            game = game.toLowerCase(); //makes it lower case so it can recognize it if the user typed it in differently
            if (game.equals("guessthebox")) { //if the user inputs guessTheBox then they will play that game
                acceptable = true; //acceptable input
                guessTheBox(); //calls guessTheBox method
            } else if (game.equals("spinthewheel")) { //if the user inputs spinTheWheel then they will play that game
                acceptable = true; //acceptable input
                spinTheWheel(); //calls spinTheWheel method
            } else if (game.equals("scrambler")) { //if the user inputs scrambler then they will play that game
                acceptable = true; //acceptable input
                scrambler(); //calls scrambler method
            } else {
                System.out.println("Type guessTheBox, spinTheWheel, or scrambler only"); //this will print if the user inputs something other than the name of one of the games
            }
        }
        
    }
}