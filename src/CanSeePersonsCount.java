public class CanSeePersonsCount {
    public static void main(String[] args) {

    }

    public int[] canSeePersonsCount(int[] heights){
        int[]res = new int[heights.length];
        for(int i = 0; i<res.length;i++){
            int a = heights[i];
            int count = 0;
            for(int j = i+1;j<res.length-1;j++){
                int b = heights[j];
                int c =Integer.min(a,b);
                int ct = 0;
                for(int m = i+1;m<j-1;m++){
                    if(c>heights[m])ct++;
                }
                if(ct==j-i-1){
                    count=ct;
                }

            }
            res[i]=count;
        }
        return res;
    }
}
