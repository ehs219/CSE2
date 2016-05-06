//

import java.util.Random;
import java.util.Scanner;

public class Holoporter {
    
    
    public static String[][][] soRandom() { //creates a method that returns a three dimensional String array
        
        String[][][] array = new String[(int) Math.random() * 10 + 1][][]; //creates a new three dimensional String array that is a random length from 1 to 10
        for (int i=0; i<array.length; i++) { //this goes through the first dimension of the array
            array[i] = new String[(int) Math.random() * 10 + 1][]; //this creates a new two dimensional array for each part of the first dimension of the array
            for (int j=0; j<array[i].length; j++) { //this goes through the second dimension of the array
                array[i][j] = new String[(int) Math.random() * 10 + 1]; //this creates a new array for each part
            }
        }
        
        return array;
    }
    
    
    
    public static String coder() { //creates a method that returns a String
        
        Random r = new Random();
        char letter1 = (char) (r.nextInt(26) + 1); //creates a char that is a random letter
        char letter2 = (char) (r.nextInt(26) + 1);
        int num1 = r.nextInt(10); //generates a random number from 0 to 9
        int num2 = r.nextInt(10);
        int num3 = r.nextInt(10);
        int num4 = r.nextInt(10);
        String code = letter1 + letter2 + Integer.toString(num1) + Integer.toString(num2) + Integer.toString(num3) + Integer.toString(num4); //combines them to make the code
        
        return code;
        
    }
    
    
    public static void print(String[][][] array) { //creates a void method that takes a three dimensional String array as an input
        
        for (int i=0; i<array.length; i++) { //goes through the first dimension of the array
            for (int j=0; j<array[i].length; j++) { //goes through the second dimension of the array
                System.out.print("[");
                for (int k=0; k<array[i][j].length; k++) { //goes through the third dimension of the array
                    System.out.print(array[i][j][k]); //prints each code in the array
                    if (k != array[i][j].length - 1) { //this will print if it gets to the end of the array
                        System.out.print(", ");
                    }
                }
                System.out.print("]");
                if (j != array[i].length - 1) { //this will print if it gets to the end of the array
                    System.out.print(" | ");
                }
            }
            if (i != array.length - 1) { //this will print if it gets to the end of the array
                System.out.print("---");
            }
        }
        
    }
    
    
    public static void holoport(String[][][] array1, String[][][] array2) { //creates a new method
        
        for (int i=0; i<array2.length; i++) { //goes through the first dimension of one of the arrays
            for (int j=0; j<array2[i].length; j++) { //goes through the second dimension of one of the arrays
                for (int k=0; k<array2[i][j].length; k++) { //goes through the third dimension of one of the arrays
                    if (k < array1[i][j].length - 1) {
                        array2[i][j][k] = array1[i][j][k]; //this will go into array2 while the elements of array1 fit into array2
                    } else {
                        array2[i][j][k] = "$$$$$$"; //if there is extra room in array2 then this will go into each extra element of the array
                    }
                }
            }
        }
        
    }
    
    
    
    
    public static void sampling(String[][][] array, String find) { //creates a new method
        
        int i = 0;
        int j = 0;
        int k = 0;
        boolean found = false; //checks if the code was found
        int x = 0; //x position
        int y = 0; //y position
        int z = 0; //z position
        
        while (i<array.length && !found) { //this goes through the first dimension of the array while the code is not found
            while (j<array[i].length && !found) { //this goes through the second dimension of the array while the code is not found
                while (k<array[i][j].length && !found) { //this goes through the third dimension of the array while the code is not found
                    if (array[i][j][k].equals(find)) { //checks if the code was found
                        x = i; //x position of the found code
                        y = j; //y position of the found code
                        z = k; //z position of the found code
                        found = true;
                    }
                    k++; //adds 1 to k
                }
                j++; //adds 1 to j
            }
            i++; //adds 1 to i
        }
        
        if (found) { //tells where it was found if the code was found
            System.out.println(find + " was found at (" + x + ", " + y + ", " + z + ")");
        } else { //this will print if the code was not found
            System.out.println("Code not found");
        }
        
    }
    
    
    public static void percentage(String[][][] array1, String[][][] array2) {
        
        int count1 = 0; //counts the length of one array
        int count2 = 0; //counts the length of the other array
        
        for (int i=0; i<array1.length; i++) { //goes through the first dimension of the array
            for (int j=0; j<array1[i].length; j++) { //goes through the second dimension of the array
                for (int k=0; k<array1[i][j].length;) { //goes through the third dimension of the array
                    count1++; //adds 1 to count1 to count how many
                }
            }
        }
        
        for (int i=0; i<array2.length; i++) { //goes through the first dimension of the array
            for (int j=0; j<array2[i].length; j++) { //goes through the second dimension of the array
                for (int k=0; k<array2[i][j].length;) { //goes through the third dimension of the array
                    count2++; //adds 1 to count2 to count how many
                }
            }
        }
        
        int percent = (count2 - count1) / count1 * 100; //calculates the percentage
        System.out.println(percent + "%"); //prints the percentage
        
    }
    
    
    
    public static void frankenstein(String[][][] array) { //creates a new method
        
        String code = "";
        int place = 0;
        boolean changed = false;
        for (int i=0; i<array.length; i++) { //goes through the first dimension of the array
            for (int j=0; j<array[i].length; j++) { //goes through the second dimension of the array
                for (int n=0; n<array[i][j].length; n++) {
                    for (int k=j+1; k<array[i][j].length; k++) {
                        code = array[i][j][k];
                        if ((int) array[i][j][k].charAt(0) < (int) code.charAt(0)) {
                            code = array[i][j][k];
                            place = k;
                            changed = true;
                        }
                    }
                    if (changed) {
                    array[i][j][place] = array[i][j][n];
                    array[i][j][n] = code;
                    changed = false;
                    }
                }
            }
        }
    }
    
    
    
    public static void main(String[] args) { //main method
        
        String[][][] codes = soRandom(); //creates a new three dimensional String array and uses the method soRandom() to make all the arrays random lengths
        
        for (int i=0; i<codes.length; i++) { //goes through the main array
            for (int j=0; j<codes[i].length; j++) { //goes through the second dimension of the array
                for (int k=0; k<codes[i][j].length; k++) { //goes through the third dimension of the array
                    codes[i][j][k] = coder(); //assigns each member of the array to a 6 digit code generated by the coder() method
                }
            }
        }
        
        print(codes); //uses the print() method to print the whole codes array
        
        String[][][] codes2 = soRandom(); //creates an empty three dimensional ragged array
        
        holoport(codes, codes2); //uses the holoport method
        Scanner input = new Scanner(System.in);
        
        
        boolean acceptable = false;
        String find = "";
        while (!acceptable) { //checks if the input is acceptable
            System.out.print("Enter the code to find: ");
            find = input.next(); //sets the input equal to a String called find
            if (find.length() == 6) { //checks if the length of the string is 6
                if (Character.isDigit(find.charAt(2)) && Character.isDigit(find.charAt(3)) && Character.isDigit(find.charAt(4)) && Character.isDigit(find.charAt(5))) { //checks if the last for chars of the string are digits
                    if (Character.isLetter(find.charAt(0)) && Character.isLetter(find.charAt(1))) { //checks if the first two characters of the String are letters
                        acceptable = true;
                    } else {
                        System.out.println("Please enter a valid input.");
                    }
                } else {
                    System.out.println("Please enter a valid input.");
                }
            } else {
                System.out.println("Please enter a valid input.");
            }
        }
        
        sampling(codes2, find); //calls the sampling method
        percentage(codes, codes2); //calls the percentage method
    }
    
    
}