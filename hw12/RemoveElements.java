//This program changes arrays by deleting a number in a certain position or deleting all of the same number

import java.util.Scanner;

public class RemoveElements{
    
    public static void main(String [] arg){
	    Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
	    String answer = "";
	    
	    do {
  	        System.out.print("Random input 10 ints [0-9]");
  	        num = randomInput();
  	        String out = "The original array is:";
  	        out += listArray(num);
  	        System.out.println(out);
 
  	        System.out.print("Enter the index ");
  	        index = scan.nextInt();
  	        newArray1 = delete(num,index);
  	        String out1 = "The output array is ";
  	        out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out1);
 
            System.out.print("Enter the target value ");
  	        target = scan.nextInt();
  	        newArray2 = remove(num,target);
  	        String out2 = "The output array is ";
  	        out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out2);
  	 
  	        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	        answer = scan.next();
	    } while (answer.equals("Y") || answer.equals("y"));
    }
 
    public static String listArray(int num[]){
	    String out="{";
	    for (int j=0;j<num.length;j++) {
  	        if (j>0) {
    	    out+=", ";
  	        }
  	        out+=num[j];
	    }
	    out+="} ";
	    return out;
    }
    
    public static int[] randomInput() {
        int[] list = new int[10]; //creates a new int array that is 10 places long
        for (int i=0; i<list.length; i++) { //repeats for the length of the array
            list[i] = (int) (Math.random() * 10); //generates a random number from 0 to 9
        }
        return list; //returns the array of randomly generated numbers
    }
    
    public static int[] delete(int[] list, int pos) {
        if (pos > list.length-1) {
            System.out.println("Error: index is out of bounds");
            return list; //returns the original list if the position the user wants deleted is greater than the length of the array
        }
        
        int[] list2 = new int[list.length - 1]; //creates a new array that has a length that is one less than the input array because it will delete one space
        boolean passed = false; //this will tell if it has passed the number it will delete
        for (int i=0; i<list2.length; i++) { //repeats for how long the new array is
            if (i != pos && !passed) { //this will run if i is not equal to the position that will be deleted and it has not passed that position yet
                list2[i] = list[i]; //sets the i position of the new list to the i position of the old list
            } else if (i == pos) { //this will run if it gets to the position that will be deleted
                list2[i] = list[i+1]; //this skips over the position that will be deleted
                passed = true; //sets passed to true because now it passed the deleted number
            } else {
                list2[i] = list[i+1]; //sets the i position in the new list to the i+1 position in the old list because it passed the deleted number
            }
        }
        return list2; //returns the new list
    }
    
    public static int[] remove(int[] list, int target) {
        int count = 0; //counts how many times target is in the array
        for (int i=0; i<list.length; i++) { //repeats for how long the list is
            if (list[i] == target) { //if the i position in list is equal to target it adds 1 to count
                count++; //keeps track of how many times target is in the array
            }
        }
        
        int[] list2 = new int[list.length - count]; //creates a new array
        int a = 0; //counts how many targets have been removed
        for (int i=0; i<list2.length; i++) { //repeats for how long the new array is
            if (list[a] != target) { //if the a position in list is not equal to target then it will set the a position in list to the i position in list2
                list2[i] = list[a];
                a++; //adds 1 to a
            } else {
                i--; //subtracts 1 from i so it does not move passed the place that has the target
                a++; //adds 1 to a to go to the next place in list
            }
        }
        return list2; //returns the new list that does not have target in it
    }
    
}
