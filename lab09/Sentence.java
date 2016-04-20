import java.util.Random;
import java.util.Scanner;


public class Sentence {
    public static String noun1() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String noun1 = "";
        
        switch (randomInt) {
            case 0:
                noun1 = "dog";
                break;
            case 1:
                noun1 = "cat";
                break;
            case 2:
                noun1 = "car";
                break;
            case 3:
                noun1 = "computer";
                break;
            case 4:
                noun1 = "phone";
                break;
            case 5:
                noun1 = "man";
                break;
            case 6:
                noun1 = "woman";
                break;
            case 7:
                noun1 = "person";
                break;
            case 8:
                noun1 = "elephant";
                break;
            case 9:
                noun1 = "bear";
                break;
        }
        return noun1;
    }
    
    public static String noun2() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String noun2 = "";
        
        switch (randomInt) {
            case 0:
                noun2 = "house";
                break;
            case 1:
                noun2 = "chair";
                break;
            case 2:
                noun2 = "table";
                break;
            case 3:
                noun2 = "pizza";
                break;
            case 4:
                noun2 = "apple";
                break;
            case 5:
                noun2 = "pencil";
                break;
            case 6:
                noun2 = "dog";
                break;
            case 7:
                noun2 = "cat";
                break;
            case 8:
                noun2 = "paper";
                break;
            case 9:
                noun2 = "computer";
                break;
        }
        return noun2;
    }
    
    public static String adjective() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String adjective = "";
        
        switch (randomInt) {
            case 0:
                adjective = "blue";
                break;
            case 1:
                adjective = "lazy";
                break;
            case 2:
                adjective = "ugly";
                break;
            case 3:
                adjective = "smart";
                break;
            case 4:
                adjective = "purple";
                break;
            case 5:
                adjective = "funny";
                break;
            case 6:
                adjective = "quick";
                break;
            case 7:
                adjective = "cool";
                break;
            case 8:
                adjective = "happy";
                break;
            case 9:
                adjective = "sad";
                break;
        }
        return adjective;
    }
    
    public static String verb() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String verb = "";
        
        switch (randomInt) {
            case 0:
                verb = "jumped over";
                break;
            case 1:
                verb = "ate";
                break;
            case 2:
                verb = "saw";
                break;
            case 3:
                verb = "was";
                break;
            case 4:
                verb = "ran to";
                break;
            case 5:
                verb = "heard";
                break;
            case 6:
                verb = "walked to";
                break;
            case 7:
                verb = "read";
                break;
            case 8:
                verb = "passed by";
                break;
            case 9:
                verb = "wrote";
                break;
        }
        return verb;
    }


    public static void main(String[] args) {
        
        boolean answer = true;
        Scanner input = new Scanner(System.in);
        
        while (answer) {
            System.out.print("The ");
            System.out.print(adjective() + " ");
            System.out.print(noun1() + " ");
            System.out.print(verb() + " ");
            System.out.print("the ");
            System.out.print(noun2() + ".");
            System.out.print("\n");
            
            System.out.print("Type 'yes' for another sentence: ");
            if (input.next().equals("yes")) {
                answer = true;
            } else {
                answer = false;
            }
        }
    }
}