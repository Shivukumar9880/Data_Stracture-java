package _4_Recurssion_programs;

import java.util.Scanner;

public class _4_Find_Number_Of_Digits_In_Number 
{

	

	public static int countOfDidits(int n)
	{
		if(n==0)
			return 0;
		
		return  countOfDidits(n/10)+1;//backword tracing 
		

		/**
		 * @param n
		 * if->n==0 it will return 0 this 0 is input to previous recursion call same repeat process till first call of that function
		 * this is backward tracing 
		 */
	}
	
	

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		System.out.println(countOfDidits(n));
		
	}
}
