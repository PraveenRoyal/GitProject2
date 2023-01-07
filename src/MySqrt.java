public class MySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x){
        int ans = 0;
        int[] arr = new int[x];
        for(int i = 0; i<arr.length;i++){
            arr[i] = i*i;
        }
        for(int i = 1; i<arr.length;i++){
            if(x >= arr[i]+x%arr[i]){
                ans = i;
            }
        }
        return ans;
    }
}
