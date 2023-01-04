import java.util.ArrayList;
import java.util.Arrays;

public class CircleQuestion {

    public static void main(String[] args) {
        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};
        int[] res = countPoints(points,queries);
        System.out.println(Arrays.toString(res));
    }

    public static int[] countPoints(int[][] points, int[][] queries){
        ArrayList<Integer> res = new ArrayList<>();
        for (int[] query : queries) {
            int xj = query[0];
            int yj = query[1];
            int rj = query[2];
            int count = 0;
            for (int[] point : points) {
                int xi = point[0];
                int yi = point[1];
                if (Math.sqrt((xi - xj) * (xi-xj) + (yi - yj)*(yi-yj)) <= rj) {
                    count++;
                }
            }
            res.add(count);
        }
        int[] result = new int[res.size()];
        for(int i = 0; i<res.size();i++){
            result[i] = res.get(i);
        }


        return result;
    }
}
