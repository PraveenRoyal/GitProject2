import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args) {

    }

    public static int maximumGap(int[] nums){
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        int diff = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length-1;i++){
            int a = nums[i+1] - nums[i];
            if(a > diff){
                diff = a;
            }
        }
        return diff;
    }
}
