import java.util.Arrays;

public class maxProductDiff {

    public static void main(String[] args) {

    }

    public static int maxProductDifference(int [] nums) {
        Arrays.sort(nums);

        return (nums[nums.length-1]* nums[nums.length-2] - nums[0] * nums[1]);
    }
}
