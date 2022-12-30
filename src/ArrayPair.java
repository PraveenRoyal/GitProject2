import java.util.Arrays;

public class ArrayPair {

    public static void main(String[] args) {
        int [] a = {6,2,6,5,1,2};
        int b = arrayPairSum(a);
        System.out.println(b);
    }

    public static int arrayPairSum(int[] num) {
        int sum = 0;
        Arrays.sort(num);
        for(int i = 0; i< num.length;i = i+2) {
            sum = sum + num[i];
        }

        return sum;
    }
}
