package ja;



import java.util.Scanner;

public class GamblerSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial stake amount: ");
        int stake = scanner.nextInt();

        System.out.print("Enter the goal amount: ");
        int goal = scanner.nextInt();

        System.out.print("Enter the number of trials: ");
        int trials = scanner.nextInt();

        scanner.close();

        int bets = 0;
        int wins = 0;

        for (int i = 0; i < trials; i++) 
        {
            int cash = stake;

            while (cash > 0 && cash < goal)
            {
                bets++;
                if (Math.random() < 0.5) {
                    cash++; // Win $1
                } else {
                    cash--; // Lose $1
                }
            }

            if (cash == goal) 
            {
                wins++;
            }
        }

        double winPercentage = (double) wins / trials * 100;
        double lossPercentage = 100 - winPercentage;

        System.out.println("Number of Wins: " + wins);
        System.out.println("Percentage of Wins: " + winPercentage + "%");
        System.out.println("Percentage of Losses: " + lossPercentage + "%");
        System.out.println("Average Number of Bets: " + (double) bets / trials);
    }
}
