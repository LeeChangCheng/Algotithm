package base;

public class Queue<T> {
	
	private Node first;
	private Node last;
	private int n;
	
	private class Node<T>{
		T item;
		Node next;
	}
	public boolean isEmpty(){
		return n==0;
	}
	public int size(){
		return 0;
	}
	public void enqueue(T item){
		Node oldlast=last;
		Node last=new Node();
		
		last.item=item;
		last.next=null;
		if(isEmpty())
			first=last;
		else
			oldlast.next=last;
		 	n++;
	}
	public T dequeue(){
		T item=(T) first.item;
		first=first.next;
		if(isEmpty())
			last=null;
		return item;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Queue.Node x=new Queue.Node();
		System.out.println(x.n);
	}

}
