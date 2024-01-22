package _6_Linked_List;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

import javax.sound.midi.Soundbank;

public class CircularLinkedList 
{

	private Node last;
	int length=0;
	public class Node
	{
		private Object data;
		private Node next;
		public Node(Object data)
		{
			this.data=data;
		}
	}

	public boolean isEmpty()
	{
		return length==0;
	}

	public int length()
	{
		return length;
	}

	public void createACricularList()
	{
		Node first=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);

		first.next=second;
		second.next=third;
		third.next=first;
		last=third;

	}

	public void display()
	{
		if(last==null)
		{
			throw new NoSuchElementException();
		}
		Node first=last.next;

		while(first!=last)
		{
			System.out.print(first.data+" --> ");
			first=first.next;
		}
		System.out.println(first.data+"->");
	}

	public void insertFirst(Object data)
	{ Node node=new Node(data);
	if(last==null)
	{ 
		last=node;
	}
	else
	{
		node.next=last.next;//last pointing node pointing to newly created node 
	}
	last.next=node;
	length++;
	}


	public void insertLast(Object data)
	{
		Node node=new Node(data);

		if(last==null)
		{
			last=node;
			last.next=last;
		}else
		{
			node.next=last.next;
			last.next=node;	
			last=node;
		}
		length++;
	}
	public void insertAtIndex(Object data, int index) 
	{
		if (!(index >0 || index <length+1)) 
		{
			throw new IndexOutOfBoundsException("Invalid index");
		}

		if (index == 0) 
		{
			insertFirst(data);
		} 
		else if (index == length+1) 
		{
			insertLast(data);
		} 
		else
		{
			Node newNode = new Node(data);
			Node current = last.next;
			int count=1;
			while(count  < index - 1) 
			{
				current = current.next;
				count++;
			}
			newNode.next = current.next;
			current.next = newNode;
			length++;
		}
	}



	public Object deleteFirst()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		Node temp=last.next;
		if(last.next==last)
		{
			last=null;
		}
		else
		{
			last.next=temp.next;

		}
		temp.next=null;
		length--;
		return temp.data;
	}
	public Object deleteLast() 
	{
		if (isEmpty()) 
		{
			throw new NoSuchElementException();
		}
		Node temp = last; // Start at the last node
		if (last.next == last) 
		{
			Node node1=last;
			// If there is only one element in the list, set last to null
			last = null;
			length--;
			return node1.data;   
		} 
		else 
		{
			// Traverse the list to find the second-to-last element
			while (temp.next != last) 
			{
				temp = temp.next;
			}
			// Update the second-to-last element's next pointer
			temp.next = last.next;
		}
		Object deletedData = last.data;
		last = temp; // Update last to the new last element
		length--;
		return deletedData;
	}
	public boolean searchAndDelete(Object targetData)
	{
		if (isEmpty()) {
			return false; // List is empty, so the target element cannot be found.
		}

		Node current = last.next;
		Node prev = last;

		do {
			if(current.data==targetData)
			{
				prev.next = current.next;
				current.next = null;
				if (current == last.next) 
				{
					last.next = prev.next;
				}
				length--;
				return true; // Element found and deleted.
			}
			prev = current;
			current = current.next;
		} while (current != last.next);

		return false; // Element not found.
	}


	public Object searchAnd(int key)
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}

		Node temp=last.next;
		Node prev=last;
		while(temp!=last)
		{     
			if((int)temp.data==key)
			{
				prev.next=temp.next;
				Object data=temp.data;
				temp.next=null;
				length--;
				return data;
			}
			prev=temp;
			temp=temp.next;
		}
		if(temp==last)
		{
			if((int)temp.data==key)
			{
				prev.next=temp.next;
				Object data=temp.data;
				temp.next=null;
				last=prev;
				length--;
				return data;
			}
		}
	
		return null;
	}

	public static void main(String[] args)
	{
		CircularLinkedList cll=new CircularLinkedList();
		//		cll.createACricularList();
		//		cll.display();
		cll.insertFirst(100);
		cll.insertFirst(200);
		cll.insertFirst(400);
		cll.insertFirst(500);
		cll.display();
		cll.insertAtIndex(50000, 5);
		cll.display();
		//		
		////		cll.deleteFirst();
		//		cll.insertAtIndex(50000000, 3);
		//		System.out.println(cll.length);
		//		cll.display();
		//		System.out.println(cll.searchAndDelete(100));
		////		cll.deleteLast();
		////		cll.deleteLast();cll.deleteLast();
		////		cll.deleteLast();//
		//		System.out.println(cll.isEmpty());
		////		cll.deleteLast();//

//		System.out.println(cll.searchAnd(1000));
////		System.out.println(cll.searchAnd(200));
////		System.out.println(cll.searchAnd(500));
//		System.out.println(cll.length);
//		cll.display();
	}
}
