package ja;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponGenerator 
{
	public static int generateRandomCoupon(int N)
	{
		Random random = new Random();
		return random.nextInt(N) + 1;//its range from 0-4 we require till 5 so add+1;
	}

	public static int generateDistinctCoupons(int N)
	{
		Set<Integer> distinctCoupons = new HashSet<>();
		int totalRandomNumbers = 0;

		while (distinctCoupons.size() < N) 
		{
			int randomCoupon = generateRandomCoupon(N);
			totalRandomNumbers++;

			if (!distinctCoupons.contains(randomCoupon)) 
			{
				distinctCoupons.add(randomCoupon);
			}
		}

		return totalRandomNumbers;
	}

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of distinct coupon numbers (N): ");
		int N = scanner.nextInt();

		if (N <= 0) 
		{
			System.out.println("N must be greater than 0.");
		} else 
		{
			int totalRandomNumbersNeeded = generateDistinctCoupons(N);
			System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumbersNeeded);
		}
	}
}
