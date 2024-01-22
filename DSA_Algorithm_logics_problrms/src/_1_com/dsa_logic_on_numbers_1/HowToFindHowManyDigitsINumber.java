package _1_com.dsa_logic_on_numbers_1;

import java.util.Scanner;

public class HowToFindHowManyDigitsINumber 
{

	public static int digits(int n)
	{
		int count=0;
		
		
//		while(n>0)
//		{
//			n=n/10;
//			count++;  it also works fine note:-> n is n>0  where n is not n>=0
//		}
		
		
		do
		{
			n=n/10;
			count++;
		}while(n>0);
		
		return count;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		sc.close();
		System.out.println(digits(n));
		
		
	}
}
