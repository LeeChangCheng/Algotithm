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
		/*������ͷ�����½��
		 * 
		//����oldfirst����first�����ݸ�����
		Node<String> oldfirst=first;
		//��firstΪ��һ���µĽ��
		first=new Node<String>();
		first.item="not";
		first.next=oldfirst;
		*/
		
		/*�ڱ�β�����½��
		 * Node<String> oldlast=last;
		 * last=new Node<String>();
		 * oldlast.next=last;
		 * last.item="not";
		 */
		
		//����
		for(Node x=first;x!=null;x=x.next){
			System.out.println(x.item);
		}
	}
	}
