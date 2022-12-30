import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
         int [] num = {3,1,2,4};
         int[] a = sortArrayByParity(num);
        System.out.println(Arrays.toString(a));
    }

    public static int[] sortArrayByParity(int[] num){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0; i<num.length;i++){
            if(num[i]%2 == 0) {
                even.add(num[i]);
            } else {
                odd.add(num[i]);
            }
        }
        even.addAll(odd);
        int[] res = new int[even.size()];
        for(int i = 0; i <res.length;i++) {
            res[i] = even.get(i);
        }

        return res;
    }
}
