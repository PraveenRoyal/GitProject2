import java.util.Arrays;

public class maxIceCream {
    public static void main(String[] args) {

    }

    public static int maxIce(int[] costs, int coins){
        Arrays.sort(costs);
        int count = 0;
        while( count < costs.length && costs[count] <= coins ){
            coins = coins-costs[count];
            count = count+1;
        }

        return count;
    }
}
