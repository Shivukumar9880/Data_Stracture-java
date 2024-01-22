package _7_Stack_Data_Stracture;

import java.util.Scanner;
import java.util.Stack;
public class StackArray 
{

	 
	int top;
	
	int [] stack;
	
	
	public StackArray(int capacity)
	{
		top=-1;
		stack=new int[capacity];	
	}
	
	//----------------------size()-> method is used to find current size the size of stack------------------------------
	
	public  int size()
	{
		return top+1;
	}
	
	//-----------------------isFull()-> is used to compare the array.length==with the current size of yhe stack----------
	public boolean isFull()
	{
		return stack.length==size();
	}
	
	
	//--------------------------push()->used add data to stack----------------------------
	public void push(int data)
	{
		if(isFull())
		{
			throw new RuntimeException("Stack is Full");
		}
		top++;
		stack[top]=data;
	}
	
	
	//-----------------------isEmpty()-is check the current size of stack is < 0 means it throw exception---------------
	
	public boolean isEmpty()
	{
		return top < 0;//top is our tracing point
	}
	
	
	// =----------------pop() methodis used to remove elements from stack --------------------------------------------------------
	public int pop()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Stack is Empty");
		}
		int data=stack[top];
		top--;
		return data;
	}
	
	
	//----------------------peek method----------------
	
	public int peek()
	{ 
		if(isEmpty())
		{
			throw new RuntimeException("stack is empty");
		}
		return stack[top];
	}
	
	
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size of the stack");
//		int capacity = sc.nextInt();
//		
//		StackArray sa=new StackArray(capacity);
//		
//		System.out.println(sa.isFull());
//		sa.push(10);
//		System.out.println(sa.size());
//		System.out.println(sa.peek());
//		
//		sa.push(20);
//		System.out.println(sa.size());
//		System.out.println(sa.peek());
//		
//		sa.push(30);
//		System.out.println(sa.size());
//		System.out.println(sa.peek());
//		
////		sa.push(40);
////		System.out.println(sa.size());
////		System.out.println(sa.peek());
//		
//		System.out.println(sa.isEmpty());
//		System.out.println(sa.isFull());
		
		
	}
	

	
}
