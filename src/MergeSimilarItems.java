import java.util.*;

public class MergeSimilarItems {
    public static void main(String[] args) {
        int[][]items1 = {{1,1},{4,5},{3,8}};
        int[][]items2 = {{3,1},{1,5}};
        mergeSimilarItems(items1,items2);
    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][]items2){
        Map<Integer,Integer> store = new HashMap<>();
        for(int[] i :items1){
            store.put(i[0],i[1]);
        }
        for(int[] i : items2){
            store.put(i[0],store.getOrDefault(i[0],0)+i[1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> ans = new TreeSet<>(store.keySet());
        for(int i : ans){
            List<Integer> add = new ArrayList<>();
            add.add(i);
            add.add(store.get(i));
            res.add(add);
        }


        return res;
    }
}
