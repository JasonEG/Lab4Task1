
public class Main {
    public static void main(String[] args)
    {
        double purchasePrice = 86; //purchase price of something
        double taxRate = .05; //this is my tax rate
        double salesTax = 0; //initialize the variable we will change this later

        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("Tax Rate: " + taxRate);

        salesTax = taxRate * purchasePrice;

        System.out.println("Sales tax: $" + salesTax);

        }
    }