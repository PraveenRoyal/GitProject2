import java.util.*;

public class Hard3Sum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            int a = nums[i];
            for(int j = i+1; j<nums.length;j++){
                int b = nums[j];
                for(int  k = j+1;k<nums.length;k++){
                    int c = nums[k];
                    if(a+b+c == 0 && i!=j && j!=k && k!=i){
                        List<Integer> add = new ArrayList<>(3);
                        add.add(a);
                        add.add(b);
                        add.add(c);
                        res.add(add);
                    }
                }
            }

        }
        return  new ArrayList<>(res);
    }
}
