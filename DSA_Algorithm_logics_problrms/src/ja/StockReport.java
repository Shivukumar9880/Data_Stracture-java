package ja;


import java.util.ArrayList;
import java.util.Scanner;

class Stock
 {
    String name;//tata cars
    int numberOfShares;//5
    double sharePrice;//1000

    double calculateValue()
    {
        return numberOfShares * sharePrice;//5*1000=5000
    }
}

public class StockReport 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Stock> stocks = new ArrayList<Stock>();

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        double totalValue = 0;

        for (int i = 0; i < numStocks; i++) 
        {
            System.out.println("Enter details for Stock " + (i + 1) + ":");
            Stock stock = new Stock();
            System.out.print("Enter Stock Name: ");
            stock.name = scanner.nextLine();
            System.out.print("Enter Number of Shares: ");
            stock.numberOfShares = scanner.nextInt();
            System.out.print("Enter Share Price: ");
            stock.sharePrice = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character

            totalValue += stock.calculateValue();
            stocks.add(stock);
        }

        System.out.println("Stock Report:");
        System.out.println("-------------------------------------------");
        System.out.printf("%-20s%-20s%-20s%n", "Stock Name", "Stock Value", "Total Value");
        System.out.println("-------------------------------------------");

        for (Stock stock : stocks) {
            System.out.printf("%-20s$%-19.2f$%-19.2f%n",
                    stock.name, stock.calculateValue(), totalValue);
        }

        System.out.println("-------------------------------------------");
    }
}
