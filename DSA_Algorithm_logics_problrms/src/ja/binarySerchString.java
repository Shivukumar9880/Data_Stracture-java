package ja;

public class binarySerchString {

	public static void main(String[] args) {
		
		String [] a= {"apple","ball","cat","dog","zig"};
		String target="cat";
		System.out.println("----------------");
		int index = binnarySearch(a,target);
		if(index!=-1)
		{
			System.out.println( target+" found at index "+index);
		}else
		{
			System.out.println(target+" Not found ");
		}
		
	}

	private static int binnarySearch(String[] a, String target) {
		
		int low=0;int high=a.length-1;
		int mid=0;
		
		while(low<=high)
		{
			
			mid=(low+high)/2;
			
			int val=target.compareTo(a[mid]);
			if(val==0)
			{
				return mid;
			}
			else if(val<0)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
	
		return -1;
		
	}
}
