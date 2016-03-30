//

import java.util.Scanner;

public class Rectangularize {
    public static void rectangle(int length) {
        for (int i=0; i<length; i++) {
            for (int j=0; j<length; j++) {
                System.out.print("%");
            }
            System.out.print("\n");
        }
    }
    
    public static void rectangle(String word) {
        for (int i=0; i<word.length(); i++) {
            System.out.print(word + "\n");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an input: ");
        if (input.hasNextInt()) {
            rectangle(input.nextInt());
        } else {
            rectangle(input.next());
        }
    }
}