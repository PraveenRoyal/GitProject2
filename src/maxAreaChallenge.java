public class maxAreaChallenge {
    public static void main(String[] args) {
        int [] num = {0,0,1,5,6,7,9};
        int ans = maxArea(num);
        System.out.println(ans);
    }

    public static int maxArea(int[] height) {
        int area = Integer.MIN_VALUE;
        for(int i = 0; i<height.length;i++) {
            for(int j = i; j<height.length;j++){
                int count  = j-i;
                int h = Math.min(height[i], height[j]);
                if(h*count > area){
                    area = h*count;
                }
            }
        }
        return area;

    }

}
