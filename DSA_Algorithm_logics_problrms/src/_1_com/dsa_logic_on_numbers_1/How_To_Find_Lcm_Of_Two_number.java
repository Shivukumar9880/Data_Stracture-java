package _1_com.dsa_logic_on_numbers_1;

import java.util.Scanner;

public class How_To_Find_Lcm_Of_Two_number {

	static int euclidsGcd(int a, int b)
	{
		
		while(a!=0&& b!=0)
		{
			if(a>b)
				a=a%b;
			else
				b=b%a;
		}
		if(a!=0)
			return a;
		else
			return b;
	}
	
	static int lcm(int a,int b)
	{
		return a*b/euclidsGcd(a, b);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(lcm(a,b));
		
	}
}
