import java.util.*;

public class FindSubString {
    public static void main(String[] args) {
        String[] arr = {"bar","foo","the"};
        Set<String> store = new HashSet<>();
        for(int i = 0; i<arr.length;i++){
            StringBuilder a = new StringBuilder(arr[i]);
            for(int j = 0; j<arr.length;j++){
                String c = arr[j];
                if(i==j){
                    continue;
                }
                a.append(c);
            }
            store.add(a.toString());
        }
        for(int i = 0; i<arr.length;i++) {
            StringBuilder a = new StringBuilder(arr[i]);
            for (int j = arr.length-1; j >= 0; j--) {
                String c = arr[j];
                if (i == j) {
                    continue;
                }
                a.append(c);
            }
            store.add(a.toString());
        }
        System.out.println(store);
        String s = "barfoofoobarthefoobarman";
        Iterator<String> iterator = store.iterator();
        List<Integer> res = new ArrayList<>();
        while(iterator.hasNext()){
            int c = s.indexOf(String.valueOf(iterator.next()));
            if(c > 0) {
                res.add(c);
            }
        }
        System.out.println(res);

    }

    public List<Integer> findSubString(String s, String[] words){
        Set<String> store = new HashSet<>();
        for(int i = 0; i<words.length;i++){
            StringBuilder a = new StringBuilder(words[i]);
            for(int j = 0; j<words.length;j++){
                String c = words[j];
                if(i==j){
                    continue;
                }
                a.append(c);
            }
            store.add(a.toString());
        }
        for(int i = 0; i<words.length;i++) {
            StringBuilder a = new StringBuilder(words[i]);
            for (int j = words.length-1; j >= 0; j--) {
                String c = words[j];
                if (i == j) {
                    continue;
                }
                a.append(c);
            }
            store.add(a.toString());
        }
        Iterator<String> iterator = store.iterator();
        List<Integer> res = new ArrayList<>();
        while(iterator.hasNext()){
            int c = s.indexOf(String.valueOf(iterator.next()));
            if(c >= 0) {
                res.add(c);
            }
        }
        return res;
    }
}
