import java.util.Arrays;

public class maximumWealth {

    public static void main(String[] args) {

    }

    public static int maximum(int[][] accounts) {
        int[] max = new int[accounts.length];
        for(int i = 0; i< accounts.length;i++) {
            int sum = 0;
            for(int j = 0;j < accounts[i].length;j++) {
                sum = sum + accounts[i][j];
            }
            max[i] = sum;
        }
        Arrays.sort(max);
        return max[accounts.length-1];
    }
}
