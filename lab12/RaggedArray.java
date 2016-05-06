import java.util.Scanner;
import java.util.Random;

public class RaggedArray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();
        System.out.print("Please enter the size of the main array: ");
        int length = input.nextInt();
        int[][] array = new int[length][];
        
        for (int i=0; i<array.length; i++) {
            array[i] = new int[randomGenerator.nextInt(length)];
        }
        
        for (int j=0; j<array.length; j++) {
            for (int k=0; k<array[j].length; k++) {
                array[j][k] = randomGenerator.nextInt(21);
            }
        }
        
        System.out.println("Here is your unsorted array:");
        for (int j=0; j<array.length; j++) {
            for (int k=0; k<array[j].length; k++) {
                System.out.print(array[j][k] + " ");
            }
            System.out.print("\n");
        }
        
        boolean changed = false;
        int val = 0;
        int place = 0;
        for (int j=0; j<array.length; j++) {
            for (int k=0; k<array[j].length; k++) {
                val = array[j][k];
                for (int i=k+1; i<array[j].length; i++) {
                    if (array[j][i] < val) {
                        val = array[j][i];
                        place = i;
                        changed = true;
                    }
                }
                if (changed) {
                    array[j][place] = array[j][k];
                    array[j][k] = val;
                }
                changed = false;
            }
        }
        
        System.out.println("Here is your sorted array:");
        for (int j=0; j<array.length; j++) {
            for (int k=0; k<array[j].length; k++) {
                System.out.print(array[j][k] + " ");
            }
            System.out.print("\n");
        }
        
        int shortestLength = 0;
        changed = false;
        for (int j=0; j<array.length; j++) {
            shortestLength = array[j].length;
            for (int k=j+1; k<array.length; k++) {
                if (array[k].length < shortestLength) {
                    shortestLength = array[k].length;
                    place = k;
                    changed = true;
                }
            }
            if (changed) {
                int[] temp = new int[array[j].length];
                for (int i=0; i<temp.length; i++) {
                    temp[i] = array[j][i];
                }
                
                int[] temp2 = new int[array[place].length];
                for (int i=0; i<temp2.length; i++) {
                    temp2[i] = array[place][i];
                }
                array[j] = temp2;
                array[place] = temp;
            }
            changed = false;
        }
        
        System.out.println("Here is your rearranged array:");
        for (int j=0; j<array.length; j++) {
            for (int k=0; k<array[j].length; k++) {
                System.out.print(array[j][k] + " ");
            }
            System.out.print("\n");
        }
        
        
        
        System.out.print("What number would you like to search for? ");
        int search = input.nextInt();
        boolean found = false;
        int n = 0;
        int p = 0;
        int column = 0;
        int row = 0;
        
        while (n<array.length && !found) {
            p = 0;
            while (p<array[n].length && !found) {
                if (array[n][p] == search) {
                    column = p+1;
                    row = n+1;
                    found = true;
                }
                p++;
            }
            n++;
        }
        
        if (found) {
            System.out.println("Column " + column + " Row " + row);
        } else {
            System.out.println("Not in the array.");
        }
        
    }
}