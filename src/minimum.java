import java.util.Arrays;

public class minimum {

    public static void main(String[] args) {
        int b = 4009;
        System.out.println(minimumSum(b));
    }

    public static int minimumSum(int num){
        String a = String.valueOf(num);
        String [] b = a.split("");
        int[] x = new int[b.length];
        for(int i = 0; i<b.length;i++) {
            x[i] = Integer.parseInt(b[i]);
        }
        Arrays.sort(x);
        return((x[0]*10)+(x[1]*10)+(x[2]+x[3]));
    }
}
