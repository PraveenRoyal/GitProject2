import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a1 = new HashSet<>();
        for(int i : nums1) {
            a1.add(i);
        }
        HashSet<Integer> b1 = new HashSet<>();
        for(int i : nums2) {
            b1.add(i);
        }
        a1.retainAll(b1);
        int[] res = new int[a1.size()];
        int a = 0;
        for(int i : a1) {
            res[a++] = i;
        }
        return res;
    }
}
