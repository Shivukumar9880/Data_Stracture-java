package _2_Prime_numbers_related_codes_2;

import java.util.Scanner;


public class _5_Seive_Eurosthenes_Apporch_To_Find_Prime_Number_From_1_N 
{

	/**
	 * in this approach we are  taking an boolean array 
	 * 1.start looping form 2 to till root n value times
	 * 2.we are checking that i is already  marked if it is already marked then its not going to mark again
	 * mark=true|| unmark=false
	 * 3.again inner for loop will mark multiples of iv till n
	 * 4.Repeat above steps till i reaches root n values
	 * 
	 */
	static  void sievePrintPrime(int n)
	{

		boolean prime[]=new boolean[n+1];
		for(int i=2;i*i<=n;i++)
		{
			if(prime[i]==false)
			{
				for(int j=i*i;j<=n;j=j+i)
				{
					
					     prime[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==false)
				System.out.println(i);
		}


	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");

		int n=sc.nextInt();
		
		sievePrintPrime(n);
		sc.close();
	}

}
