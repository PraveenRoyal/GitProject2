public class MyPower {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n >>> 1);
    }
    public static double myPow(double x, int n){
        if(n==0) return 1.00;
        double mul = 1;
        for(int i = 0; i<n;i++){
            mul = mul * x;
        }
        return n > 0 ? mul : 1/mul;
    }
}
