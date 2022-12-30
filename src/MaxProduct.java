public class MaxProduct {
    public static void main(String[] args) {
        int[] a= {3,4,5,2};
        int yo = maxProduct(a) ;
        System.out.println(yo);
    }
    public static int maxProduct(int[] num) {
        int mu = -1;
        for(int i = 0; i< num.length;i++){
            for(int j = 0;j<num.length;j++) {
                if(i==j) {
                    continue;
                }
                int temp = (num[i]-1) * (num[j]-1);
                if(mu < temp) {
                    mu = temp;
                }
            }
        }
        return mu;
    }
}
