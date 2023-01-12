import java.util.Arrays;
import java.util.Collections;

public class RemoveElement {
    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val){
       Integer[]res= new Integer[nums.length];
        for(int i = 0;i<res.length;i++){
            res[i]=nums[i];
        }
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            if(res[i] == val){
                res[i]=-1;
                count++;
            }
        }
        Arrays.sort(res, Collections.reverseOrder());
        for(int i = 0;i<nums.length;i++){
            nums[i]=res[i];
        }

        return nums.length-count;

    }
}
