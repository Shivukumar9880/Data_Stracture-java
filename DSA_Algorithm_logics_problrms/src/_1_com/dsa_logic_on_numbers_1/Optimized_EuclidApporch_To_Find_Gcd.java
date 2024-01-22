package _1_com.dsa_logic_on_numbers_1;

import java.util.Scanner;

public class Optimized_EuclidApporch_To_Find_Gcd 
{

	static int optimizedEuclidGcd(int a,int b)
	{	
		while(a!=0 && b!=0)
	   {
	     	if(a>b)
	     	{
	     		a=a%b;
	     	}
	     	else
	     	{
	     		b=b%a;
	     	}
	   }
		if(a!=0)
			return a;
		else
			return b;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();

		System.out.println(optimizedEuclidGcd(a,b));

	}

}
