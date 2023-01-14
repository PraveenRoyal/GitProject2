import java.util.LinkedList;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        LinkedList<Integer> store = new LinkedList<>();
        store.add(1);
        store.add(7);
        store.add(9);
        store.add(16);
        store.add(37);
        System.out.println(store);
        store.remove(store.size()-2);
        System.out.println(store);
    }

    public ListNode removeNthNodeFromEnd(ListNode head, int n){
        ListNode start = head;
        LinkedList<Integer> store = new LinkedList<>();
        while(start!= null){
            store.add(start.val);
            start = start.next;
        }
        store.remove(store.size()-n);
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        for(int i : store){
            res.next = new ListNode(i);
            res = res.next;
        }

        return temp.next;
    }
}
