package _2_Prime_numbers_related_codes_2;

import java.util.Scanner;

public class _3_Most_Effient_Way_To_Find_Prime_Number
{
   static int x=10;
	/**
	 *  if(n%i==0 || n%(i+2)==0)//common difference between 5 and 7 is 2 next prime number exactly 6 difference form both 6
	 * 
	 * 5+6=11 and 7+6=13 these are next prime numbers after this 11+6->17 13+6->19
	 * so thats we 

	 * 
	 */
   
	static boolean isPrime(int n)
	{
		if(n==1)
		{
			return false;
		}
		if(n==2 || n==3)
		{
			return true;
		}
		if(n%2==0 ||n%3==0 )
		{
			return false;
		}
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)//common difference between 5 and 7 is 2 next prime number exactly 6 difference form both 6
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
		sc.close();



	}
}
