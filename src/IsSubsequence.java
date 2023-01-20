import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));

        Map<Integer,Integer> store = new HashMap<>();
        store.put(1,100);
        store.put(2,200);
        System.out.println(store.containsKey(3));
    }

    public static boolean isSubsequence(String s, String t){
        if(Objects.equals(s, "")){
            return true;
        }
        Map<Character,Integer> store = new HashMap<>();
        for(int i = 0; i<t.length();i++){
            store.put(t.charAt(i),i);
        }
        for(int i = 1; i<s.length();i++){
            if(store.containsKey(s.charAt(i))){
                if(store.get(s.charAt(i-1))>store.get(s.charAt(i))){
                    return false;
                }
            } else{
                return false;
            }
        }

        return true;
    }
}
