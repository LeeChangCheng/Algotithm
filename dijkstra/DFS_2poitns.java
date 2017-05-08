package dijkstra;

import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.Stack;  
	  
/* ��ʾһ���ڵ��Լ�������ڵ����������нڵ� */  
class Node  {   
    public String name = null;  
    public ArrayList<Node> relationNodes = new ArrayList<Node>();  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public ArrayList<Node> getRelationNodes() {  
        return relationNodes;  
    }  
  
    public void setRelationNodes(ArrayList<Node> relationNodes) {  
        this.relationNodes = relationNodes;  
    }  
}  

public class DFS_2poitns {
	    /* ��ʱ����·���ڵ��ջ */  
	    public static Stack<Node> stack = new Stack<Node>();  
	    /* �洢·���ļ��� */  
	    public static ArrayList<Object[]> sers = new ArrayList<Object[]>();  
	  
	    /* �жϽڵ��Ƿ���ջ�� */  
	    public static boolean isNodeInStack(Node node)  
	    {  
	        Iterator<Node> it = stack.iterator();  
	        while (it.hasNext()) {  
	            Node node1 = (Node) it.next();  
	            if (node == node1)  
	                return true;  
	        }  
	        return false;  
	    }  
	  
	    /* ��ʱջ�еĽڵ����һ������·����ת������ӡ��� */  
	    public static void showAndSavePath()  
	    {  
	        Object[] o = stack.toArray();  
	        for (int i = 0; i < o.length; i++) {  
	            Node nNode = (Node) o[i];  
	              
	            if(i < (o.length - 1))  
	                System.out.print(nNode.getName() + "->");  
	            else  
	                System.out.print(nNode.getName());  
	        }  
	        sers.add(o); /* ת�� */  
	        System.out.println("\n");  
	    }  
	  
	    /* 
	     * Ѱ��·���ķ���  
	     * cNode: ��ǰ����ʼ�ڵ�currentNode 
	     * pNode: ��ǰ��ʼ�ڵ����һ�ڵ�previousNode 
	     * sNode: �������ʼ�ڵ�startNode 
	     * eNode: �յ�endNode 
	     */  
	    public static boolean getPaths(Node cNode, Node pNode, Node sNode, Node eNode) {  
	        Node nNode = null;  
	        /* ������������ж�˵�����ֻ�·��������˳�Ÿ�·������Ѱ·������false */  
	        if (cNode != null && pNode != null && cNode == pNode)  
	            return false;  
	  
	        if (cNode != null) {  
	            int i = 0;  
	            /* ��ʼ�ڵ���ջ */  
	            stack.push(cNode);  
	            /* �������ʼ�ڵ�����յ㣬˵���ҵ�һ��·�� */  
	            if (cNode == eNode)  
	            {  
	                /* ת������ӡ�����·��������true */  
	                showAndSavePath();  
	                return true;  
	            }  
	            /* �������,����Ѱ· */  
	            else  
	            {  
	                /*  
	                 * ���뵱ǰ��ʼ�ڵ�cNode�����ӹ�ϵ�Ľڵ㼯�а�˳������õ�һ���ڵ� 
	                 * ��Ϊ��һ�εݹ�Ѱ·ʱ����ʼ�ڵ�  
	                 */  
	                nNode = cNode.getRelationNodes().get(i);  
	                while (nNode != null) {  
	                    /* 
	                     * ���nNode���������ʼ�ڵ����nNode����cNode����һ�ڵ����nNode�Ѿ���ջ�� ��  
	                     * ˵��������· ��Ӧ�������뵱ǰ��ʼ�ڵ������ӹ�ϵ�Ľڵ㼯��Ѱ��nNode 
	                     */  
	                    if (pNode != null  
	                            && (nNode == sNode || nNode == pNode || isNodeInStack(nNode))) {  
	                        i++;  
	                        if (i >= cNode.getRelationNodes().size())  
	                            nNode = null;  
	                        else  
	                            nNode = cNode.getRelationNodes().get(i);  
	                        continue;  
	                    }  
	                    /* ��nNodeΪ�µ���ʼ�ڵ㣬��ǰ��ʼ�ڵ�cNodeΪ��һ�ڵ㣬�ݹ����Ѱ·���� */  
	                    if (getPaths(nNode, cNode, sNode, eNode))/* �ݹ���� */  
	                    {  
	                        /* ����ҵ�һ��·�����򵯳�ջ���ڵ� */  
	                        stack.pop();  
	                    }  
	                    /* ��������cNode�����ӹ�ϵ�Ľڵ㼯�в���nNode */  
	                    i++;  
	                    if (i >= cNode.getRelationNodes().size())  
	                        nNode = null;  
	                    else  
	                        nNode = cNode.getRelationNodes().get(i);  
	                }  
	                /*  
	                 * ��������������cNode�����ӹ�ϵ�Ľڵ�� 
	                 * ˵������cNodeΪ��ʼ�ڵ㵽�յ��·���Ѿ�ȫ���ҵ�  
	                 */  
	                stack.pop();  
	                return false;  
	            }  
	        } else  
	            return false;  
	    }  
	  
	    public static void main(String[] args) {  
	        /* ����ڵ��ϵ */  
	        int nodeRalation[][] =  
	        {  
	            {1},      //0  
	            {0,5,2,3},//1  
	            {1,4},    //2  
	            {1,4},    //3  
	            {2,3,5},  //4  
	            {1,4}     //5  
	        };  
	          
	        /* ����ڵ����� */  
	        Node[] node = new Node[nodeRalation.length];  
	          
	        for(int i=0;i<nodeRalation.length;i++)  
	        {  
	            node[i] = new Node();  
	            node[i].setName("node" + i);  
	        }  
	          
	        /* ������ڵ�������Ľڵ㼯�� */  
	        for(int i=0;i<nodeRalation.length;i++)  
	        {  
	            ArrayList<Node> List = new ArrayList<Node>();  
	              
	            for(int j=0;j<nodeRalation[i].length;j++)  
	            {  
	                List.add(node[nodeRalation[i][j]]);  
	            }  
	            node[i].setRelationNodes(List);  
	            List = null;  //�ͷ��ڴ�  
	        }  
	  
	        /* ��ʼ��������·�� */  
	        getPaths(node[0], null, node[0], node[4]);  
	    }  
	}  
}
