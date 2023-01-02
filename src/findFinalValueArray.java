public class findFinalValueArray {

    public static void main(String[] args) {
        int[] num = {5,3,6,1,12};
        int b = findFinalValue(num,3);
        System.out.println(b);
    }

    public static int findFinalValue(int[] num, int original) {
        for(int i : num){
            if(i == original){
                original = original*2;
            }
        }
        return original;
    }
}
