// This program uses the cost of the check, tip percentage, and ways to split the check as inputs to find out how much
// each person has to pay

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100;
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        double totalCost;
        double costPerPerson;
        int dollars=0, dimes=0, pennies=0;
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        dollars = (int) costPerPerson;
        dimes = (int) (costPerPerson * 10) % 10;
        pennies = (int) (costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
        
    }
}