package _4_Recurssion_programs;

public class _13_Finding_Letter_Combination_Of_Phone_Number {

	static String[] keypad= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void possibleWord(String s,String ans)
	{
		if(s.length()==0)
		{
			System.out.println(ans);
			return;
		}
		String key=keypad[s.charAt(0)-48];//8

		for(int i=0;i<key.length();i++)
		{
			possibleWord(s.substring(1),ans+key.charAt(i));
		}

	}
public static void main(String[] args) {
	
	possibleWord("457", "");
}
}
