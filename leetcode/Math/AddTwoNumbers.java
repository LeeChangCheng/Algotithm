package leetcode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        int carry=0;    
        ListNode res=new ListNode(-1);
        ListNode rp=res;
        //int carry=0;
        //处理长度相同部分
        //先把结果保存给carry
        //创建新结点时应同时赋值
        while(l1!=null||l2!=null){
            if(l1!=null){
                carry+=l1.val;
                l1=l1.next;
            }    
            if(l2!=null){
                carry+=l2.val;
                l2=l2.next;
            }    
            rp.next=new ListNode(carry%10);
            carry=carry/10;//这步很6啊，以后carry可以这么用！
            rp=rp.next;
        }
         if(carry == 1)
             res.next=new ListNode(1);
         return res.next;//如果return res; 返回的第一个值将会是-1，这里从第二个值开始返回。
     

    }
}    
