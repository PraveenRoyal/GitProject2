import java.util.Arrays;

public class SortPeople {

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] height = {180,165,170};
        String[] b = sortPeople(names,height);
        System.out.println(Arrays.toString(b));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i = 0; i< heights.length-1;i++) {
                if (heights[i + 1] > heights[i]) {
                    int temp = heights[i];
                    heights[i] = heights[i+1];
                    heights[i+1] = temp;

                    String tem = names[i];
                    names[i] = names[i+1];
                    names[i+1] = tem;

                    flag = true;
                }
            }
        }
        return names;
    }
}
