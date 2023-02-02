import java.util.*;

public class FindRelativeRanks {
    public static void main(String[] args) {
       int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(arr)));

    }

    public static String[] findRelativeRanks(int[] score){
        PriorityQueue<Integer> store =new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : score){
            store.add(i);
        }
        Map<Integer, Integer> res = new HashMap<>();
        for(int i = 0; i<score.length;i++){
            res.put(score[i],i);
        }
        String[] result = new String[score.length];
        for(int i = 0; i<score.length;i++)
        {
            int a = store.remove();
            if(i == 0){
                result[res.get(a)] = "Gold Medal";
            } else if(i == 1){
                result[res.get(a)] = "Silver Medal";
            } else if(i == 2){
                result[res.get(a)] = "Bronze Medal";
            }else{
                result[res.get(a)] = "" + (i+1);
            }
        }
        return result;
    }
}
