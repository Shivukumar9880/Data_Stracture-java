package ja;

import java.util.Scanner;

public class s {

	public static void main(String[] args) {

		int [] a= {6,5,6,4,5,4,4,7,7,7,7,7,2,1};

		//		Set unique=new HashSet<>();
		//		Set <Integer>dup=new HashSet<>();
		//		
		//		for(int i=0;i<a.length;i++)
		//		{
		//			if(!unique.contains(a[i]))
		//			{
		//				unique.add(a[i]);
		//			}else
		//			{
		//				if(!dup.contains(a[i]))
		//				{
		//				 dup.add(a[i]);
		//					
		//				} 
		//			}
		//			
		//		}
		//		
		//		for(int i: dup)
		//		{
		//			System.out.print(i+" ");
		//		}
		//		
		//		for(int i=0;i<a.length;i++)
		//		{
		//			for(int j=0;j<(a.length-1)-i;j++)
		//			{
		//				if(a[j]>a[j+1])
		//				{
		//					int temp=a[j];
		//					a[j]=a[j+1];
		//					a[j+1]=temp;
		//					
		//				}
		//			}
		//		}
		//		
		//		System.out.println(Arrays.toString(a));
		//		
		//		int i=0; int j=a.length-1;
		//		
		//		while(i<j)
		//		{
		//			int temp=a[i];
		//			a[i]=a[j];
		//			a[j]=temp;
		//			i++;
		//			j--;
		//		}
		//		
		//		System.out.println(Arrays.toString(a));
		//		

		System.out.println("prod");
//
//		int res=1;
//		int n=45;
//		while(n>0)
//		{ 	//int d=n%10;
//			res=res*(n%10);
//			n=n/10;
//		}
//		System.out.println("prod"+res);
		
		
//		Object obj[]= {"object",'s',2,6,7.8};
//		
//		System.out.println(obj);
		
//		for(Object i :obj )
//		{
//			System.out.print(i+"  ");
//		}
		int n=5;
		int res=findNumber(0,n-1);
		System.out.println(res);
	}
	
    public static int findNumber(int low, int high) {
        if (low == high) {
            return low;
        }

        int mid = (low + high) / 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is your number between " + low + " and " + mid + "? (true/false)");
        boolean response = scanner.nextBoolean();

        if (response) {
            return findNumber(low, mid);
        } else {
            return findNumber(mid + 1, high);
        }
    }
}
