import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> store = new HashSet<>();
       for(int i : nums){
           store.add(i);
       }
       return !(nums.length==store.size());
    }
}
