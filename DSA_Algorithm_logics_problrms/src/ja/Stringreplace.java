package ja;

public class Stringreplace {

	public static void main(String[] args) {
		
		String s="HEELLO <<YOURNAME>> , HOW ARE YOU";
		s=s+" ";
		String replace="<<YOURNAME>>";
		String newStr="";
		String word="";
		String repword="RAJ";
		
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
					boolean equals = word.equals(replace);
					
					if(equals==true)
					{
						newStr=newStr+repword+"";
					}
					else
					{
						newStr=newStr+word+" ";
					}
					
					word="";
				}
			}
			
		}
	
	System.out.println(newStr);
	
	
//	String x="mari!23*^%#%*(&(";
//	System.out.println(x.replaceAll("[^a-zA-Z09]", ""));
	}
	
}
