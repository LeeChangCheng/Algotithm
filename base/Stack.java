package base;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Stack<T>{
	private class Node<T>{
		T item;
		Node next;
	}
	private int n;
	private Node first;
	public boolean isEmpty(){
		return n==0;
	}
	public int size(){
		return n;
	}
	public <T> void push(T item){
		Node oldfirst=first;
		first=new Node<T>();
		first.next=oldfirst;
		first.item=item;
		n++;		
	}
	public 	<T> T pop(){
		T item=(T) first.item;
		first=first.next;
		n--;
		return item;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Stack<String> s=new Stack<String>();
		while(!StdIn.isEmpty()){
			String item =StdIn.readString();
			if(!item.equals("-"))
				s.push(item);
			else if(!s.isEmpty())
				StdOut.print(s.pop()+" ");
		}
		System.out.println(s.size()+" left on stack ");
	}

}
