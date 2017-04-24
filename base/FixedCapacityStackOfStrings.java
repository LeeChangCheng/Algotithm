package base;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class FixedCapacityStackOfStrings<T> {
	private T[] a;
	private int n;
	public FixedCapacityStackOfStrings(int cap){
		a=(T[])new Object[cap];
	}
	public boolean isEmpty(){
		return n==0;
	}
	public int size(){
		return n;	
	}
	public void push(T item){
		if(n==a.length) resize(2*a.length);
		a[n++]=item;
	}
	public T pop(){
		T item= a[--n];
		a[n]=null;
		if(n>0&&n==a.length/4) resize(a.length/2);
		return item;
	}
	private void resize(int max){
		T[] temp=(T[]) new Object[max];
		for(int i=0;i<n;i++) temp[i]=a[i];
		a=temp;
	}
	
	public boolean isFull(){
		return n==a.length;
	}
	
	public static void main(String[] args) {
		FixedCapacityStackOfStrings<String> s=new FixedCapacityStackOfStrings<String>(100);
		while(!StdIn.isEmpty()){
			String item=StdIn.readString();
			if(!item.equals("-"))
				s.push(item);
			else if(!s.isEmpty())
				StdOut.print(s.pop()+" ");
		}
	}
}
