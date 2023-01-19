public class BitWise {
    public static void main(String[] args) {
        String s = "sad";
        String b = "butsad";
        System.out.println(b.indexOf(s));

    }

    public int divide(int dividend, int divisor){
        boolean isNegative = false;
        if((dividend > 0 && divisor < 0) || (dividend<0 && divisor >0)){
            isNegative = true;
        }
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);
        int ans = 0;
        while(absDividend >= absDivisor){
            int temp = absDivisor;
            int quotient = 1;
            while(temp<=absDividend){
                temp = temp<<1;
                quotient = quotient<<1;
            }
            ans = ans + quotient>>1;
            absDividend = absDividend-temp>>1;
        }
        if(isNegative){
            return ~ans+1;
        }else {
            return ans;
        }

    }
}
