import java.util.HashMap;
import java.util.Map;

public class MinimumRounds {
    public static void main(String[] args) {
        int[] a = {2,2,3,3,2,4,4,4,4,4};
        minimumRounds(a);
    }

    public static int minimumRounds(int[] tasks){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        System.out.println(map);
        int count = 0;
        boolean flag = false;

        for (int i : map.values()) {
            if (i == 1) {
                return -1;
            }
            if(i%3==0){
                count = count + i/3;
            } else{
                count = count + i/3 +1;
            }
        }
        return count;
    }
}
