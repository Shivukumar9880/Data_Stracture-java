package _4_Recurssion_programs;

import Sorting_Techniques.s;

public class _14_Find_All_Permutations_Of_String {

	public static void permutation(char[] ar,int fi)
	{
		
		if(fi==ar.length-1)
		{
			System.out.println(ar);
			return;
		}
		for(int i=fi;i<ar.length;i++)
		{
			swap(ar,i,fi);
			permutation(ar, fi+1);	
			swap(ar,i,fi);
		}
	}

	private static void swap(char[] ar, int i, int fi) {
		char temp=ar[i];
		ar[i]=ar[fi];
		ar[fi]=temp;
		
	}
	public static void main(String[] args) {
		String s="ABC";
		permutation(s.toCharArray(), 0);
	}
}
