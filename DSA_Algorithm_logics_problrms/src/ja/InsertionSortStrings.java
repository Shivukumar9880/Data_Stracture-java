package ja;



public class InsertionSortStrings 
{
    public static void main(String[] args) 
    {
        String[] strings = {"cpple", "banana", "cherry", "grape", "orange"};

        for (int i = 1; i < strings.length; i++) 
        {
            String key = strings[i];
            int j = i - 1;

            while (j >= 0 && strings[j].compareTo(key) > 0) 
            {
                strings[j + 1] = strings[j];
                j--;
            }

            strings[j + 1] = key;
        }

        for (int i = 0; i < strings.length; i++) 
        {
            System.out.println(strings[i]);
        }
    }
}
