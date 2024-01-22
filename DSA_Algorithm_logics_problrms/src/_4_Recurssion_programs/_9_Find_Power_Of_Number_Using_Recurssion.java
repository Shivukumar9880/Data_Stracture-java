package _4_Recurssion_programs;

import java.util.concurrent.TimeUnit;

public class _9_Find_Power_Of_Number_Using_Recurssion 
{
	public static long pow1(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}

		return x*pow1(x,y-1);
	}
	public static long pow2(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}
		if(y%2==0)
		{
			long res=pow2(x,y/2);//Efficient code to find power of Number
			return res*res;
			//return pow2(x,y/2)*pow2(x,y/2);
		}else
		{
			return x*pow1(x,y-1);
		}

	}
	public static void main(String[] args) {

		System.out.println(pow1(5,9));
	
		System.out.println("------------------------------");

		System.out.println(pow2(5,9));
		

	}

}
