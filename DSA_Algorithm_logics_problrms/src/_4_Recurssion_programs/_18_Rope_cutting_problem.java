package _4_Recurssion_programs;

public class _18_Rope_cutting_problem {

	public static int maxPices(int n,int a,int b,int c)
	{
		if(n==0)
		{
			return 1;
		}
		else if(n<0)
		{
			return -1;
		}
		int temp1=maxPices(n-a,a,b,c);
		int temp2=maxPices(n-b,a,b,c);
		int temp3=maxPices(n-c,a,b,c);
		
		int pices=Math.max(temp3, Math.max(temp1, temp2));
		
		if(pices==-1)
		{
			return -1;
		}
		
		return pices+1; 
	}
	public static void main(String[] args) {
		System.out.println(maxPices(15, 5, 8, 7));
	}
}
