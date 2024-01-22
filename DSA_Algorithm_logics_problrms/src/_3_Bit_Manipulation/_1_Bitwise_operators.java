package _3_Bit_Manipulation;

public class _1_Bitwise_operators 
{

	public static void main(String[] args) {
		
		int a=5;
		int b=9;
		
		System.out.println(a|b);//13
		System.out.println(a&b);//1
		System.out.println(a^b);//12
		System.out.println(a<<1);//10
		System.out.println(b>>1);//4
		System.out.println(a>>>b);//0
		
		int x=-5;
		System.out.println(x>>1);
	}
}
