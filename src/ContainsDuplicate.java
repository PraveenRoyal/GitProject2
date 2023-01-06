public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums){
        int a = 0;
        for (int j : nums) {
            for (int num : nums) {
                if (j == num) {
                    a++;
                }
            }
        }
        return a == nums.length;
    }
}
