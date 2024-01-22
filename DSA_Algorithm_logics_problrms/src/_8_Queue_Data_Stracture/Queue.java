package _8_Queue_Data_Stracture;

import java.util.NoSuchElementException;

public class Queue 
{  
	Node front;
	Node rear;
	int length;
	
	class Node
	{
		Object data;
		Node next;

		public Node(Object data)
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
	// enqueue method 
	public void enqueue(Object data)
	{
		Node node=new Node(data);
		if(isEmpty())
		{
			front=node;
		}
		else
		{
			rear.next=node;
		}
		rear=node;
		length++;
	}
	
	// dequeue meyhod -------------->
	public Object deQueue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Queue IS Empty");
		}
		Object data=front.data;
		front=front.next;
		if(front==null)
		{
			rear=null;
		}
		length--;
		return data;
	}
	
	public Object front()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Queue IS Empty");

		}
		return front.data;
	}
	
	
	public Object rear()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Queue IS Empty");

		}
		return rear.data;
	}
	
	public static void main(String[] args) {
		 
		
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
//		System.out.println(q.length);
//		System.out.println(q.isEmpty());
//	   System.out.println(q.deQueue());
//	   System.out.println(q.front());
	    System.out.println(q.rear());
	    System.out.println(q.deQueue());
	    System.out.println(q.front());
	    System.out.println(q.deQueue());
	    System.out.println(q.front());
	    System.out.println(q.deQueue());
	    System.out.println(q.length);  
//	    System.out.println(q.deQueue());
	    System.out.println(q.front());
	    
		
	}
}
