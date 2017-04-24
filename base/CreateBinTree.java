package base;

import java.util.LinkedList;
import java.util.List;

public class CreateBinTree {
	private int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };  
    private static List<Node> nodeList = null;  
  
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
    private static class Node {  
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
}
