// This program asks the user for the first two Fibonacci numbers and the amount of numbers to print and prints that many by
// adding the first two numbers together and then repeating it.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean positiveInt = false; //this tells if the value entered is a positive integer
        int a1 = 0; //first value
        int a2 = 0; //second value
        int n = 0; //number of Fibonacci numbers the program will print
        int i = 3; //starts on the third number
        int c; //this will be the next number in the sequence
        
        while (!positiveInt) { //determines if the input is a positive integer
            System.out.print("Enter the first number in the sequence: ");
            if (input.hasNextInt()) { //determines if the input is an integer
                a1 = input.nextInt();
                if (a1 > 0) { //determines if the input is positive
                    positiveInt = true;
                } else {
                    System.out.println("It has to be a positive integer.");
                }
            } else {
                System.out.println("It has to be a positive integer.");
                input.next();
            }
        }
        
        positiveInt = false; //reassigns the value of positiveInt to false so the next while loop will work
        
        while (!positiveInt) { //determines if the input is a positive integer
            System.out.print("Enter the second number in the sequence: ");
            if (input.hasNextInt()) { //determines if the input is an integer
                a2 = input.nextInt();
                if (a2 > 0) { //determines if the input is positive
                    positiveInt = true;
                } else {
                    System.out.println("It has to be a positive integer.");
                }
            } else {
                System.out.println("It has to be a positive integer.");
                input.next();
            }
        }
        
        positiveInt = false; //reassigns the value of positiveInt to false so the next while loop will work
        
        while (!positiveInt) { //determines if the input is a positive integer
            System.out.print("Enter the number of Fibonacci numbers to print out: ");
            if (input.hasNextInt()) { //determines if the input is an integer
                n = input.nextInt();
                if (n > 0) { //determines if the input is positive
                    positiveInt = true;
                } else {
                    System.out.println("It has to be a positive integer.");
                }
            } else {
                System.out.println("It has to be a positive integer.");
                input.next();
            }
        }
        
        
        System.out.println("The numbers are:\n");
        System.out.print(a1 + ", " + a2 + ", "); //prints the first two numbers
        while (i < n) { //repeats while i<n because there are n numbers and the last one is printed differently
            c = a1 + a2; //adds the last two numbers to get the next number
            a1 = a2; //reassigns the value of a1 to a2 which is the next number in the sequence
            a2 = c; //reassigns the value of a2 to c which is the number after a2
            System.out.print(c + ", ");
            i = i + 1; //adds 1 to i which is the counter variable
        }
        c = a1 + a2; //adds a1 and a2 to get the last number
        System.out.print(c + ".\n"); //prints the last number with a period at the end instead of a comma
    }
}