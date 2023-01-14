import java.util.Arrays;

public class findMedian {
    public static void main(String[] args) {

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] mergedArray = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        if (mergedArray.length - nums1.length >= 0)
            System.arraycopy(nums2, 0, mergedArray, nums1.length, mergedArray.length - nums1.length);
        Arrays.sort(mergedArray);
        double median = 0;
        if(mergedArray.length%2==0){
            int a = mergedArray[mergedArray.length/2-1];
            int b = mergedArray[mergedArray.length/2 ];
            median = (double) (a+b)/2;
        } else{
            median = mergedArray[mergedArray.length/2];
        }

        return median;
    }
}
