package base;

import java.util.LinkedList;
import java.util.List;


public class BinaryTreeTraversal {
	public int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };  
    public static List<Node> nodeList = null;  
  
    /** 
     * �ڲ��ࣺ�ڵ� 
     *  
     *         1
     *        / \
     *       2  3
     *      /\  /\
     *      4567
     *     /\
     *     89 
     *  
     */  
       public static class Node {  
        Node leftChild;  
        Node rightChild;  
        int data;  
  
        Node(int newData) {  
            leftChild = null;  
            rightChild = null;  
            data = newData;  
        }  
    }  
	public void createBinTree() {  
        nodeList = new LinkedList<Node>();  
        // ��һ�������ֵ����ת��ΪNode�ڵ�  
        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {  
            nodeList.add(new Node(array[nodeIndex]));  
        }  
        // ��ǰlastParentIndex-1�����ڵ㰴�ո��ڵ��뺢�ӽڵ�����ֹ�ϵ����������  
        for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {  
            // ����  
            nodeList.get(parentIndex).leftChild = nodeList  
                    .get(parentIndex * 2 + 1);  
            // �Һ���  
            nodeList.get(parentIndex).rightChild = nodeList  
                    .get(parentIndex * 2 + 2);  
        }  
        // ���һ�����ڵ�:��Ϊ���һ�����ڵ����û���Һ��ӣ����Ե����ó�������  
        int lastParentIndex = array.length / 2 - 1;  
        // ����  
        nodeList.get(lastParentIndex).leftChild = nodeList  
                .get(lastParentIndex * 2 + 1);  
        // �Һ���,�������ĳ���Ϊ�����Ž����Һ���  
        if (array.length % 2 == 1) {  
            nodeList.get(lastParentIndex).rightChild = nodeList  
                    .get(lastParentIndex * 2 + 2);  
        }  
    }  

	public static void preOrderTraversal(Node root){
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrderTraversal(root.leftChild);
		preOrderTraversal(root.rightChild);
	}
	
	public static void inOrderTraversal(Node root){
		if(root==null)
			return;
		inOrderTraversal(root.leftChild);
		System.out.print(root.data+" ");
		inOrderTraversal(root.rightChild);
	}
	public static void postOrderTraversal(Node root){
		if(root==null)
			return;
		postOrderTraversal(root.leftChild);
		postOrderTraversal(root.rightChild);
		System.out.print(root.data+" ");
	}
/**
 * Morris�������
 * 
 */
	public static void MorrisInorder(Node root){
		Node p=root,temp;
		while(p!=null)
			if(p.leftChild==null){
				System.out.print(p.data+" ");
				p=p.rightChild;
			}
			else{
				temp=p.leftChild;
				while(temp.rightChild!=null&&temp.rightChild!=p) temp=temp.rightChild;
				if(temp.rightChild==null){
					temp.rightChild=p;
					p=p.leftChild;
				}
				else{
					System.out.print(p.data+" ");
					temp.rightChild=null;
					p=p.rightChild;
				}
			}
		
	}
	public static void insert(int el,Node root){
		Node p=root,prev=null;
		while(p!=null){
			prev=p;
			if(p.data<el)
				p=p.rightChild;
			else p=p.leftChild;	
		}
		if(root==null)
			root=new Node(el);
		else if(prev.data<el)
			prev.rightChild=new Node(el);
		else prev.leftChild=new Node(el);
	}
	/**
	 * 
	 * �鲢ɾ��(��bug)
	 * first���ҵ�Ҫɾ���Ľڵ�
	   second�����ɾ���Ľڵ�û����������ô�������������ڵ�
	   third�����ɾ���Ľڵ�û����������ô�������������ڵ�
	   forth�����ɾ���Ľڵ������Һ��ӣ���ô���Թ鲢ɾ���ڵ���������
	   ����������һ������ɾ���ڵ�������������ҽڵ㣬ָ��ɾ���ڵ����������
	   ��һ������ɾ���ڵ��������������ڵ�ָ��ɾ���ڵ����������
	 */
	public static void deleteByMerging(int el,Node root){
		 Node tmp,node,p=root,prev=null;
		/*find the node to be deleted*/
		while(p!=null&&p.data!=el){
			prev=p;
			if(p.data<el)
				p=p.rightChild;
			else p=p.leftChild;
		}
		/*find end*/
	
		node=p;
		if(p!=null&&p.data==el){
		if(node.rightChild==null)   //node has no right child then its left child (if any) is attached to 
			node=node.leftChild;   //its parent
		if(node.leftChild==null)//node has no left child then its right child (if any) is attched to
			   node=node.rightChild;      //its parent
		if(node.rightChild!=null&&node.leftChild!=null){
			tmp=node.leftChild;    
			
			while(tmp.rightChild!=null)
				tmp=tmp.rightChild;      //find the rightmost node of the left subtree
			
			tmp.rightChild=node.rightChild;   //establish the link between the rightmost node of the left subtree and the right subtree
			node=node.leftChild;
		}
		
		if(p==root) root=node;
		
		else if (prev.leftChild==p)
			prev.leftChild=node;
		
		else prev.rightChild=node;
		}
		
	}
	
	public static void deleteByCopying(int el,Node root){
		Node node,p=root,prev=null;
		while(p!=null&&p.data!=el){
			prev=p;
			if(p.data<el)
				p=p.rightChild;
			else
				p=p.leftChild;
		}
		node=p;
		if(p!=null&&p.data==el){
			if(node.rightChild==null)
				node=node.leftChild;
			else if(node.leftChild==null)
				node=node.rightChild;
			else{
				Node tmp=node.leftChild;
				Node previous=node;
				while(tmp.rightChild!=null){
					previous=tmp;
					tmp=tmp.rightChild;
				}
				node.data=tmp.data;
				if(previous==node)
					previous.leftChild=tmp.leftChild;
				else previous.rightChild=tmp.leftChild;
				}
			if(p==root)
				root=node;
			else if(prev.leftChild==p)
				prev.leftChild=node;
			else prev.rightChild=node;
			}
		
	}
		
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		BinaryTreeTraversal binTree = new BinaryTreeTraversal();  
        binTree.createBinTree();  
        // nodeList�е�0����������ֵ��Ϊ���ڵ�  
        Node root = nodeList.get(0);  
        
        //����ڵ�
        insert(10, root);
        insert(11, root);
        insert(12, root);
        
        deleteByCopying(6,root);
        
        System.out.println("���������");  
        preOrderTraversal(root);  
        System.out.println();  
  
        System.out.println("���������");  
        inOrderTraversal(root);  
        System.out.println();  
  
        System.out.println("���������");  
        postOrderTraversal(root);  
        System.out.println();  
        
        deleteByMerging(5, root);
        
        System.out.println("Morris��������� ");
        MorrisInorder(root);
      

    }  
}


