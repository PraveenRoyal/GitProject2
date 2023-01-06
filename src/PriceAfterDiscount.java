import java.util.Arrays;

public class PriceAfterDiscount {
    public static void main(String[] args) {
    int[] prices = {1,2,3,4,5};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }
    public static int[] finalPrices(int[] prices){
        for(int i = 0; i<prices.length-1;i++){
            int total = prices[i];
            int discount = 0;
            for(int j = i+1;j<prices.length;j++){
                if(prices[j] <= prices[i]){
                    discount = prices[j];
                    break;
                }
            }
            prices[i] = total -discount;
        }
        return prices;
    }
}
