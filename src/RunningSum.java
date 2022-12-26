import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int [] nums = new int [4];
        for(int i = 0; i <4;i++) {
            nums[i] = i+1;
        }
        System.out.println(Arrays.toString(nums));
       int[] yo = runningSum(nums);
        System.out.println(Arrays.toString(yo));
    }
    public static int[] runningSum(int[] nums) {
        int [] nums2 = new int[nums.length];
        for(int i = 0; i<nums.length;i++) {
            int temp = 0;
            for(int j = 0; j <= i;j++) {
                temp = nums[j] + temp;
            }
            nums2[i] = temp;
        }
        return nums2;
    }
}
