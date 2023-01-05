import java.util.Arrays;

public class prefixXOR {
    public static void main(String[] args) {
      int[] pref = {5,2,0,3,1};
      int[] res = findArray(pref);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findArray(int[] pref) {
        int[] res = new int[pref.length];
        res[0] = pref[0];
        for(int i = 1; i<pref.length;i++) {
            res[i] = pref[i-1] ^ pref[i];
        }
        return res;
    }
}
