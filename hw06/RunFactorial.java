//

import java.util.Scanner;

public class RunFactorial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = 0; //the number to use the factorial
        boolean positiveInt = false; //this tells if the value entered is a positive integer
        
        while (!positiveInt) { //determines if the input is a positive integer
            System.out.print("Enter an integer between 9 and 16: ");
            if (input.hasNextInt()) { //determines if the input is an integer
                n = input.nextInt();
                if (n >= 9 && n <= 16) { //determines if the input is positive
                    positiveInt = true;
                } else {
                    System.out.println("Invalid input, enter again!");
                }
            } else {
                System.out.println("Invalid input, enter again!");
                input.next();
            }
        }
        
        int m = n; //this stores the value of n in another variable because this variable will change but it needs to remember n
        int factorial = 1; //this will be the total factorial
        
        while (m>1) { //repeats multiplying the total by one number less until it gets to 1
            factorial=factorial*m; //multiplies the total by the next number one less than the number before
            m--; //decreases m by 1
        }
        
        System.out.println("Input accepted:");
        System.out.println(n + "! = " + factorial);
        
    }
}