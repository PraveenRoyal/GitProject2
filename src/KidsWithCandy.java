import java.util.ArrayList;
import java.util.List;

public class KidsWithCandy {

    public static void main(String[] args) {
        int [] a = {2,3,5,1,3};
        int extra = 3;
        List<Boolean> dis = kidsWithCandies(a,extra);
        System.out.println(dis);


    }

    public static List<Boolean> kidsWithCandies(int [] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>(candies.length);
        int [] newCandies = candies.clone();
        for(int a : candies) {
            int x = a + extraCandies;
            int count = 0;
            for(int i = 0;i < candies.length;i++) {
                if(x >= candies[i]) {
                    count ++;
                }
            }
            if(count >= candies.length) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
