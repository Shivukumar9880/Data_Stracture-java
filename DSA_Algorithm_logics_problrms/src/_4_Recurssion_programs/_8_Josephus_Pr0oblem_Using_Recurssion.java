package _4_Recurssion_programs;

import java.util.Scanner;

public class _8_Josephus_Pr0oblem_Using_Recurssion {

	public static int jos(int n,int k)
	{
		if(n==1) 
		{
			return 0;
		}
		
		return (jos(n-1,k)+k)%n;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of People in circle");
		int n=sc.nextInt();
		System.out.println("Enter Killing Factor");
		int k=sc.nextInt();
	    int s=jos(n,k);
	    System.out.println("Josephus is need to stans At "+s+" to Survive Till End");
	    System.out.println("NOTE :- Index start with 0 position.the actual position is "+(s+1)+" position in a circle");

	}
}
