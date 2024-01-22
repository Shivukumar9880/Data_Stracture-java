package _1_com.dsa_logic_on_numbers_1;

import java.util.Scanner;

public class How_to_Find_sum_N_Natural_numbers 
{
	public static int sumOf_N_Numbers(int n)
	{
		int sum=0;
		
		
		sum=(n*(n+1))/2;//it takes less time and space
		
		return sum;
		
		
		
	}
	static int sumOf_N_Numbers_forLoop(int n)// this logic take more time and space 
	{
		int sum=0;
		for(int i=0;i<=n;i++)
			sum=sum+i;
		return sum;
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one Natural Number");
		int n = sc.nextInt();
		System.out.println(sumOf_N_Numbers(n));
		System.out.println(sumOf_N_Numbers_forLoop(n));
	}
}
