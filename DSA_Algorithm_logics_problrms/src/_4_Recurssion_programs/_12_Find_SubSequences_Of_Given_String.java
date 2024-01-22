package _4_Recurssion_programs;

public class _12_Find_SubSequences_Of_Given_String {

	public static void getAllSubSequences(String s,String ans)
	{
		if(s.length()==0)
		{
			System.out.println(ans);
			return;
		}
		getAllSubSequences(s.substring(1),ans+s.charAt(0));//s="abc
		getAllSubSequences(s.substring(1),ans);//s.substring(1)finding subsequence(bc)
	}
	public static void main(String[] args) {
		String s="abc";
		getAllSubSequences(s, "");
		
	}
}
