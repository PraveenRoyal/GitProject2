import java.util.Arrays;

public class smallerNumbers {
    public static void main(String[] args) {

    }

    public int[] smallerNumbersThanCurrent(int [] nums ) {
        int [] arr = new int[nums.length];
        int[] array = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int count =0;
        for(int i = 0; i< nums.length;i++) {
            for(int j = 0; j<nums.length;j++) {
                count++;
                if(nums[i] == arr[j]) {
                    break;
                }

            }
            array[i] = count;
        }
        return array;
    }
}
