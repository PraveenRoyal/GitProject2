public class sumZero {
    public static void main(String[] args) {

    }

    public static int[] SumZero(int n){
        int[] arr =new int[n];
        for(int i= 1; i<n;i=i+2){
            arr[i]=i;
            arr[i-1]=-i;
        }
        return arr;
    }
}
