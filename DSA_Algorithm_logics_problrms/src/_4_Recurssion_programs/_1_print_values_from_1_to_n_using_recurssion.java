package _4_Recurssion_programs;

import java.util.Scanner;

public class _1_print_values_from_1_to_n_using_recurssion 
{

	static void fun(int n)
	{
		
		if(n==0)
		{
			return;
		}
//		System.out.println(n);//backward tracking 
		fun(n-1);
		System.out.println(n);//forward tracking  
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=	sc.nextInt();
		
		fun(n);

	}
}
