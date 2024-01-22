package ja;

public class reverese_Word {

	public static void main(String[] args) {

		String s=" Hello Ram How Are You";
		s=s+" ";
		String newStr="";
		String word="";
		for(int i=0;i<s.length();i++)
		{

			char ch=s.charAt(i);

			if(ch!=' ')
			{
				word=word+ch;	
			}
			else
			{
				if(word.length()!=0)
				{
					String rev="";
					for(int j=0;j<word.length();j++)
					{
						rev=word.charAt(j)+rev;
					}

					newStr=newStr+rev+" ";

					word="";
				}
			}
		}
		System.out.println(newStr);
	}
}
