package ja;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearchWordList 
{
    public static void main(String[] args) 
    {
        try {
            // Read in a list of words from a file
            File file = new File("C:\\Users\\Shivu\\Downloads\\word.txt");
            Scanner scanner = new Scanner(file);
            List<String> words = new ArrayList<>();

            while (scanner.hasNextLine()) 
            {
                String line = scanner.nextLine();
                String[] wordArray = line.split(" ");
                words.addAll(Arrays.asList(wordArray));
            }
            scanner.close();
        

            // Sort the list of words
            Collections.sort(words);

            // Prompt the user to enter a word to search
            Scanner userInputScanner = new Scanner(System.in);
            System.out.print("Enter a word to search: ");
            String searchWord = userInputScanner.nextLine();

            // Perform binary search manually
            int result = manualBinarySearch(words, searchWord);

            // Print the result
            if (result >= 0)
            {
                System.out.println("Word found in list " );
            } else {
                System.out.println("Word not found in the list.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int manualBinarySearch(List<String> words, String target)
    {
        int left = 0;
        int right = words.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midWord = words.get(mid);

            int comparison = target.compareTo(midWord);

            if (comparison == 0) {
                return mid; // Word found at index mid
            } else if (comparison < 0) {
                right = mid - 1; // Search in the left half
            } else {
                left = mid + 1; // Search in the right half
            }
        }

        return -1; // Word not found in the list
    }
}
