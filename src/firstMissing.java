import java.util.ArrayList;

public class firstMissing {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums){
        ArrayList<Integer> store = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            store.add(i+1);
        }
        int ans = 1;
        for(int i = 0; i<nums.length;i++){
            if(!store.contains(nums[i])){
                ans = i+1;
                break;
            }
        }
        return ans;
    }
}
