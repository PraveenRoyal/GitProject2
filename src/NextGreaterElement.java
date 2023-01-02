import java.util.Arrays;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] res = nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] res = new int[nums1.length];
        for(int i = 0; i<nums1.length;i++) {
            int a = nums1[i];
            for(int j = 0; j<nums2.length;j++) {
                int b = nums2[j];
                if(a == b){
                    for(int m = j;m<nums2.length;m++) {
                        if(nums2[m] > b){
                            res[i] = nums2[m];
                            break;
                        } else {
                            res[i] = -1;
                        }
                    }
                }
            }
        }
        return res;
    }
}
