package ja;

public class insertion_sort_s {

	public static void main(String[] args) {
		
//		int [] a= {1,4,3,6,9,17,9,9,9};

		String[] a= {"zppple","blll","cat","egg","nox"};
		for(int i=1;i<a.length;i++)
		{
			String key=a[i];
			int j=i-1;
			
//			key.compareTo(a[j])
			
			if(j>=0 && a[j].compareTo(key)>0)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
