package _7_Stack_Data_Stracture;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {

	Node top;

	int length;
	class Node
	{
		Object data;
		Node next;
		public 	Node(Object data)
		{
			this.data=data;
		}
	}

	public int length()
	{
		return length;
	}

	public boolean isEmpty()
	{
		return length==0;
	}

	public void push(Object data)
	{
		Node node=new Node(data);
		node.next=top;
		top=node;
	    length++;
	}

	public Object pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}

		Object data=top;
		top=top.next;
		length--;
		return data;
	}

	public Object peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return top.data;  
	}
	public static void main(String[] args) {

		Stack s=new Stack();
		System.out.println(s.length());
		s.push(10);
		s.push(20);
		s.push(90);
		System.out.println("lngth of an Stack "+s.length());
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());//its show Exception
//		Object [] ar={1,"string",9.0,11010,true};
		
		
	}
}
