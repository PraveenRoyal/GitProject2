public class ContainsNearbyAlmostDuplicate {
    public static void main(String[] args) {

    }

    public boolean containsNearByAlmostDuplicate(int[] nums, int indexDiff, int valueDiff){
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int comp = Math.abs(nums[i]-nums[j]);
                if(comp <= valueDiff && j-i <=indexDiff){
                    return true;
                }
            }
        }
        return false;
    }
}
