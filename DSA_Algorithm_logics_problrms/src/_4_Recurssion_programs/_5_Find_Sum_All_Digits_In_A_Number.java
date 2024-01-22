package _4_Recurssion_programs;

import java.util.Scanner;

public class _5_Find_Sum_All_Digits_In_A_Number
{

	public static  int sumOfDigits(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return sumOfDigits(n/10)+(n%10); 
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number To Calculate The  sum of Its Digits In a Number");
		int n=sc.nextInt();
		System.out.println("Sum of Digits In The Number : "+sumOfDigits(n));
	}
}

//Enter The Number To Calculate The  sum of Its Digits In a Number
//44886
//Sum of Digits In The Number : 30