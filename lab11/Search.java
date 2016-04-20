import java.util.Random;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        
     Random randomGenerator = new Random();
     Scanner input = new Scanner(System.in);
     
     int[] array1 = new int[50];
     int[] array2 = new int[50];
     
     for (int i=0; i<50; i++) {
         array1[i] = randomGenerator.nextInt(101);
     }
     
     int max = 0;
     int min = 100;
     
     for (int j=0; j<50; j++) {
         if (array1[j] > max) {
             max = array1[j];
         }
         if (array1[j] < min) {
             min = array1[j];
         }
     }
     System.out.println("The maximum of array1 is: " + max);
     System.out.println("The minimum of array1 is: "+ min);
     
     array2[0] = randomGenerator.nextInt(101);
     for (int k=1; k<50; k++) {
         array2[k] = (int) (Math.random()*100 + array2[k-1]);
     }
     
     min = 100;
     max = 0;
     for (int j=0; j<50; j++) {
         if (array2[j] > max) {
             max = array2[j];
         }
         if (array2[j] < min) {
             min = array2[j];
         }
     }
     System.out.println("The maximum of array2 is: " + max);
     System.out.println("The minimum of array2 is: "+ min);
     
     int find = 0;
     System.out.print("Enter an integer greater than or equal to 0: ");
     if (input.hasNextInt()) {
         find = input.nextInt();
         if (find < 0) {
             System.out.println("You did not enter an int > 0");
             return;
         }
     } else {
         System.out.println("You did not enter an int");
         return;
     }
     
     int low = 0;
     int high = 49;
     int mid = 0;
     int below = 0;
     int above = 0;
     
     while (high >= low) {
         mid = (low + high) / 2;
         if (array2[mid] == find) {
             System.out.println(find + " was found in the list");
             break;
         } else if (array2[mid] < find) {
             low = mid + 1;
             below = array2[mid];
         } else if (array2[mid] > find) {
             high = mid - 1;
             above = array2[mid];
         }
     }
     System.out.println(find + " was not found in the list");
     if (above == 0) {
         System.out.println("The number is greater than all the numbers in the list");
     } else {
         System.out.println("The number above the key was " + above);
     }
     if (below == 0) {
         System.out.println("The number is less than all the numbers in the list");
     } else {
         System.out.println("The number below the key was " + below);
     }
     
        
    }
}