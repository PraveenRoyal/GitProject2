import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        if(arr.size()==0){
            return prev;
        }
        prev = new ListNode(arr.get(arr.size()-1));
        for(int i = arr.size()-2;i>=0;i--){
            prev = new ListNode(arr.get(i),prev);
        }
        return prev;
    }
}
