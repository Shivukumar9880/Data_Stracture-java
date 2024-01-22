package _1_com.dsa_logic_on_numbers_1;

import java.util.Scanner;

public class EuclidsApporch_To_Find_Gcd_of_TwoNumber 
{
	static int euclidsGcd(int a,int b)
	{



		while(a!=b)
		{
			if(a>b)      //1
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}

		return a;

	}
	public static void main(String[] args) {

			  Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter two number");
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				System.out.println(euclidsGcd(a,b));


	
	}
}
