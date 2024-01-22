package _5_Array_Problems_Tap_Tap_Academay;

public class _K_Wood_Cutting_Problem_Asked_In_FlipKart {

	public static int machineHeight(int ht[],int b)
	{
		int max=0;
		for(int i=0;i<ht.length;i++)
		{
			if(ht[i]>max)
			{
				max=ht[i];
			}
		}
		
		int l=0; int h=max;int mid=0;
		while(l<=h)
		{
			mid=(l+h)/2;
			int wc=findWoodCount(ht,mid);
			
			if(wc==b || l==mid)
			{
				return mid;
			}else if(wc>b)
			{
				l=mid;
			}
			else
			{
				h=mid;
			}
			
			
		}
		return -1;
	}

	private static int findWoodCount(int[] ht, int mid) {
		int wc=0;
		for(int i=0;i<ht.length;i++)
		{
			if(ht[i]>mid)
			{
				wc=wc+(ht[i]-mid);
			}
		}
		return wc;
	}




	public static void main(String[] args) {
		
		int [] a= {20,15,10,17};
		int b=20;//no of wood pecies required so baswd on this we adjust heght of machine 
		System.out.println(machineHeight(a, b));//to get that no of wood peice how much heght is enough it will give
	}
}
