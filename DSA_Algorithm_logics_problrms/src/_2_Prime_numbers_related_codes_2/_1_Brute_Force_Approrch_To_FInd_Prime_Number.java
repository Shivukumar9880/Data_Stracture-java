package _2_Prime_numbers_related_codes_2;

import java.util.Scanner;



public class _1_Brute_Force_Approrch_To_FInd_Prime_Number
{
	/**
	 * in this Approach for loop iterating till n/2  times  ..... time complexity is O(n)
	 */
	static boolean isPrime(int n)  //the is not efficient code to find Prime number its not work for 1 because 1 is not prime number  
	{
		for(int i=2; i<n/2;i++)
		{
			if(n%i==0)  //
				return false; 
		}
		return true;
	}


	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number To Be Check Is The Prime Or Not");

		int n=sc.nextInt();

		System.out.println(isPrime(n));
	}
}
