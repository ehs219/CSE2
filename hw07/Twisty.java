//This program prints a twist pattern that depends on the width and length inputted by the user.

import java.util.Scanner;

public class Twisty {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int length = 0; //length of the twist
        int width = 0; //width of the twist
        boolean positiveInt = false; //this tells if the value entered is an acceptable number
        
        while (!positiveInt) { //determines if the input is an acceptable number
            System.out.print("Input your desired length: ");
            if (input.hasNextInt()) { //determines if the input is an integer
                length = input.nextInt();
                if (length > 1 && length <= 80) { //determines if the input is less than 80 and greater than 1 because if it is 1 then there would be no number that the width could be
                    positiveInt = true;
                } else {
                    System.out.println("Error: please type in an integer less than or equal to 80 and greater than 1.");
                }
            } else {
                System.out.println("Error: please type in an integer.");
                input.next();
            }
        }
        
        positiveInt = false;
        
        while (!positiveInt) { //determines if the input is an acceptable number
            System.out.print("Input your desired width: ");
            if (input.hasNextInt()) { //determines if the input is an integer
                width = input.nextInt();
                if (width > 0 && width < length) { //determines if the input is positive and less than the length
                    positiveInt = true;
                } else if (width >= length) { //determines if the width is greater than the length
                    System.out.println("Error: Please input an integer smaller than the length.");
                } else {
                    System.out.println("Error: please type in an integer.");
                }
            } else {
                System.out.println("Error: please type in an integer.");
                input.next();
            }
        }
        
        int width2 = width * 2;
        
        for (int line=1; line<=width; line++) { //this repeats it for each line
            for (int place=1; place<=length; place++) { //this makes it go to the next place in the line
                if (place%width2 == line) { //prints # if place % 2 times the width is equal to the line number
                    System.out.print("#");
                } else if (place%width2 == width-line+1) { //prints / if place % 2 times the width is equal to the width - line number + 1
                    System.out.print("/");
                } else if (place%width2 == width+line || (line==width && place%width2 ==0) ) { //prints \. There is another condition because for one place the other condition does not work
                    System.out.print("\\");
                } else if (place%width2 == width2-line+1 || (line==1 && place%width2 ==0)) { //prints #. There is another condition because for one place the other condition does not work 
                    System.out.print("#");
                } else { //prints a space for all the other places
                    System.out.print(" ");
                }
            }
            System.out.print("\n"); //goes to the next line
        }
        
        
        
    }
}