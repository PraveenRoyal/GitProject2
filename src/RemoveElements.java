public class RemoveElements {
    public static void main(String[] args) {
        
    }

    public static ListNode removeElements(ListNode head, int val){
        ListNode temp = head;
        ListNode res = temp;
        while(temp != null){
            if(temp.val==val && temp.next!=null){
                temp.next = temp.next.next;
            } else{
                temp = temp.next;
            }
        }

        return res;
    }
}
