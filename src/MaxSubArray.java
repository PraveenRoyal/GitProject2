import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,-1};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums){
        if(nums.length==1)return nums[0];
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            for(int j =nums.length;j>=i+1;j--){
                int[] arr = Arrays.copyOfRange(nums,i,j);
                int subSum = sumOfArray(arr);
                if(subSum>sum){
                    sum = subSum;
                }
            }
        }
        return sum;
    }

    public static int sumOfArray(int[] nums){
        int sum = 0;
        for(int i : nums){
            sum = sum +i;
        }
        return sum;
    }

}
