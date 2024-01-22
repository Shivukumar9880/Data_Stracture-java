package _3_Bit_Manipulation;

public class _3_How_To_convert_Binary_Number_To_Decimal 
{

	
	public static void main(String[] args) {
		
		String s="11001011";
		int dec=0;
		int poewrOf2=1;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='1')
			{                      
				dec=dec+poewrOf2;//2pow 0=1
			}
			poewrOf2=poewrOf2*2;
		}
		System.out.println(dec);
		/**
		 * @Below_Lines_Of_Code_Work_For_Integer_Input
		 * 		int x=11001011;
		while(x>0)
		{
			int d=x%10;
			if(d==1)
			{
				dec=dec+poewrOf2;//2pow 0=1
			}
			poewrOf2=poewrOf2*2;
			x=x/10;
		}
		System.out.println(dec);
		 */

	}
}
