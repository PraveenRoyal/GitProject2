import java.util.Arrays;

public class SumOfUniqueElements {

    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        if(nums.length!=1){
            if(nums[0] != nums[1]){
                sum = sum +nums[0];
            }
        }
        for(int i = 1; i<nums.length-1;i++){
            if(nums[i] != nums[i+1]&& nums[i-1]!=nums[i]){
               sum = sum +nums[i];
            }
        }
        if(nums.length>2) {
            if (nums[nums.length - 1] != nums[nums.length - 2]) {
                sum = sum + nums[nums.length - 1];
            }
        }
        return sum;
    }
}
