package ja;

public class AnangaramSet2_2 {

	public static void main(String[] args) {

		String a="Arun";

		String b="Arun#";


		int ch1[]=new int[127];
		for(int i=0; i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch>='A' && ch<'Z')
			{
				ch1[ch]++;
			}else if(ch<'a'&& ch<'Z')
			{
				ch1[ch]++;
			}
		}
		
		int ch2[]=new int[127];
		for(int i=0; i<b.length();i++)
		{
			char ch=b.charAt(i);
			if(ch>='A' && ch<'Z')
			{
				ch1[ch]++;
			}else if(ch<'a'&& ch<'Z')
			{
				ch1[ch]++;
			}
		}
		
		for(int i=0; i<127;i++)
		{
			if(a.charAt(i)==b.charAt(i))
			{
				System.out.println("Is not Anagram");
				continue;
			}else 
			{
				System.out.println("is Anagram");
				break;
			}
		}
		
	}

}
