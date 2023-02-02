import java.util.Comparator;
import java.util.PriorityQueue;

public class FillCups {
    public static void main(String[] args) {
      int[] arr = {0,2,2};
        System.out.println(fillCups(arr));
    }

    public static  int fillCups(int[] amount) {
        PriorityQueue<Integer> store = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : amount) {
            if (i != 0) {
                store.add(i);
            }
        }
        int seconds = 0;
        while(!store.isEmpty()){
            int size = store.size();
            if(size == 1) return seconds + store.peek();
            int first = store.remove();
            int second = store.remove();
            if(first-1>0) store.add(first-1);
            if(second-1>0) store.add(second-1);
            seconds++;
        }


        return seconds;

    }
}
