// This program does linear search on arrays

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear {
    
    public static void linearSearch(int[] numbers, int search) { //method that does a linear search
        int count = 0; //variable to count how many times a number is in the list
        for (int i=0; i<numbers.length; i++) { //repeats for how long the array is
            if (numbers[i] == search) { //this will run if the number in the i position of the numbers array equals the number it is searching for
                System.out.println(search + " was found in the list with " + (i+1) + " iterations");
                count++; //counts how many times the number is in the list
            } else {
                if (i == numbers.length - 1 && count == 0) { //this will run if it gets to the end of the list and the number was not found
                    System.out.println(search + " was not found in the list with " + (i+1) + " iterations");
                }
            }
        }
    }
    
    public static void scramble(int[] numbers) { //method to scramble the numbers in an array
        int target = 0; //this will be the random place in the array to switch with
        int temp = 0; //variable to hold the place of numbers in the array while they are being scrambled
        for (int i=0; i<numbers.length; i++) {
            target = (int) (numbers.length * Math.random()); //finds a random number to swap with
            temp = numbers[target]; //stores the old value for numbers[target]
            numbers[target] = numbers[i]; //stores numbers[i] where the value for temp was
            numbers[i] = temp; //stores the old value for numbers[target] where numbers[i] was
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean acceptable = false; //this tells if the value entered is an acceptable number
        int[] grades = new int[15]; //creates a new array of length 15
        int val = 0; //stores the value of each part of the array
        int val1 = 0; //stores the value of the last part of the array
        
        for (int i=0; i<15; i++) { //this repeats it 15 times for each part of the array
            acceptable = false;
            while (!acceptable) { //determines if the input is acceptable and if the loop should run again
                System.out.print("Enter an int: ");
                if (input.hasNextInt()) { //determines if the input is an integer
                    val = input.nextInt(); //assigns the input to the int val
                    if (val >= 0 && val <= 100) { //determines if the input is in the acceptable range
                        if (val >= val1) { //determines if the input is greater than or equal to the last value entered
                            acceptable = true;
                            grades[i] = val; //assings the input to a new part of the array
                            val1 = val; //assigns the value of val to val1
                        } else {
                            System.out.println("Error: the value entered should be greater than the last value entered");
                        }
                    } else {
                        System.out.println("Error: the value entered should be greater than or equal to 0 and less than or equal to 100");
                    }
                } else {
                    System.out.println("Error: please type an integer");
                    input.next();
                }
            }
        }
        
        System.out.println("Sorted:");
        for (int j=0; j<15; j++) { //repeats 15 times
            System.out.print(grades[j] + " ");
        }
        System.out.print("\n"); //next line
        
        acceptable = false;
        int find = 0; //number to search for
        while (!acceptable) { //determines if the input is acceptable and if the loop should run again
            System.out.print("Enter a grade to search for: ");
            if (input.hasNextInt()) { //determines if the input is an integer
                find = input.nextInt(); //assings the input to the int search
                acceptable = true;
            } else {
                System.out.println("The value entered should be an integer.");
                input.next();
            }
        }
        
        linearSearch(grades, find); //calls the method linearSearch
        scramble(grades); //calls the method scramble
        
        System.out.println("Scrambled:");
        for (int j=0; j<15; j++) { //repeats 15 times
            System.out.print(grades[j] + " ");
        }
        System.out.print("\n");  //next line
        
        acceptable = false;
        while (!acceptable) { //determines if the input is acceptable and if the loop should run again
            System.out.print("Enter a grade to search for: ");
            if (input.hasNextInt()) { //determines if the input is an integer
                find = input.nextInt(); //assings the input to the int search
                acceptable = true;
            } else {
                System.out.println("The value entered should be an integer.");
                input.next();
            }
        }
        
        linearSearch(grades, find); //calls the method linearSearch
        
    }
}