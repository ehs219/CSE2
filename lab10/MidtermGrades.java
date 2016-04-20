import java.util.Scanner;
import java.util.Random;

public class MidtermGrades {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();
        String[] students = new String[randomGenerator.nextInt(6)+5];
        
        for (int i=0; i<students.length; i++) {
            System.out.print("Enter a string: ");
            students[i] = input.next();
        }
        
        int[] midterm = new int[students.length];
        for (int j=0; j<midterm.length; j++) {
            midterm[j] = (int) (Math.random() * 100);
        }
        
        for (int k=0; k<students.length; k++) {
            System.out.print(students[k] + ": " + midterm[k] + "\n");
        }
        
    }
}