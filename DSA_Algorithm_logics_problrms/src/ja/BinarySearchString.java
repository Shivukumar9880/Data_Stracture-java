package ja;

public class BinarySearchString 
{
	
	
    public static int binarySearch(String[] arr, String target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) 
        {
            int mid = (low + high) / 2;
            int cmp = target.compareTo(arr[mid]);//

            if (cmp == 0) {
                return mid; // Element found
            } else if (cmp < 0) {
                high = mid - 1; // Target is in the lower half
            } else 
            {
                low = mid + 1; // Target is in the upper half
            }
        }

        return -1; // Element not found
    }
	
    public static void main(String[] args) 
    {
        // Sample array of strings (sorted in lexicographical order)
        String[] arr = {"apple", "banana", "cherry", "cherry","grape", "orange", "pear"};

        // Element to search for
        String target = "cherry";

        int index = binarySearch(arr, target);

        if (index != -1)
        {
            System.out.println( target + " found at index " + index);
        } else
        {
            System.out.println(target + " not found in the array.");
        }
    }


}

