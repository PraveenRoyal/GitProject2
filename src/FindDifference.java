import java.util.*;

public class FindDifference {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,4,6};
        System.out.println(findDifference(arr1,arr2));

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        Set<Integer> arr1 = new HashSet<>();
        for(int i:nums1){
            arr1.add(i);
        }
        Set<Integer> arr2 = new HashSet<>();
        for(int j: nums2){
            arr2.add(j);
        }
        Set<Integer> arr3 = new HashSet<>(arr1);
        arr1.removeAll(arr2);
        ArrayList<Integer> store = new ArrayList<>(arr1);
        arr2.removeAll(arr3);
        ArrayList<Integer> store2 = new ArrayList<>(arr2);
        ArrayList<List<Integer>> res = new ArrayList<>();
        res.add(store);
        res.add(store2);
        return res;
    }
}
