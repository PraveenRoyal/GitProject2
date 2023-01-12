import java.util.ArrayList;
import java.util.List;

public class CountSmaller {
    public static void main(String[] args) {

    }

    public List<Integer> countSmaller(int[] nums){
        List<Integer> store = new ArrayList<>();
        for(int i = 0; i< nums.length;i++){
            int num = nums[i];
            int count = 0;
            for(int j = i+1; j<nums.length;j++){
                if(num>nums[j]){
                    count++;
                }
            }
            store.add(count);
        }
        return store;
    }


}
