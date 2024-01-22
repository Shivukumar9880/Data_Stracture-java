import java.util.ArrayList;

public class Java2 
{
	
	
	public static boolean arraySame(int[] a,int[] b)
	{
		System.out.println("Arras are same");
		
		
		if(a.length!=b.length)
		{
			for(int i=0;i<b.length;i++)//4  //3
			{
				if(a[i]!=b[i])
				{
					return false;
				}
			} 
		}
	
		
		return true;
	}

	public static void main(String[] args) 
	{

		int []a= {12,3,4,5};
		int []b= {12,3,4};
		
		if(arraySame(a, b))
		{
			System.out.println("Arrays are same");
		}
		else
		{
			System.out.println("Arrays  are Not  same");
		}
		
	

		
		

		
		
	}
}
