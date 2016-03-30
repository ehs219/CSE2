//This program runs a method that either prints a word the length of the word times, or prints % the input amount of times on each line and that many lines of it

import java.util.Scanner;

public class Rectangularize {
    public static void rectangle(int length) { //creates rectangle method for an integer input
        for (int i=0; i<length; i++) { //repeats each line the input amount of times
            for (int j=0; j<length; j++) { //repeats printing '%' the input amount of times on one line
                System.out.print("%");
            }
            System.out.print("\n"); //next line
        }
    }
    
    public static void rectangle(String word) { //creates the rectangle method for a String
        for (int i=0; i<word.length(); i++) { //repeats printing the word on a separate line the length of the word amount of times
            System.out.print(word + "\n"); //prints the word and then goes to the next line
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an input: ");
        if (input.hasNextInt()) { //checks if the input is an integer
            rectangle(input.nextInt()); //calls the method for an integer
        } else { //the input is a String
            rectangle(input.next()); //calls the method for a String
        }
    }
}