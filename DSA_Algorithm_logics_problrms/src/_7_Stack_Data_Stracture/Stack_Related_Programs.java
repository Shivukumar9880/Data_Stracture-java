package _7_Stack_Data_Stracture;

import java.util.Arrays;
import java.util.Stack;

public class Stack_Related_Programs {

	public static void reverseString(String s)
	{
		Stack<Object> st = new Stack<>();

		//String s="Shivu   kumar";
		char [] ch=s.toCharArray();

		for(int i=0;i<s.length();i++)
		{
			st.push(ch[i]);
		}
		
		for(int i=0;i<s.length();i++)
		{
			ch[i]=(char) st.pop();//las elemet will pop first then we adding that into begining again
		}
		
		s=new String(ch);
		System.out.println(s);
	}
	
	public static  int[] nextGreaterElement(int [] arr)
	{
		
		int [] brr=new int[arr.length];
		for(int i=0;i<arr.length;i++)// {4,7,3,4,8}
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[j]>arr[i])
				{
					brr[i]=arr[j];
					break;
				}
			
			}
			
		
			
		}
		
		return brr;
	}
	
	
	public static String[] bin(int n)
	{
		
		String str[]=new String[n];
		
		for(int i=n;i>=1;i--)
		{    
			int x=i;
			String s="";
			do
			{
			  int d=x%2;
				s=d+s;
				x=x/2;
			}while(x!=0);
			
			str[i-1]=s;
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		
		String s="raghu sir";
		
//		System.out.println(1/2);
		System.out.println(Arrays.toString(bin(100)));
//		reverseString(s);
		
//	System.out.println(Arrays.toString(	nextGreaterElement(new int[] {4,7,3,4,8})));
	}
}
