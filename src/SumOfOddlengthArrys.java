import java.util.Arrays;

public class SumOfOddlengthArrys {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
    int s = sumOddLengthSubArrays(arr);
        System.out.println(s);
    }

    public static int sumOddLengthSubArrays(int[] arr){
        int i = 0;
        int sum = 0;
        int j = arr.length-1;
        while(i < arr.length){
            int sum2 = 0;
            if((j-i) % 2 != 0){
                int[] arr2 = Arrays.copyOfRange(arr,i,j);
                sum2 = sumOfArray(arr2);
            }
            j--;
            i++;
            sum+= sum2;
        }

        return sum;
    }


    private static int sumOfArray(int[] arr){
        int sum = 0;
        for(int n : arr){
            sum = sum +n;
        }
        return sum;
    }
}
