import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4,five);
        ListNode three = new ListNode(3,four);
        ListNode two = new ListNode(2,three);
        ListNode one = new ListNode(1,two);

        ListNode store = one;
        LinkedList<Integer> adder = new LinkedList<>();
        while(store!=null){
            adder.add(store.val);
            store = store.next;
        }
        System.out.println(adder);
        adder.remove(3);
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        for(int i : adder){
            res.next = new ListNode(i);
            res = res.next;
        }
        ListNode result = temp.next;
        while(result!= null){
            System.out.println(result.val);
            result = result.next;
        }

    }
}
