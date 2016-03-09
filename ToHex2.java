import java.util.Scanner;

public class ToHex {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter three numbers representing RGB values: "); //asks the user for RGB values
        int R = input.nextInt();
        int G = input.nextInt();
        int B = input.nextInt();
        
        String hexR = "";
        String hexR2 = "";
        String hexG = "";
        String hexG2 = "";
        String hexB = "";
        String hexB2 = "";
        
        switch ((int) R/16) {
            case 0:
                hexR = 0;
                break;
            case 1:
                hexR = 1;
                break;
            case 2:
                hexR = 2;
                break;
            case 3:
                hexR = 3;
                break;
            case 4:
                hexR = 4;
                break;
            case 5:
                hexR = "5";
                break;
            case 6:
                hexR = "6";
                break;
            case 7:
                hexR = "7";
                break;
            case 8:
                hexR = "8";
                break;
            case 9:
                hexR = "9";
                break;
            case 10:
                hexR = "A";
                break;
            case 11:
                hexR = "B";
                break;
            case 12:
                hexR = "C";
                break;
            case 13:
                hexR = "D";
                break;
            case 14:
                hexR = "E";
                break;
            case 15:
                hexR = "F";
                break;
        }
        
        switch ((int) G/16) {
            case 0:
                hexG = 0;
                break;
            case 1:
                hexG = 1;
                break;
            case 2:
                hexG = 2;
                break;
            case 3:
                hexG = 3;
                break;
            case 4:
                hexG = 4;
                break;
            case 5:
                hexG = "5";
                break;
            case 6:
                hexG = "6";
                break;
            case 7:
                hexG = "7";
                break;
            case 8:
                hexG = "8";
                break;
            case 9:
                hexG = "9";
                break;
            case 10:
                hexG = "A";
                break;
            case 11:
                hexG = "B";
                break;
            case 12:
                hexG = "C";
                break;
            case 13:
                hexG = "D";
                break;
            case 14:
                hexG = "E";
                break;
            case 15:
                hexG = "F";
                break;
        }
        
        switch ((int) B/16) {
            case 0:
                hexB = 0;
                break;
            case 1:
                hexB = 1;
                break;
            case 2:
                hexB = 2;
                break;
            case 3:
                hexB = 3;
                break;
            case 4:
                hexB = 4;
                break;
            case 5:
                hexB = "5";
                break;
            case 6:
                hexB = "6";
                break;
            case 7:
                hexB = "7";
                break;
            case 8:
                hexB = "8";
                break;
            case 9:
                hexB = "9";
                break;
            case 10:
                hexB = "A";
                break;
            case 11:
                hexB = "B";
                break;
            case 12:
                hexB = "C";
                break;
            case 13:
                hexB = "D";
                break;
            case 14:
                hexB = "E";
                break;
            case 15:
                hexB = "F";
                break;
        }
        
        switch (R%16) {
            case 0:
                hexR2 = "0";
                break;
            case 1:
                hexR2 = "1";
                break;
            case 2:
                hexR2 = "2";
                break;
            case 3:
                hexR2 = "3";
                break;
            case 4:
                hexR2 = "4";
                break;
            case 5:
                hexR2 = "5";
                break;
            case 6:
                hexR2 = "6";
                break;
            case 7:
                hexR2 = "7";
                break;
            case 8:
                hexR2 = "8";
                break;
            case 9:
                hexR2 = "9";
                break;
            case 10:
                hexR2 = "A";
                break;
            case 11:
                hexR2 = "B";
                break;
            case 12:
                hexR2 = "C";
                break;
            case 13:
                hexR2 = "D";
                break;
            case 14:
                hexR2 = "E";
                break;
            case 15:
                hexR2 = "F";
                break;
        }
        
        switch (R%16) {
            case 0:
                hexG2 = "0";
                break;
            case 1:
                hexG2 = "1";
                break;
            case 2:
                hexG2 = "2";
                break;
            case 3:
                hexG2 = "3";
                break;
            case 4:
                hexG2 = "4";
                break;
            case 5:
                hexG2 = "5";
                break;
            case 6:
                hexG2 = "6";
                break;
            case 7:
                hexG2 = "7";
                break;
            case 8:
                hexG2 = "8";
                break;
            case 9:
                hexG2 = "9";
                break;
            case 10:
                hexG2 = "A";
                break;
            case 11:
                hexG2 = "B";
                break;
            case 12:
                hexG2 = "C";
                break;
            case 13:
                hexG2 = "D";
                break;
            case 14:
                hexG2 = "E";
                break;
            case 15:
                hexG2 = "F";
                break;
        }
        
        switch (R%16) {
            case 0:
                hexB2 = "0";
                break;
            case 1:
                hexB2 = "1";
                break;
            case 2:
                hexB2 = "2";
                break;
            case 3:
                hexB2 = "3";
                break;
            case 4:
                hexB2 = "4";
                break;
            case 5:
                hexB2 = "5";
                break;
            case 6:
                hexB2 = "6";
                break;
            case 7:
                hexB2 = "7";
                break;
            case 8:
                hexB2 = "8";
                break;
            case 9:
                hexB2 = "9";
                break;
            case 10:
                hexB2 = "A";
                break;
            case 11:
                hexB2 = "B";
                break;
            case 12:
                hexB2 = "C";
                break;
            case 13:
                hexB2 = "D";
                break;
            case 14:
                hexB2 = "E";
                break;
            case 15:
                hexB2 = "F";
                break;
        }