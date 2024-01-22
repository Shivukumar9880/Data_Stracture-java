package ja;

import java.util.Scanner;

public class Stopwatch1 
{

	 static  long startTime;
	 static long endTime;
	 static  boolean isRunning;
	  
		private static void start() 
		{
			
			if(!isRunning)
			{
				startTime=System.currentTimeMillis();
				isRunning=true;
				System.out.println("Stop watch Started");
				
			}
			else
			{
				System.out.println("StopWatch is Already Running");
			}
			
		}
		
		public static void stop()
		{
			
			if(isRunning)
			{
				endTime=System.currentTimeMillis();
				isRunning=false;
			    Long elpsedTime=endTime-startTime;
			    System.out.println("StopWatch Stoped");
			    System.out.println("ELapsed Time Is "+ formatElpsedTime(elpsedTime));
			}
			else
			{
				System.out.println("StopWath is Not Running");
			}
		}
	 
	private static String formatElpsedTime(Long elpsedTime) {
		
		Long seconds=elpsedTime/1000;
		Long milliSeconds=elpsedTime%1000;
		return seconds+" seconds "+milliSeconds+" milliseconds";	
		}

	public static void main(String[] args) {
		
		while(true)
		{
			System.out.println("1 Start");
			System.out.println("2 Stop");
			System.out.println("3 Reset");
			System.out.println("4 Exit");
			System.out.println("Enter Your Choice");
			
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			
			switch(choice)
			{
			
			case 1: start();
			break;
			case 2: stop();
			break;
			case 3: reset();
			break;
			case 4: System.exit(0);
			default: System.out.println("Invalid choice");

			}
		
		}
	}

	private static void reset() {
		
		startTime=0;
		endTime=0;
		isRunning=false;
		System.out.println("StopWatch ReSet Successfully");
		
	}


}
