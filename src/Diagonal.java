public class Diagonal {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = diagonalSum(mat);
        System.out.println(sum);
    }
    public static int diagonalSum(int[][] mat){
        int m = mat.length;
        int sum = 0;

        for(int i = 0 ; i<m;i++){
          sum = sum + mat[i][i];
        }
        for(int  i = m-1;i>=0;i--){
           sum = sum + mat[m-i-1][i];
        }
        if(m%2!=0){
            int mid = m/2+m%2;
            sum = sum - mat[mid-1][mid-1];
        }
        return sum;
    }
}
