package _4_Recurssion_programs;

import java.util.Scanner;

public class _15_TowerOfHanoi_Problem_Using_Recurssion 
{

	public static void towerOfHanoi(int n,char src,char aux,char dest)//standard method signature for towerOfHanoi 
	{
		
		if(n==1)
		{
			System.out.println(src+" -> "+dest);
			return;
		}
		
		towerOfHanoi(n-1, src, dest, aux);
		towerOfHanoi(1, src, aux, dest);
		towerOfHanoi(n-1, aux, src, dest);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Disk For TowerOfHanoi");
		int n=sc.nextInt();
		towerOfHanoi(n, 'A', 'B', 'C');
		
	}
}
