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
        double totalCostOfSweatshirts; //the total cost of buying sweatshirts before tax
        totalCostOfSweatshirts = shirtPrice*numSweatshirts;
        double totalCostofBelts; //the total cost of buying belts before tax
        totalCostofBelts = beltCost*numBelts;
        
        double salesTaxPants; //sales tax for buying pants
        salesTaxPants = totalCostOfPants*salesTaxPants;
        double salesTaxSweatshirts; //sales tax for buying sweatshirts
        salesTaxSweatshirts = totalCostOfSweatshirts*paSalesTax;
        double salesTaxBelts; //sales tax for buying belts
        salesTaxBelts = totalCostofBelts*paSalesTax;
        
        double totalCostBeforeTax; //the total cost of purchases before tax
        totalCostBeforeTax = totalCostOfPants+totalCostOfSweatshirts+totalCostofBelts;
        double totalSalesTax; //the total sales tax of all purchases
        totalSalesTax = salesTaxPants+salesTaxSweatshirts+salesTaxBelts;
        double totalCost; //total cost of everything including tax
        totalCost = totalCostBeforeTax + totalSalesTax;
        
    }
}