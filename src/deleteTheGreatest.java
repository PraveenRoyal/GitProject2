import java.util.Arrays;

public class deleteTheGreatest {

    public static void main(String[] args) {
       int[][] a = {{1,2,4},{3,3,1}};
       int b = deleteGreatestValue(a);
        System.out.println(b);
    }

    public static int deleteGreatestValue(int [][] grid) {
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }
        int sum = 0;
        for(int i = grid[0].length-1;i>=0;i--) {
            int max = 0;
            for(int j = grid.length-1;j>=0;j--) {
                if(grid[j][i] > max) {
                    max = grid[j][i];
                }
            }
            sum = sum +max;
        }



        return sum;
    }
}
