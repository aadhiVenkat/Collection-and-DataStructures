package DynamicLinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
	private class Node{
		private int value;
		private Node next;
		public Node(int value)
		{
	 		this.value=value;
		}
	}
	private Node First;
	private Node Last;
	
	public void addLast(int item){
		Node node=new Node(item);	
		if(isEmpty())
			First=Last=node;
		else
		{
			Last.next=node;
			Last=node;
		}			
	}
	public void addFirst(int item){
		Node node=new Node(item);
		if(isEmpty())
			First=Last=node;
		else
		{
			node.next=First;
			First=node;
		}
		
	}
	public int indexOf(int item) {
		int index=0;
		Node current=First;
		while(current!=null) {
			if(current.value==item) return index;
			current=current.next;
			index++;
		}
		return -1;	
		
	}
	public void remove(int index) {
		 if(index==0)
			 removeFirst();			
		else if(index==(size()-1))
			removeLast();
		else if(index>=size())
				throw new IndexOutOfBoundsException();
		else {			
			int count=0;
			Node current=First;
			while(count<index) {
				if(count==index)
					break;
				current=current.next;
				count++;
			}
			Node previous=getPrevious(current);
			Node temp=current.next;
			previous.next=temp;
			current=null;	
		}				
	}
	public boolean contains(int item)
	{
		return indexOf(item)!=-1;
	}
	public void removeFirst() {
		if(isEmpty())
			throw new NoSuchElementException(); 
		if(First==Last)
		{
			First=Last=null;
			return;
		}
		Node second=First.next;
		First.next=null;
		First=second;
	}
	public void removeLast() {
		Node previous=getPrevious(Last);
		Last=previous;
		Last.next=null;		
	}
	
	private boolean isEmpty() {
		return First==null;
	}
	private Node getPrevious(Node node) {
		Node current=First;
		while(current!=null) {
			if(current.next==node) return current;
			current=current.next;
		}
		return null;
	}
	private int size(){
		Node current=First;
		int count=0;
		while(current!=null) {
			current=current.next;
			count++;
		}
		return count;
		
	}
	

}
