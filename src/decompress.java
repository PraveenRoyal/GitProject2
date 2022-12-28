import java.util.ArrayList;
import java.util.Arrays;

public class decompress {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int[] a = decompressRLEList(nums);
        System.out.println(Arrays.toString(a));
    }

    public static int[] decompressRLEList(int[] numbers) {
        int length = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i< numbers.length;i=i+2) {
            int a = numbers[i];
            length = length + numbers[i];


               for(int  m = 0; m< a;m++){
                   res.add(numbers[i+1]);
               }

        }

        int [] newArr = new int [length];
        for(int i = 0; i< newArr.length;i++) {
            newArr[i] = res.get(i);
        }

        return newArr;

    }
}
