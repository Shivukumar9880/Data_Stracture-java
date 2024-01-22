package _2_Prime_numbers_related_codes_2;

import java.util.Scanner;

public class _4_BruteForce_Apporoach_Find_prime_numbers_From_1_To_N 
{

	/**
	 * in this approach we need to iterate up to n times then time complexity is O(n*root(n))
	 */
	static void printPrime(int n)
	{ 

		for(int i=2; i<=n;i++)
		{
			if(_3_Most_Effient_Way_To_Find_Prime_Number.isPrime(i))//call that isPrime method
				System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPrime(n);
    
	}
}
