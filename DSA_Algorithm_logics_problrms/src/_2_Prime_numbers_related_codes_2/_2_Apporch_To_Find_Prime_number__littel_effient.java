package _2_Prime_numbers_related_codes_2;

import java.util.Scanner;

public class _2_Apporch_To_Find_Prime_number__littel_effient 
{

	
	/**
	 * in this Approach loop will iterate only root n times ex->n=9 
	 * in this case sqrt(9) is 3-it only iterate 3 times 
	 * so Time complexity is O(ROOt n)  
	 */
	static boolean isPrime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number To Be Check Is The Prime Or Not");
		int n=sc.nextInt();
		System.out.println(isPrime(n));
		
	}
	
}
