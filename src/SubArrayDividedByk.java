import java.util.Arrays;

public class SubArrayDividedByk {
    public static void main(String[] args) {
        int[] nums = {5};
        int[] a = Arrays.copyOfRange(nums,0,9);
        System.out.println(Arrays.toString(a));
        System.out.println(sumOfArray(nums));
        System.out.println(subArrayDividedByK(nums,5));
    }

    public static int subArrayDividedByK(int[] nums ,int k){
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            for(int j = nums.length;j> i;j--){
                int[] a = Arrays.copyOfRange(nums,i,j);
                int sum = sumOfArray(a);
                if(sum % k == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumOfArray(int[] nums){
        int sum = 0;
        for(int i : nums){
            sum = sum + i;
        }
        return sum;
    }
}
