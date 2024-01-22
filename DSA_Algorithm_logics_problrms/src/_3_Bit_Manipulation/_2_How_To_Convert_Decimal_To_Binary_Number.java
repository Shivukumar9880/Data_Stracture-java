package _3_Bit_Manipulation;

import java.util.Scanner;

public class _2_How_To_Convert_Decimal_To_Binary_Number 
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number");
		int n=sc.nextInt();
		String b="";
		while(n>=1)
		{
			int x=n%2;
			b=x+b;
			n=n/2;
		}
		System.out.println(b);
		
	}
}

/**
 * Enter decimal number
   101
   1100101
 */
