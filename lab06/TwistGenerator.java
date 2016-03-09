//This program asks the user for a length and then generates a twist of that length

import java.util.Scanner;

public class TwistGenerator {
    public static void main(String[] args) {
        
        int length = 0; //length of the twist
        boolean positiveInt = false; //this tells if the value entered is a positive integer
        int i = 0; //counts the number of things to print on each line
        Scanner input = new Scanner(System.in);
        
        while (!positiveInt) { //determines if the input is a positive integer
            System.out.print("Input twist length: ");
            if (input.hasNextInt()) { //determines if the input is an integer
                length = input.nextInt();
                if (length > 0) { //determines if the input is positive
                    positiveInt = true;
                } else {
                    System.out.println("It has to be a positive integer.");
                }
            } else {
                System.out.println("It has to be a positive integer.");
                input.next();
            }
        }
        
        int a = length / 3; //finds the amount of Xs to print
        
        while (i<a) { //prints the lines in the top row 
            System.out.print("\\ /");
            i++;
        }
        if (length%3 == 1 || length%3 == 2) { //prints extra lines in the top row if there needs to be more than the amount of Xs there are
            System.out.print("\\ ");
        }
        System.out.print("\n"); //goes to the next line
        i = 0;
        
        while (i<a) { //prints the Xs in the second row
            System.out.print(" X ");
            i++;
        }
        i = 0;
        if (length%3 == 2) { //prints an extra X if there needs to be an extra at the end
            System.out.print(" X");
        }
        System.out.print("\n"); //goes to the next line
        
        while (i<a) { //prints the lines in the third row
            System.out.print("/ \\");
            i = i + 1;
        }
        if (length%3 == 1 || length%3 == 2) { //prints an extra line in the third row if there needs to be an extra line
            System.out.print("/ ");
        }
        System.out.print("\n "); //goes to the next line
        
    }
}