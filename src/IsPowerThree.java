public class IsPowerThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }

    public static boolean isPowerOfThree(int n){
        if(n<=1){
            return n == 1;
        }
        return n%3==0 && isPowerOfThree(n/3);
    }
}
