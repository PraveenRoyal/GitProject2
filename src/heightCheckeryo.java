import java.util.Arrays;

public class heightCheckeryo {

    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 4;
        nums[3] = 2;
        nums[4] = 1;
        nums[5] = 3;
        int a = heightmama(nums);
        System.out.println(a);
    }

    public static int heightmama(int [] heights) {
        int[] newnums  = Arrays.copyOf(heights,heights.length);
        Arrays.sort(newnums);
            int counter = 0;
            for(int i = 0; i <heights.length; i++) {
                if(heights[i] != newnums[i]) {
                counter++;
            }
        }
        return counter;

    }
}
