// This program converts meters to inches.

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        
        Scanner convert = new Scanner( System.in );
        System.out.print("Enter a distance in meters: "); //asks the user for a measurement in meters
        double measurementMeters = convert.nextDouble(); //stores it as a double
        
        double measurementInches = measurementMeters * 39.37; //converts the measurement from meters to inches
        System.out.println(measurementMeters + " meters is " + measurementInches + " inches");
        
    }
}