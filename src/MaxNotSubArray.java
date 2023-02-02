public class MaxNotSubArray {
    public static void main(String[] args) {
    int[] arr = {-2,-1};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int [] nums){
        if(nums.length==1) return nums[0];
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            for(int j = nums.length-1;j>=i;j--){
                int sum2 = 0;
                for(int k = i; k<=j;k++){
                    sum2+= nums[k];
                }
                if(sum2 > sum){
                    sum = sum2;
                }
            }
        }
        return sum;
    }
}
