public class ApplyOperations {
    public static void main(String[] args) {

    }

    public int[] applyOperations(int[] nums){
        for(int i = 0; i< nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = 2*nums[i];
                nums[i+1] = 0;
            }
        }
        int[] res = new int[nums.length];
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            res[count++] = num;
        }
        return res;
    }
}
