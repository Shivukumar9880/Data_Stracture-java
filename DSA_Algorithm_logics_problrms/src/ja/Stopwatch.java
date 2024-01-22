package ja;


import java.util.Scanner;

public class Stopwatch 
{
    private long startTime;
    private long endTime;
    private boolean isRunning;

    public static void main(String[] args)
 {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stopwatch Program");
        while (true)
{
            System.out.println("Options:");
            System.out.println("1. Start");
            System.out.println("2. Stop");
            System.out.println("3. Reset");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    stopwatch.start();
                    break;
                case 2:
                    stopwatch.stop();
                    break;
                case 3:
                    stopwatch.reset();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Stopwatch started.");
        } 
        else 
        {
            System.out.println("Stopwatch is already running.");
        }
    }

    public void stop() {
        if (isRunning) 
        {
            endTime = System.currentTimeMillis();
            isRunning = false;
            long elapsedTime = endTime - startTime;
            System.out.println("Stopwatch stopped.");
            System.out.println("Elapsed time: " + formatElapsedTime(elapsedTime));
        } else {
            System.out.println("Stopwatch is not running.");
        }
    }

    public void reset() {
        startTime = 0;
        endTime = 0;
        isRunning = false;
        System.out.println("Stopwatch reset.");
    }

    private String formatElapsedTime(long elapsedTime) {
        long seconds = elapsedTime / 1000;
        long milliseconds = elapsedTime % 1000;
        return seconds + " seconds " + milliseconds + " milliseconds";
    }
}



