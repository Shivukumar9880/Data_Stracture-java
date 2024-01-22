package _6_Linked_List;





public class SlinglyLinkedList {

	public  class Node
	{

		Object data;//genaric type work for all type of data
		Node next;
		public Node(Object data)
		{
			this.data=data;
		}
	}
	Node head;
	Node tail;

	
//------------------------display---------------------------------
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
//----------------------------length-------------------------------------
	public int length()
	{
		if(head==null)
		{
			return 0;
		}
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;//counting till end node  and returning
	}
	
//----------------------------insertAtBegining----------------
	
	public void insertFirst(Object data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
	}

//----------------------insertAtGivenIndexPosition---------------

	public void insert(Object data,int position)
	{

		//10-->20-->30//pos=2 data=100
		//10-->100-->20-->30 after execution this method out put
		Node node=new Node(data);//node is created
		
		if(!(position>=1 && position<=length()+1))//we need to add at last positin of ssl  position<=length()+1   length that show last node positin but we are indertion node at after that last node so +1 in acceptable
		{
			System.out.println("Index Not In The Range ");
			return;
		}
		
		if(position==1)
		{
			node.next=head;
			head=tail=node;
		}
		else
		{
			Node temp=head;
			int count=1;//pos=3;
			while(count < position-1)//this is the mejar condition in
			{
				temp=temp.next;
				count++;
			}
			if( temp.next != null)
			{
				Node current=temp.next;
				node.next=current;
				temp.next=node;

			}else
			{   //for tail condition
				node.next =  temp.next;
				temp.next = node;
				tail = node;
			}
		}
	}
//------------------------insertAtLast------------
	
	public void insertLast(Object data)
	{
		Node node=new Node(data);

		if(head==null)
		{
			head=tail=node;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=node;
		tail=node;
	}
//-------------------delete First------------------------------
	public Object deleteFirst()
	{
		if(head==null)
		{
			return "There is No Elements in Sll To Delete";
		}
		Node temp=head;
		head=head.next;
		temp.next=null;
		return temp.data;
	}

//-----------------deleteAtLast---------------------------------
	
	public Object deleteLast()
	{
		if(head==null||head.next==null)
		{        Node temp=head;
		         head=null;
		         return temp.data;//delete last means deleteing element from last at there is only one element theen there is no element to delete it it return that data 
		}

		Node current=head;
		Node previous=null;//using this pointer beacuse of To Delete Last Element we Require SecondLastELemenet to Store That Second Largerst We are using This Pointer 

		while(current.next!=null)
		{
			previous=current;
			current=current.next;
		}
		previous.next=null;
		tail=previous;
		return current.data;
	}
//-----------------------deleteAtParticularIndex-----------------------
	
	public void delete(int position)
	{
		if(!(position >=1 && position<=length()))
		{
			System.out.println("Index NOt In Range ");
			return;
		}
		if(position==1)
		{
			Node temp=head;
			head=temp.next;
			temp.next=null;	
		}
		else
		{
			Node temp=head;
			int count=1;
			while(count < position-1)
			{
				temp=temp.next;
				count++;
			}
			
			Node current=temp.next;
			if(current.next!=null)
			{
				temp.next=current.next;
			}
			else
			{
				temp.next=current.next;
				tail=temp;
			}
		}
		
	}
//---------------------middle element------------------------------------
	public Object getMiddleNode()
	{
		if(head==null)
		{
			return null;
		}
		Node slowPtr=head;
		Node fastPtr=head;
		
	 	while(fastPtr!=null && fastPtr.next!=null)//if i use count its pintinf to middle but i cant get thata node data tats i am using two pointers to tarck the nodes 
		{
			slowPtr=slowPtr.next;//one step
			fastPtr=fastPtr.next.next;//two step
		}
		return slowPtr.data;
	}
//---------------------search------------------------
	public boolean search(Node head,Object searchKey)
	{
		if(head==null)
		{
			return false;
		}
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==searchKey)
			{
				System.out.println(temp.data);
				return true;
			}
			temp=temp.next;
		}
		System.out.println("fail");
		return false;
	}
//---------------------------reverse sll----------------------------
	public void revereseSll()
	{
		if(head==null)
		{
			return ;
		}
		Node current=head;
		Node previous=null;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=previous; 
			previous=current;
			current=next;	
		}

		 head=previous;
	}
