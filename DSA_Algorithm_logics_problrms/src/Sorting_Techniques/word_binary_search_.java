package Sorting_Techniques;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class word_binary_search_ {


	public static void main(String[] args) {

		try {
			
			File file =new File("C:\\Users\\Shivu\\Downloads\\ganeshsir.txt");
			Scanner sc=new Scanner(file);

			
//			FileReader fr=new FileReader(file);
//			int ch = fr.read();
//			String ss="";
//			while(ch!=-1)
//			{
//				ss=ss+()ch;
//				ch = (char)fr.read();
//			}
//			
//			System.out.println(ss);
//			System.out.println("------------shh--------------------");
			
//			ArrayList<String> wordList=new ArrayList<String>();
//			while(sc.hasNextLine())
//			{
//                  String line = sc.nextLine();
//                  String[] wordArray = line.split(",");
//                  wordList.addAll(Arrays.asList(wordArray));
//			}
//			
//			Collections.sort(wordList);
//			System.out.println(wordList);//array is sorted 
//			
//			System.out.println("Enter Search word");
//			Scanner scs=new Scanner(System.in);
//			String target=scs.nextLine();
//			
//			int index = binarySearch(wordList ,target);
//			
//			if(index!=-1)
//			{
//				System.out.println(target+" found At index "+index);
//			}
//			else
//			{
//				System.out.println(target+" Not Found");
//			}
		}
		catch (Exception e) {

		}
	}

	private static int binarySearch(ArrayList<String> wordList, String target) {
		
		int low=0;
		int high=wordList.size()-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			String word=wordList.get(mid);
			
			int com = target.compareTo(word);
			if(com==0)
			{
				return mid;
			}else if(com<0)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
			
		}
		return -1;
	}
}
