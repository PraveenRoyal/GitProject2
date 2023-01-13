public class MaximumUnits {
    public static void main(String[] args) {

    }

    public static int maximumUnits(int[][] boxTypes, int truckSize){
        int[] arr = new int[boxTypes.length];
        for(int i = 0; i<boxTypes.length;i++){
            arr[i] = boxTypes[i][1];
        }
        int[] arr2 = new int[boxTypes.length];
        for(int i = 0; i< boxTypes.length;i++){
          arr2[i] = boxTypes[i][0];
        }
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i<arr.length-1;i++){
                if (arr[i] > arr[i+1]){
                    flag = true;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    int temp2 = arr2[i];
                    arr2[i] = arr2[i+1];
                    arr2[i+1] = temp2;
                }
            }
        }
        int j = truckSize;
        int count = 0;
        for(int i = arr.length-1; i>=0 && j>=0 ;i--){
            int maxi = Math.min(arr2[i],j);
            count = count + (maxi *arr[i]);
            j = j -maxi;
        }



        return count;
    }
}
