package _6_Linked_List;

import java.util.NoSuchElementException;

public class DoublyLinkedList 
{
	private Node head;
	private Node tail;
	private int length;

	public class Node
	{
		private Object data;
		private Node previous;
		private Node next;

		public Node(Object data)
		{
			this.data=data;
		}
	}
	public DoublyLinkedList()
	{
		this.head=null;
		this.tail=null;
		this.length=0;
	}

	public boolean isEmpty()
	{
		return length==0;//head=null;
	}
	
	
	public int length()
	{
		return length;
	}
	
	public void insertFirst(Object data)
	{
		Node node=new Node(data);
		if(isEmpty())
		{
			tail=node;
		}
		else
		{
			head.previous=node;
		}
		node.next=head;
		head=node;
		length++;
	}
	
	public void displyForword()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.previous;
		}
		System.out.println("null");
	}
	
	public void insertLast(Object data)
	{
		Node node=new Node(data);
		if(isEmpty())
		{
			head=node;
		}else
		{
			tail.next=node;
			node.previous=tail;
		}
		tail=node;
		length++;
	}
	
	public Object deleteFirst()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		Node temp=head;
		if(head==tail)
		{
			tail=null;
		}
		else
		{
			head.next.previous=null;
		}
		head=head.next;
		temp.next=null;
		length--;
		return temp.data;

	}
	public Object deleteLast()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		Node temp=tail;
		if(head==tail)
		{
			head=null;
		}
		else
		{
			tail.previous.next=null;
		}
		tail=tail.previous;
		temp.previous=null;
		length--;
		return temp.data;
		
	}
	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		System.out.println(dll.isEmpty());
		System.out.println(dll.length());
		
		dll.insertFirst(15);
		dll.insertFirst(10);
		dll.insertFirst(1);
		
		dll.insertLast(65);
		dll.insertLast(75);
	
		dll.displyForword();
		dll.deleteFirst();
		dll.deleteLast();
		dll.displyForword();
		dll.displayBackward();	
	}
}
