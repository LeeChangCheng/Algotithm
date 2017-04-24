package base;

	public class Node<T> {
		T item;
		Node next;
	
	
	
	public static void main(String[] args) {
		Node<String> first=new Node<String>();
		Node<String> second=new Node<String>();
		Node<String> third=new Node<String>();
		first.item="to";
		second.item="be";
		third.item="or";
		first.next=second;
		second.next=third;
		/*在链表开头插入新结点
		 * 
		//创建oldfirst并把first的内容赋给它
		Node<String> oldfirst=first;
		//令first为另一个新的结点
		first=new Node<String>();
		first.item="not";
		first.next=oldfirst;
		*/
		
		/*在表尾插入新结点
		 * Node<String> oldlast=last;
		 * last=new Node<String>();
		 * oldlast.next=last;
		 * last.item="not";
		 */
		
		//遍历
		for(Node x=first;x!=null;x=x.next){
			System.out.println(x.item);
		}
	}
	}
