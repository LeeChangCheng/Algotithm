package base;

import java.util.LinkedList;
import java.util.List;


public class BinaryTreeTraversal {
	public int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };  
    public static List<Node> nodeList = null;  
  
    /** 
     * 内部类：节点 
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
        // 将一个数组的值依次转换为Node节点  
        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {  
            nodeList.add(new Node(array[nodeIndex]));  
        }  
        // 对前lastParentIndex-1个父节点按照父节点与孩子节点的数字关系建立二叉树  
        for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {  
            // 左孩子  
            nodeList.get(parentIndex).leftChild = nodeList  
                    .get(parentIndex * 2 + 1);  
            // 右孩子  
            nodeList.get(parentIndex).rightChild = nodeList  
                    .get(parentIndex * 2 + 2);  
        }  
        // 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理  
        int lastParentIndex = array.length / 2 - 1;  
        // 左孩子  
        nodeList.get(lastParentIndex).leftChild = nodeList  
                .get(lastParentIndex * 2 + 1);  
        // 右孩子,如果数组的长度为奇数才建立右孩子  
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
 * Morris中序遍历
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
	 * 归并删除(有bug)
	 * first：找到要删除的节点
	   second：如果删除的节点没有右子树那么左子树链到父节点
	   third：如果删除的节点没有左子树那么右子树链到父节点
	   forth：如果删除的节点又左右孩子，那么可以归并删除节点后的子树：
	   方法有两种一种是用删除节点的左子树的最右节点，指向删除节点的右子树，
	   另一种是用删除节点的用字数的最左节点指向删除节点的左子树。
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
		// TODO 自动生成的方法存根
		BinaryTreeTraversal binTree = new BinaryTreeTraversal();  
        binTree.createBinTree();  
        // nodeList中第0个索引处的值即为根节点  
        Node root = nodeList.get(0);  
        
        //插入节点
        insert(10, root);
        insert(11, root);
        insert(12, root);
        
        deleteByCopying(6,root);
        
        System.out.println("先序遍历：");  
        preOrderTraversal(root);  
        System.out.println();  
  
        System.out.println("中序遍历：");  
        inOrderTraversal(root);  
        System.out.println();  
  
        System.out.println("后序遍历：");  
        postOrderTraversal(root);  
        System.out.println();  
        
        deleteByMerging(5, root);
        
        System.out.println("Morris中序遍历： ");
        MorrisInorder(root);
      

    }  
}


