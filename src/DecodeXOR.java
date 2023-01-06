import java.util.Arrays;

public class DecodeXOR {

    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int[] sum = decode(encoded,1);
        System.out.println(Arrays.toString(sum));
    }

    public static int[] decode(int[] encoded, int first){
        int[] res = new int[encoded.length+1];
        res[0] = first;
        for(int i = 1; i<res.length;i++){
            res[i] = encoded[i-1];
        }
        for(int i = 1; i<res.length;i++){
            res[i] = res[i] ^res[i-1];
        }
        return res;
    }
}
