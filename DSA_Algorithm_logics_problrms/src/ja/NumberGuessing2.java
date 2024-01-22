package ja;

import java.util.Scanner;

public class NumberGuessing2 {
    public static int findNumber(int low, int high) {
        if (low == high) {
            return low;
        }

        int mid = (low + high) / 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is your number between " + low + " and " + mid + "? (true/false)");
        boolean response = scanner.nextBoolean();

        if (response) {
            return findNumber(low, mid);
        } else {
            return findNumber(mid + 1, high);
        }
    }

    public static void main(String[] args) {
    	System.out.println("enter n");
      Scanner sc=new Scanner(System.in);
      
        int N=sc.nextInt();
//        int N = Integer.parseInt(args[0]);
        int low = 0;
        int high = N - 1;

        int result = findNumber(low, high);

        System.out.println("The final answer is: " + result);
    }
}
