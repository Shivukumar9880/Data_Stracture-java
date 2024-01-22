package _4_Recurssion_programs;

import java.util.Scanner;

public class _2_Find_Factorial_Of_Number_Using_Recursion {

	public static int fact(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=	sc.nextInt();
		System.out.println(fact(n));
	}
}
