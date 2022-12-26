import java.util.Arrays;

public class minimumOperations {

    public static void main(String[] args) {
        int[] nums = {5,3,2,1};
        int b = minimum(nums);
        System.out.println(b);
    }

    public static int minimum(int[] nums) {
        int [] a = new int[nums.length];
        boolean flag = false;
        int count = 0;
        while(!flag) {
            for(int i = 0; i<nums.length;i++) {
                a[i] = nums[i];

            }
            Arrays.sort(a);
            int num = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] > 0) {
                    num = a[j];
                    break;
                }
            }
            for(int m = 0; m<a.length;m++) {
                if(nums[m] > 0) {
                    nums[m] = nums[m] -num;
                    a[m] = a[m] - num;
                    if(nums[m] < 0) {
                        nums[m] = 0;
                        a[m] = 0;
                    }
                }
            }
            int[] b = new int[a.length];
            if(Arrays.equals(b,nums) ) {
                flag = true;
            }
            count++;

        }
        return count;
    }
}
