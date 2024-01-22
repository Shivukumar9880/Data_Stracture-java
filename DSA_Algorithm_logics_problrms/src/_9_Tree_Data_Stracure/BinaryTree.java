package _9_Tree_Data_Stracure;

import java.util.Stack;

public class BinaryTree {

	TreeNode root;
	
	class TreeNode
	{
		
		TreeNode left;
		TreeNode right;
		int data;//this generic we can use any type of data like int,String,char or Object
		
		public TreeNode(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public void createBinaryTree()
	{
		TreeNode first=new TreeNode(9);
		TreeNode second=new TreeNode(5);
		TreeNode third=new TreeNode(4);
		TreeNode fourth=new TreeNode(8);
		TreeNode fifth=new TreeNode(10);
		
		//createing binary tree by chaining them
		
		root=first;
		first.left=second;//    second<-----first----->third
		first.right=third;
		second.left=fourth;
		second.right=fifth;//  fouth<-------SECOND------->fifth
		
	}
	
	//----------------------pre-order binary traversal using recurssion----------------------------
	public void preOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//-------------------pre order traveral using iterartive aapporch-----------------------------------
	
		public void preOrder()
		{
			if(root==null)
			{
				return;
			}
			
			Stack<TreeNode> stack=new Stack<TreeNode>();
			
			stack.push(root);
			while(!stack.isEmpty())
			{
				TreeNode temp=stack.pop();
				System.out.print(temp.data+" ");
				if(temp.right!=null)
				{
					stack.push(temp.right);
					
				}
				if(temp.left!=null)
				{
					stack.push(temp.left);
				}
			}
			
		}
		
		
		//-----------------------in order traversal Recurrsion---------------------------
		
		
		public void inOrder(TreeNode root)
		{
			
			if(root==null)
			{
				return;
			}
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	
		// -------------------------Inorder traversal using iteration------------------
		
		public void inOrder()
		{
			if(root==null)
			{
				return ;
			}
			
			Stack <TreeNode>stack=new Stack();
			TreeNode temp=root;
			
			while(! stack.isEmpty()|| temp!=null)
			{
				if(temp!=null)
				{
					stack.push(temp);
					temp=temp.left;
				}else
				{
					temp=stack.pop();
					System.out.print(temp.data+" ");
					temp=temp.right;
				}
			}
		}
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		System.out.println("----------------------pre-order---------------------------");

		bt.createBinaryTree();
	    bt.preOrder(bt.root);
	    System.out.println();
		bt.preOrder();
		System.out.println();
		System.out.println("----------------------in-order---------------------------");
		bt.inOrder(bt.root);
		System.out.println();
		bt.inOrder();
		System.out.println();
		System.out.println("----------------------post-order---------------------------");

	}
	
	
}

