import java.util.ArrayList;

public class PartitionOfLinkedList {
    public static void main(String[] args) {

    }

    public ListNode partition(ListNode head, int x){
        ArrayList<Integer>left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ListNode store = head;
        while(store!=null){
            if(store.val<x){
                left.add(store.val);
            }else {
                right.add(store.val);
            }
            store =store.next;
        }
        ListNode res = new ListNode();
        ListNode result = res;
        for(int i : left){
            res.next = new ListNode(i);
            res = res.next;
        }
        for(int i : right){
            res.next = new ListNode(i);
            res = res.next;
        }
        return result;
    }
}
