import java.util.Scanner;

public class ToHex {
    public static void main(String[] args) {
        
        Scanner hexadecimal = new Scanner(System.in);
        System.out.print("Please enter three numbers representing RGB values. R: "); //asks the user for RGB values
        int R = hexadecimal.nextInt();
        System.out.print("G: ");
        int G = hexadecimal.nextInt();
        System.out.print("B: ");
        int B = hexadecimal.nextInt();
        
        String HexR = "";
        String HexG = "";
        String HexB = "";
        int HexR2 = (int) R/16;
        int HexG2 = (int) G/16;
        int HexB2 = (int) B/16;
        
        switch (R%16) {
            case 0:
                HexR = "0";
                break;
            case 1:
                HexR = "1";
                break;
            case 2:
                HexR = "2";
                break;
            case 3:
                HexR = "3";
                break;
            case 4:
                HexR = "4";
                break;
            case 5:
                HexR = "5";
                break;
            case 6:
                HexR = "6";
                break;
            case 7:
                HexR = "7";
                break;
            case 8:
                HexR = "8";
                break;
            case 9:
                HexR = "9";
                break;
            case 10:
                HexR = "A";
                break;
            case 11:
                HexR = "B";
                break;
            case 12:
                HexR = "C";
                break;
            case 13:
                HexR = "D";
                break;
            case 14:
                HexR = "E";
                break;
            case 15:
                HexR = "F";
                break;
        }
        
        switch (G%16) {
            case 0:
                HexG = "0";
                break;
            case 1:
                HexG = "1";
                break;
            case 2:
                HexG = "2";
                break;
            case 3:
                HexG = "3";
                break;
            case 4:
                HexG = "4";
                break;
            case 5:
                HexG = "5";
                break;
            case 6:
                HexG = "6";
                break;
            case 7:
                HexG = "7";
                break;
            case 8:
                HexG = "8";
                break;
            case 9:
                HexG = "9";
                break;
            case 10:
                HexG = "A";
                break;
            case 11:
                HexG = "B";
                break;
            case 12:
                HexG = "C";
                break;
            case 13:
                HexG = "D";
                break;
            case 14:
                HexG = "E";
                break;
            case 15:
                HexG = "F";
                break;
        }
        
        switch (B%16) {
            case 0:
                HexB = "0";
                break;
            case 1:
                HexB = "1";
                break;
            case 2:
                HexB = "2";
                break;
            case 3:
                HexB = "3";
                break;
            case 4:
                HexB = "4";
                break;
            case 5:
                HexB = "5";
                break;
            case 6:
                HexB = "6";
                break;
            case 7:
                HexB = "7";
                break;
            case 8:
                HexB = "8";
                break;
            case 9:
                HexB = "9";
                break;
            case 10:
                HexB = "A";
                break;
            case 11:
                HexB = "B";
                break;
            case 12:
                HexB = "C";
                break;
            case 13:
                HexB = "D";
                break;
            case 14:
                HexB = "E";
                break;
            case 15:
                HexB = "F";
                break;
        }
        
        System.out.println(HexR2+HexR+HexG2+HexG+HexB2+HexB);
        
    }
}