//-------------------------------from end nth node-------------------
	public Object getNthNodeFromEnd(int n)
	{
		if(head==null)
		{
			return null;
		}
		if(n<=0)
		{
			throw new IllegalArgumentException("The value of"+n+" is In valid");
		}
		
		Node refPtr=head;
		Node mainPtr=head;
		
		int count=0;
		while(count<n)
		{  if(refPtr==null)
			{
			throw new IllegalArgumentException(n +" is greter then no of nodes in the list");
                
			}
				refPtr=refPtr.next;
				count++;
		}
		
		while(refPtr!=null)
		{
			refPtr=refPtr.next;
			mainPtr=mainPtr.next;
		}
		return mainPtr.data;
	}
	
//------------------------sll loop checking----------------
	
	public boolean isContainsLoop()
	{
		if(head==null)
		{
			return false;
		}
		
		Node slowPtr=head;
		Node fastPtr=head;
		
		while(fastPtr!=null && fastPtr.next!=null)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
			
			if( slowPtr == fastPtr)
			{
				return true;
			}
		}
		return false;
	}
	
//-------------------creating loop-------------------------
	public void CreateALoopInLinkedList()
	{
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		Node sixth=new Node(6);
		
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=third;
		
	}
	
// -----------------------find starting point of loop insll------------------------
	public Object FindStartingPonitInLoop()
	{
		Node slowPtr=head;
		Node fastPtr=head;
		
		while(fastPtr!=null && fastPtr.next!=null)
		{
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			if(slowPtr==fastPtr)
			{
				return getStartingPoint(slowPtr);
			}
		}
		return null;
	}
	public Object getStartingPoint(Node slowPtr)
	{
		Node temp=head;
		
		while(temp!=slowPtr)
		{
			temp=temp.next;
			slowPtr=slowPtr.next;
			if(temp==slowPtr)
			{
				return temp.data;
			}
					
		}
		return  null;
	}
//-------------------------------remove loop in sll--------------------
	public void removeLoop()
	{
		Node slowPtr=head;
		Node fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null)
		{
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			if(slowPtr==fastPtr)
			{
				removeLoop(slowPtr);
				return;
			}
		}
	}
	
	public void removeLoop(Node slowPtr)
	{
		Node temp=head;
		
		while(temp.next!=slowPtr.next)
		{
			temp=temp.next;
			slowPtr=slowPtr.next;	
		}
		slowPtr.next=null;
	}
	public static void main(String[] args) {

		SlinglyLinkedList sll= new SlinglyLinkedList();

		/**
		 * @param explicitly creating nodes 
		 *  Node first = sll.new Node(10);
		 *  Node second = sll.new Node(20);
		 *	Node third = sll.new Node(30);
		 *	Node fourth = sll.new Node(40);
		 *
		 *	// now we are connecting them to form a chain 
		 *	sll.head=first;//10
		 *	first.next=second;//10-->20
		 *	second.next=third;//10-->20-->30
		 *	third.next=fourth;//10-->20-->30-->40
		 *	sll.tail=fourth;//40
		 */
//		sll.insertFirst(100);
//		sll.insertFirst(90);
//		sll.insertFirst(50);
//		sll.insertFirst(10);
//		sll.insertLast(500);
//		sll.insertLast(1000);
//		sll.insert(70000, 8);
//		sll.display();
//		System.out.println(	sll.deleteFirst());
//		System.out.println(	sll.deleteFirst());
//		sll.display();
//
//		System.out.println(sll.deleteLast());
//		sll.display();
//		System.out.println(sll.deleteLast());
//		sll.display();
//		System.out.println(sll.deleteLast());
//		sll.display();
//		System.out.println(sll.deleteLast());
//		sll.display();
//		//		System.out.println(sll.tail.data);
//		System.out.println("Length Is "+sll.length());
//		System.out.println("--------------------------");
//		sll.insertLast(100);
//		sll.insertLast(60);
//		sll.insertLast(11);
//		sll.insertLast(90);
//		sll.insertLast(50);
//		sll.insertLast(10);
		
//		sll.insertLast(500);
//		sll.insertLast(1000);
////		sll.insertLast(5000);
//		sll.display();
////		sll.delete(6);
//		sll.display();
//		System.out.println("middle node is : "+sll.getMiddleNode());
//		sll.display();
////		sll.revereseSll();
//		sll.display(); 
//		System.out.println(sll.getNthNodeFromEnd(9));
		
//		System.out.println(sll.search(sll.head,11));
		
		
		sll.CreateALoopInLinkedList();
	    System.out.println(	sll.isContainsLoop());//true; in this method lopping happens contineously at that one point both ponters are meating ata single point then retun true other wise it return false
//	    sll.display();//it gives contineous looping
       System.out.println( sll.FindStartingPonitInLoop());
       
       sll.removeLoop();//remove loop from  and print that sll
       sll.display();
       System.out.println(sll.isContainsLoop());
       System.out.println( sll.FindStartingPonitInLoop());
	}


}
