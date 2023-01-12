public class minTimeToVisistAllPoints {
    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        int c = Math.abs(b-a);
        System.out.println(c);
    }

    public static int minTime(int[][] points){
        int time = 0;
        for(int i = 0; i<points.length-1;i++){
            int a = Math.abs(points[i][0]- points[i+1][0]);
            int b = Math.abs(points[i][1]-points[i+1][1]);

            time = time + Math.max(a,b);
        }
        return time;
    }
}
