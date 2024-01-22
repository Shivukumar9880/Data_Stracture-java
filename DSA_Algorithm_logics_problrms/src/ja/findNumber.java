package ja;

import java.util.Scanner;

public class findNumber {

	public static void main(String[] args) {
		
		
		System.out.println("Enter N value");
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int low=0;
		int high=N-1;
		int mid=0;
		while(low<high)
		{
			 mid=(low+high)/2;
			System.out.println("Your gessing number is Between "+low+" and "+ mid+" ?(True/false)");
			boolean response=sc.nextBoolean();
			
			if(response)
			{
				high=mid;
			}else
			{
				low=mid+1;
			}
			
		}
		
		System.out.println(mid+1);
		
	}
}
