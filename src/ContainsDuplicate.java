public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums){
        int a = 0;
        for(int i = 0; i<nums.length;i++){
            for(int j = 0; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    a++;
                }
            }
        }
        if(a == nums.length){
            return true;
        }
        return false;
    }
}
