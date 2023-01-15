public class isPowerOfTwo {

    public static void main(String[] args){
        System.out.println(IsPowerOfTwo(18));
    }
    public static boolean IsPowerOfTwo(int n){
        if(n<=1){
            return n==1;
        }
        return n%4==0 && IsPowerOfTwo(n/4);
    }
}
