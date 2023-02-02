import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] a = {2,7,4,1,8,1};
        PriorityQueue<Integer> ba = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : a){
            ba.add(i);
        }
        System.out.println(ba);
        System.out.println(lastStoneWeight(a));

    }

    public static int  lastStoneWeight(int[] stones){
        PriorityQueue<Integer> store = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : stones){
            store.add(i);
        }

        while(store.size()>1){
            int a = store.remove();
            int b = store.remove();
            store.add(a-b);
        }
        return store.remove();
    }
}
