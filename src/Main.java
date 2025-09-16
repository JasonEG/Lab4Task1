
public class Main {
    public static void main(String[] args)
    {
        double purchasePrice = 86; //purchase price of something
        double taxRate = .05; //this is my tax rate+
        double countyTaxRate = .02; //extra tax for demo
        double salesTax = 0; //initialize the variable we will change this later
        double countyTax = 0; //ini the var
        double total = 0; //final price

        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("County Tax Rate: " + countyTaxRate);

        salesTax = taxRate * purchasePrice;
        countyTax = countyTaxRate * purchasePrice;
        total = salesTax + countyTax + purchasePrice;

        System.out.println("Sales tax: $" + salesTax);
        System.out.println("County tax: $" + countyTax);
        System.out.println("Total Cost: $" + total);

        }
    }