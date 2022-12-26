public class pivotIndex {

    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        int num = pivotIndexP(nums);
        System.out.println(num);
    }

    public static int pivotIndexP(int[] nums) {
        for(int i = 0; i<nums.length;i++) {
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0; j< i ; j++) {
                sum1 = sum1 + nums[j];
            }
            for(int m = i+1; m < nums.length;m++) {
                sum2 = sum2 + nums[m];
            }
            if(sum1 == sum2) {
                return i;
            }
        }

        return -1;
    }
}
