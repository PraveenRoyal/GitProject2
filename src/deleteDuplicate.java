import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deleteDuplicate {
    public static void main(String[] args) {

    }

    public ListNode DeleteDuplicate(ListNode head){
        ListNode store = head;
        List<Integer> res = new ArrayList<>();
        while(store!=null){
            if(!res.contains(store.val)){
                res.add(store.val);
            }

            store = store.next;
        }
        Collections.sort(res);
        ListNode result = new ListNode(0);
        ListNode ans = result;
        for(int i : res){
            result.next = new ListNode(i);
            result = result.next;
        }
        return ans.next;

    }
}
