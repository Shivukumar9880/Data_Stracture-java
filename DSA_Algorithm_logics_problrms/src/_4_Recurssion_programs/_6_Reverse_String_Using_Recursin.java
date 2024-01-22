package _4_Recurssion_programs;

import java.util.Scanner;

public class _6_Reverse_String_Using_Recursin
{
 
	public static String reverseString(String s,String r,int n )
	{
		
		//work with forward tracing
		if(n<0)//because String index start with 0 index  if we get below 0  means it touches the base condition......
		{
			return r;
		}
		
		return reverseString(s,r+s.charAt(n),n-1);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String To Reverse");
		String s=sc.nextLine();
		String r="";
		int n=s.length()-1;//
		
//		System.out.println("ram".length()-1);
		System.out.println("The Reversed String is :- "+reverseString(s, r, n));
//		System.out.println("The Reversed String is :- "+reverseString("ram","","ram".length()-1 ));
	}
}
