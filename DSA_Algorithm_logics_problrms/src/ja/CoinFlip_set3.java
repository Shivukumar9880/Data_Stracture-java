package ja;

import java.util.Random;
import java.util.Scanner;



 public class CoinFlip_set3 
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        if (numFlips <= 0) 
        {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;
        Random random = new Random();

        for (int i = 0; i < numFlips; i++) {
            double coinFlip = random.nextDouble(); // Generates a random value between 0 and 1

            if (coinFlip < 0.5) 
            {
                headsCount++;
            } 
            else 
            {
                tailsCount++;
            }
        }

        double headsPercentage = (double) headsCount / numFlips * 100;
        double tailsPercentage = (double) tailsCount / numFlips * 100;

        System.out.println("Number of Heads: " + headsCount);
        System.out.println("Number of Tails: " + tailsCount);
        System.out.println("Percentage of Heads: " + headsPercentage + "%");
        System.out.println("Percentage of Tails: " + tailsPercentage + "%");
    }
}
