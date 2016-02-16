// This program asks the user for dimensions of a pyramid and uses them to find the volume of the pyramid.

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        
        Scanner pyramid = new Scanner(System.in);
        System.out.print("The length of the base of the pyramid is (input length): "); //asks the user for length of the base
        double length = pyramid.nextDouble(); //stores the length as a double
        System.out.print("The width of the base of the pyramid is (input width): "); //asks the user for the width of the base 
        double width = pyramid.nextDouble(); //stores the width as a double
        System.out.print("The height of the pyramid is (input height): "); //asks the user for the height
        double height = pyramid.nextDouble(); //stores the height as a double
        
        double volume = length * width * height / 3; //calculates the volume of the pyramid
        System.out.println("The volume inside the pyramid is: " + volume);
        
    }
}