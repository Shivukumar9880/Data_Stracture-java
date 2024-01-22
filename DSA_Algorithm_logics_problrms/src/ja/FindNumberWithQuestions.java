package ja;


import java.util.Scanner;

public class FindNumberWithQuestions 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (N = 2^n): ");
        int N = scanner.nextInt();
        int low = 0;
        int high = N - 1;
        int questions = 0;

        while (low < high) {
            int mid = (low + high) / 2;
            System.out.print("Is the number between " + low + " and " + mid + "? (true/false): ");
            boolean response = scanner.nextBoolean();
            questions++;

            if (response) {
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("The number is: " + low);
        System.out.println("Number of questions asked: " + questions);
    }
}
