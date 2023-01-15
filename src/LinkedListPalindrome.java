import java.util.ArrayList;

public class LinkedListPalindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head){
        ListNode res = head;
        ListNode temp = res;
        ArrayList<Integer> result = new ArrayList<>();
        while(temp!=null){
            result.add(temp.val);
            temp = temp.next;
        }
        int n = result.size();
        if(n%2!=0){
            return false;
        }
        int i = 0;
        int j = n-1;
        while(i<j){
            if(result.get(i)!=result.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return  true;
    }
}
