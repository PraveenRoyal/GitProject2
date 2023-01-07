import java.util.Arrays;

public class Rearrange {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums){
        int[] pos = new int[nums.length/2];
        int posCount = 0;
        int[] neg = new int[nums.length/2];
        int negCount = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] >0){
                pos[posCount++] = nums[i];
            } else{
                neg[negCount++] = nums[i];
            }
        }
        for(int i = 0;i<nums.length;i=i+2){
            nums[i] = pos[i/2];
        }
        for(int i= 1;i<nums.length;i=i+2){
            nums[i] = neg[i/2];
        }
        return nums;
    }
}
