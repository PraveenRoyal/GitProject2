public class SwapNodes {
    public static void main(String[] args) {

    }
    public static ListNode swapPairs(ListNode head){
       ListNode ans = new ListNode(0);
       ans.next = head;
       ListNode p = ans;
       ListNode c = head;
       while(c!=null){
           ListNode cn = c.next;
           if(cn==null){
               break;
           }
           c.next = cn.next;
           cn.next = p.next;
           p.next = cn;
           p = c;
           c = c.next;
       }
       return ans.next;

    }
}
