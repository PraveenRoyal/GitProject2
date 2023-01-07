public class MixDistance {
    public static void main(String[] args) {
        int[] colors = {1,8,3,8,3};
        System.out.println(maxDistance(colors));
    }

    public static int maxDistance(int[] colors){
        int distance= 0;
        for(int i = 0; i<colors.length;i++){
            int comp = colors[i];
            for(int j = i+1;j<colors.length;j++){
                if(comp!=colors[j]){
                    int ab = Math.abs(i-j);
                    if(ab > distance){
                        distance = ab;
                    }
                }
            }
        }
        return distance;
    }
}
