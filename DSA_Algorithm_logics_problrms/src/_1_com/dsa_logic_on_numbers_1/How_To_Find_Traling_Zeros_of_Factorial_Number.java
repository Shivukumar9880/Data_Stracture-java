package _1_com.dsa_logic_on_numbers_1;

import java.util.Scanner;

public class How_To_Find_Traling_Zeros_of_Factorial_Number {


	public static long fact(int n)
	{
		long product=1;
		int i=1;
		while(i<=n)
		{
			product=product*i;
			i++;
		}
		return product;
	}

	public static int traialingZeros(int n)
	{

		long fact=fact(n);
		
		int count=0;
		do {
			long d=fact%10;
			if(d==0)
				count++;
			else
				break;
			fact=fact/10;
		}while(fact>0);


		return count;



	}

// it is efficient code to find the trailing zero of factorial of number follow this
	static int optimizedTrailingZero(int n)
	{
		int count=0;
		int powerof5=5;
		while(n/powerof5!=0)
		{
			count=n/powerof5;

			powerof5=powerof5* 5;
		}

		return count;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to find trailing of zeros that factorial number");
		int n=sc.nextInt();
		System.out.println(traialingZeros(n));
		System.out.println("----------------------------------------");
		System.out.println(optimizedTrailingZero(n));
	}

}

