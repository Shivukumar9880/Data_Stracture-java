package _1_com.dsa_logic_on_numbers_1;

import java.util.Scanner;

public class How_to_Find_Gcd_BruteForceApporch 
{

	static int bruteGcd(int a,int b)
	{
		int min=0;
		 if(a<b)
		 {
			 min=a;     // time complexcity of this apporch is O(min(a,b))
		 }
		 else
		 {
			 min=b; 
		 }
		 for(int i=min;i>=1;i--)
		 {
			 if(a%i==0 && b%i==0)
			 {
				 return i;
			 }
		 }
		return 1;
		 
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(bruteGcd(a,b));
		

	}
}
