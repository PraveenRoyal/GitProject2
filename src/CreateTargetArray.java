import java.util.ArrayList;

public class CreateTargetArray {

    public static void main(String[] args) {

    }

    public static int[] createTargetArray(int[] num, int[] index) {
        int[] res = new int[num.length];
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0;i<num.length;i++) {
            a.add(index[i],num[i]);
        }
        for(int i = 0; i<res.length;i++) {
            res[i] = a.get(i);
        }
        return res;
    }
}
