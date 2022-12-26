public class numIdenticalPairs {

    public static void main(String[] args) {

        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 1;

        int yo = numIdentical(nums);
        System.out.println(yo);


    }

    public static int numIdentical(int[] nums) {
        int counter = 0;
        for(int i = 0; i< nums.length ; i++) {
            for(int j = i+1; j < nums.length; j ++) {
                if(nums[i] == nums[j] && i < j) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
