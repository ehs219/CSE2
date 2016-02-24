// This program uses three inputs as decimal numbers and converts them to hexadecimal.

import java.util.Scanner;

public class ToHex {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter three numbers representing RGB values: "); //asks the user for RGB values
        
        int R=0; //initializes values for R, G, and B
        int G=0;
        int B=0;
        
        if (input.hasNextInt()) { //checks that the inputs are integers
            R = input.nextInt();
            if (input.hasNextInt()) {
                G = input.nextInt();
                if (input.hasNextInt()) {
                    B = input.nextInt();
                }
            }
            if (R>=0 && R<=255 && G>=0 && G<=255 && B>=0 && B<=255) { //checks that the inputs are in the correct ranges
            
            char hexR = '0'; //initializes the variables that will be the numbers in hexadecimal
            char hexG = '0';
            char hexB = '0';
            char hexR2 = '0';
            char hexG2 = '0';
            char hexB2 = '0';
            
            if ( ((int) R/16) >=10 ) { //finds one digit of the R number in hexadecimal
                switch ((int) R/16) {
                    case 10:
                        hexR2 = 'A';
                        break;
                    case 11:
                        hexR2 = 'B';
                        break;
                    case 12:
                        hexR2 = 'C';
                        break;
                    case 13:
                        hexR2 = 'E';
                        break;
                    case 14:
                        hexR2 = 'E';
                        break;
                    case 15:
                        hexR2 = 'F';
                        break;
                }
            } 
            else {
                hexR2 = Integer.toString((int) R/16).charAt(0);
            }
            
            if ( ((int) G/16) >=10 ) { //finds one digit of the G number in hexadecimal
                switch ((int) G/16) {
                    case 10:
                        hexG2 = 'A';
                        break;
                    case 11:
                        hexG2 = 'B';
                        break;
                    case 12:
                        hexG2 = 'C';
                        break;
                    case 13:
                        hexG2 = 'E';
                        break;
                    case 14:
                        hexG2 = 'E';
                        break;
                    case 15:
                        hexG2 = 'F';
                        break;
                }
            } 
            else {
                hexG2 = Integer.toString((int) G/16).charAt(0);
            }
            
            if ( ((int) B/16) >=10 ) { //finds one digit of the B number in hexadecimal
                switch ((int) B/16) {
                    case 10:
                        hexB2 = 'A';
                        break;
                    case 11:
                        hexB2 = 'B';
                        break;
                    case 12:
                        hexB2 = 'C';
                        break;
                    case 13:
                        hexB2 = 'E';
                        break;
                    case 14:
                        hexB2 = 'E';
                        break;
                    case 15:
                        hexB2 = 'F';
                        break;
                }
            } 
            else {
                hexB2 = Integer.toString((int) B/16).charAt(0);
            }
    
            if (R%16 > 9) { //finds the other digit of the R number in hexadecimal
                switch (R%16) {
                    case 10:
                        hexR = 'A';
                        break;
                    case 11:
                        hexR = 'B';
                        break;
                    case 12:
                        hexR = 'C';
                        break;
                    case 13:
                        hexR = 'D';
                        break;
                    case 14:
                        hexR = 'E';
                        break;
                    case 15:
                        hexR = 'F';
                        break;
                }
            }
            else {
                hexR = Integer.toString((int)R%16).charAt(0);
            }
            
            if (G%16 > 9) { //finds the other digit of the G number in hexadecimal
                switch (G%16) {
                    case 10:
                        hexG = 'A';
                        break;
                    case 11:
                        hexG = 'B';
                        break;
                    case 12:
                        hexG = 'C';
                        break;
                    case 13:
                        hexG = 'D';
                        break;
                    case 14:
                        hexG = 'E';
                        break;
                    case 15:
                        hexG = 'F';
                        break;
                }
            }
            else {
                hexG = Integer.toString((int)G%16).charAt(0);
            }
            
            switch (B%16) { //finds the other digit of the B number in hexadecimal
                case 0:
                    hexB = '0';
                    break;
                case 1:
                    hexB = '1';
                    break;
                case 2:
                    hexB = '2';
                    break;
                case 3:
                    hexB = '3';
                    break;
                case 4:
                    hexB = '4';
                    break;
                case 5:
                    hexB = '5';
                    break;
                case 6:
                    hexB = '6';
                    break;
                case 7:
                    hexB = '7';
                    break;
                case 8:
                    hexB = '8';
                    break;
                case 9:
                    hexB = '9';
                    break;
                case 10:
                    hexB = 'A';
                    break;
                case 11:
                    hexB = 'B';
                    break;
                case 12:
                    hexB = 'C';
                    break;
                case 13:
                    hexB = 'D';
                    break;
                case 14:
                    hexB = 'E';
                    break;
                case 15:
                    hexB = 'F';
                    break;
            }
            
            System.out.println("The decimal numbers R: "+R+", G: "+G+", B: "+B+", is represented in hexadecimal as: "+hexR2+hexR+hexG2+hexG+hexB2+hexB);
            }
            else {
                System.out.println("Sorry, you must enter values between 0 and 255");
            }
        } else {
            System.out.println("Sorry, your input must consist of integers");
        }
        

    }
}