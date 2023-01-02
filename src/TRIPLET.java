public class TRIPLET {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1};
        int a = unEqualTriplets(nums);
        System.out.println(a);
    }

    public static int unEqualTriplets(int[] num) {
        int count  = 0;
        for(int i = 0; i<num.length;i++) {
            int a = num[i];
            for(int j = i+1;j<num.length;j++){
                int b = num[j];
                for(int k = j; k<num.length;k++) {
                    int c = num[k];
                    if(a!=b && b!=c && a!=c){
                        count = count+1;
                    }
                }
            }
        }
        return count;
    }
}
