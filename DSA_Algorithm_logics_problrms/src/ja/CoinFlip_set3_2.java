package ja;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip_set3_2 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Number of times to Flip the coin");
		
		Scanner sc=new Scanner(System.in);
		
		int numFlips=sc.nextInt();
		
		if(numFlips<0)
		{
			System.out.println("Enter positive value");
			return;
		}
		
		int headCount=0;
		int tailCOunt=0;
		Random random=new Random();
		for(int i=0;i<numFlips;i++)
		{
			double flipval = random.nextDouble();
			if(flipval<0.5)
			{
				headCount++;
			}else
			{
				tailCOunt++;
			}
		}
		
		System.out.println(headCount);
		System.out.println(tailCOunt);
		System.out.println("percentage of headCount "+ (double) headCount/numFlips*100);
		System.out.println("percentage of headCount "+(double) tailCOunt/numFlips*100);
	}
}
