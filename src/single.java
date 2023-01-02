import java.util.HashMap;
import java.util.Map;

public class single {

    public static void main(String[] args) {
        int[] res = {5,7,9,9,5};
        int a = SingleNumber(res);
        System.out.println(a);
    }

    public static int SingleNumber(int[] nums) {
        Map<Integer,Integer> res = new HashMap<>();
        for(int i = 0; i<nums.length;i++) {
            res.put(nums[i], res.getOrDefault(nums[i],0)+1);
        }
        for(int i : res.keySet()) {
            if(res.get(i) == 1){
                return i;
            }
        }
        return 0;

        }

}
