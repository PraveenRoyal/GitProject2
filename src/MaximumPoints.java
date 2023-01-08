import java.util.HashMap;
import java.util.Map;

public class MaximumPoints {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(maxPoints(points));
    }
    public static int maxPoints(int[][] points){
        int count = 0;
        for(int i = 0; i<points.length;i++){
            Map<Double,Integer> checker = new HashMap<>();
            for(int j = i+1;j<points.length;j++){
                double slope = CalculateSlope(points[i],points[j]);
                checker.put(slope,checker.getOrDefault(slope,1)+1);
            }

            for(int key : checker.values()){
                if(key > count){
                    count = key;
                }
            }
        }

        return count;
    }

    public static double CalculateSlope(int[] arr1,int[] arr2){
        int x1 = arr1[0],x2 = arr2[0],y1=arr1[1],y2=arr2[1];
        if(x1==x2) return Double.MAX_VALUE;
        if(y1==y2) return 0;
        return (double)(arr2[1]-arr1[1])/(arr2[0]-arr1[0]);
    }

}
