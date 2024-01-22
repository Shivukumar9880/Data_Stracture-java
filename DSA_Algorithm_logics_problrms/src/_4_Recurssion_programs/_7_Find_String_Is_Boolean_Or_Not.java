package _4_Recurssion_programs;

public class _7_Find_String_Is_Boolean_Or_Not 
{

	public static boolean isPalindrome(String s ,int i,int j)
	{
		if(s.charAt(i)!=s.charAt(j) )
		{
			return false;
		}
		if(i==j && j<=i)//mention any one condition its ok
		{
			return true;
		}

		return isPalindrome(s,i+1,j-1);
	}
	
	public static void main(String[] args) 
	{
		
		String s="AMMA";
		int i=0;
		int j=s.length()-1;
		System.out.println(isPalindrome(s,i,j));
		
	}
}
