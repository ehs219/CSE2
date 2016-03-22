//

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean positiveInt = false; //this tells if the value entered is an integer between 5 and 30
        int number = 0; //this will be the number that the user inputs
        
        while (!positiveInt) { //determines if the input is a positive integer between 5 and 30
            System.out.print("Enter a number between 5 and 30: ");
            if (input.hasNextInt()) { //determines if the input is an integer
                number = input.nextInt();
                if (number >= 5 && number <= 30) { //determines if the number is between 5 and 30
                    positiveInt = true;
                } else {
                    System.out.println("It has to be an integer between 5 and 30.");
                }
            } else {
                System.out.println("It has to be an integer between 5 and 30.");
                input.next();
            }
        }
        
        System.out.println("\nFOR LOOP:");
        for (int i=1; i<=number; i++) { //this repeats until half of the triangle is printed
            for (int j=0; j<i; j++) { //this repeats each number that number of times
                System.out.print(i); //this prints the number
            }
            System.out.print("\n"); //next line
        }
        for (int k=number-1; k>0; k--) { //this repeats until the other half of the triangle is printed
            for (int m=0; m<k; m++) { //this repeats printing each number that number of times
                System.out.print(k); //prints the number
            }
            System.out.print("\n"); //next line
        }
        
        int i = 1; //counts the lines
        int j = 0; //counts the numbers in each line
        System.out.println("\nWHILE LOOP:");
        while (i <= number) { //this repeats until half of the triangle is printed
            while (j<i) { //this repeats each number that number of times
                System.out.print(i);
                j++; //adds 1 to j
            }
            System.out.print("\n"); //next line
            i++; //adds 1 to i
            j=0; //sets j back to 0
        }
        i = number-1; //sets i equal to the number - 1 so it does not repeat the longest line
        while (i > 0) { //repeats for the other half of the triangle
            while (j < i) { //repeats printing the number that number of times
                System.out.print(i);
                j++; //adds 1 to j
            }
            System.out.print("\n");
            i--; //subtracts 1 from i because now it is going down
            j=0; //sets j back to 0
        }
        
        i = 1; //counts the lines
        j = 0; //counts the numbers in each line
        System.out.println("\nDO-WHILE LOOP:");
        do {
            do {
                System.out.print(i); //prints the number
                j++; //adds 1 to j
            } while (j < i); //repeats the number of times
            System.out.print("\n"); //next line
            i++; //adds 1 to i
            j=0; //sets j back to 0
        } while (i <= number); //repeats it for half of the triangle
        i = number - 1; //sets i equal to number - 1 so it does not repeat the longest line
        do {
            do {
                System.out.print(i); //prints the number
                j++; //adds 1 to j
            } while (j < i); //repeats the number of times
            System.out.print("\n"); //next line
            i--; //subtracts 1 from i because now it is going down
            j=0; //sets j back to 0
        } while (i > 0); //repeats it for the other half of the triangle
    }
}