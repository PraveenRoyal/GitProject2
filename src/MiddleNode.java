import java.util.ArrayList;

public class MiddleNode {
    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head){
        ListNode iterate = head;
        ArrayList<Integer> store = new ArrayList<>();
        while(iterate!=null){
            store.add(iterate.val);
            iterate=iterate.next;
        }
        int sz = store.size();
        int mid = sz/2;

        ListNode res = new ListNode(-1);
        ListNode temp = res;
        for(int i = mid; i<store.size();i++){
            temp.next = new ListNode(store.get(i));
            temp = temp.next;
        }
        return res.next;
    }
}
