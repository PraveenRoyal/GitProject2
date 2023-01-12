public class CountGoodTriplets {
    public static void main(String[] args) {

    }

    public static int countTriplets(int[] arr, int a, int b, int c){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int compA = arr[i];
            for(int j = i+1;j<arr.length;j++){
                int compB = arr[j];
                for(int k = j+1;k<arr.length;k++){
                    int compC = arr[k];
                    if(Math.abs(compA-compB) <=a && Math.abs(compB-compC) <= b && Math.abs(compC-compA) <= c){
                       count++;
                    }
                }
            }
        }

        return count;
    }
}
