import java.util.Arrays;

public class Triplets {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9};
        int num = arithmeticTriplets(nums,2);
        System.out.println(num);
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for(int i = 0; i<nums.length;i++) {
            int a = nums[i] + diff;
            if(Arrays.binarySearch(nums,a)>= 0) {
                a = a + diff;
                if(Arrays.binarySearch(nums,a) >= 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
