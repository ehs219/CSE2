public class Arithmetic {
    public static void main(String[] args) {
        
        int numPants = 3; //number of pairs of pants
        double pantsPrice = 34.98; //cost of one pair of pants
        int numSweatshirts = 2; //number of sweatshirts
        double shirtPrice = 24.99; //cost of a sweatshirt
        int numBelts = 1; //number of belts
        double beltCost = 33.99; //cost per box of envelopes
        double paSalesTax = 0.06; //the tax rate
        
        double totalCostOfPants; //the total cost of buying pants before tax
        totalCostOfPants = pantsPrice*numPants;
        totalCostOfPants = (int) (100*totalCostOfPants); //makes only 2 decimal places
        totalCostOfPants = totalCostOfPants/100;
        System.out.println("Total cost of pants: $"+totalCostOfPants);
        
        double totalCostOfSweatshirts; //the total cost of buying sweatshirts before tax
        totalCostOfSweatshirts = shirtPrice*numSweatshirts;
        totalCostOfSweatshirts = (int) (100*totalCostOfSweatshirts); //makes only 2 decimal places
        totalCostOfSweatshirts = totalCostOfSweatshirts/100;
        System.out.println("Total cost of sweatshirts: $"+totalCostOfSweatshirts);
        
        double totalCostofBelts; //the total cost of buying belts before tax
        totalCostofBelts = beltCost*numBelts;
        totalCostofBelts = (int) (100*totalCostofBelts); //makes only 2 decimal places
        totalCostofBelts = totalCostofBelts/100;
        System.out.println("Total cost of belts: $"+totalCostofBelts);
        
        double salesTaxPants; //sales tax for buying pants
        salesTaxPants = totalCostOfPants*paSalesTax;
        salesTaxPants = (int) (100*salesTaxPants); //makes only 2 decimal places
        salesTaxPants = salesTaxPants/100;
        System.out.println("Sales tax for buying pants: $"+salesTaxPants);
        
        double salesTaxSweatshirts; //sales tax for buying sweatshirts
        salesTaxSweatshirts = totalCostOfSweatshirts*paSalesTax;
        salesTaxSweatshirts = (int) (100*salesTaxSweatshirts); //makes only 2 decimal places
        salesTaxSweatshirts = salesTaxSweatshirts/100;
        System.out.println("Sales tax for buying sweatshirts: $"+salesTaxSweatshirts);
        
        double salesTaxBelts; //sales tax for buying belts
        salesTaxBelts = totalCostofBelts*paSalesTax;
        salesTaxBelts = (int) (100*salesTaxBelts); //makes only 2 decimal places
        salesTaxBelts = salesTaxBelts/100;
        System.out.println("Sales tax for buying belts: $"+salesTaxBelts);
        
        double totalCostBeforeTax; //the total cost of purchases before tax
        totalCostBeforeTax = totalCostOfPants+totalCostOfSweatshirts+totalCostofBelts;
        totalCostBeforeTax = (int) (100*totalCostBeforeTax); //makes only 2 decimal places
        totalCostBeforeTax = totalCostBeforeTax/100;
        System.out.println("Total cost before tax: $"+totalCostBeforeTax);
        
        double totalSalesTax; //the total sales tax of all purchases
        totalSalesTax = salesTaxPants+salesTaxSweatshirts+salesTaxBelts;
        totalSalesTax = (int) (100*totalSalesTax); //makes only 2 decimal places
        totalSalesTax = totalSalesTax/100;
        System.out.println("Total sales tax: $"+totalSalesTax);
        
        double totalCost; //total cost of everything including tax
        totalCost = totalCostBeforeTax + totalSalesTax;
        totalCost = (int) (100*totalCost); //makes only 2 decimal places
        totalCost = totalCost/100;
        System.out.println("Total cost: $"+totalCost);
    }
}