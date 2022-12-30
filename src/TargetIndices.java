import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    public static void main(String[] args) {

    }

    public List<Integer> targetIndices(int[] num, int target) {
        Arrays.sort(num);
        ArrayList<Integer> arr =new ArrayList<>();
        for(int i = 0; i< num.length;i++) {
            if(target == num[i]) {
                arr.add(i);
            }
        }
        return arr;
    }
}
