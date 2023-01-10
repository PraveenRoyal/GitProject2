import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s){
        StringBuilder finale;
        int length = 0;
        char prev = Character.MIN_VALUE;
        for(int i = 0; i<s.length();i++){
            finale = new StringBuilder();
            char initial = s.charAt(i);
            finale.append(initial);
            for(int j = i+1;j<s.length();j++){
                char check = s.charAt(j);
                if(initial == check || prev == check){
                    break;
                }
                finale.append(check);
                prev = check;
            }
            if(finale.length()>length){
                length = finale.length();

            }

        }
        return length;
    }


    public static int lengthOf(String s){
        Set<Character> store;
        int length = 0;
        for(int i = 0; i<s.length();i++){
            store = new HashSet<>();
            store.add(s.charAt(i));
            for(int j = i+1; j<s.length();j++){
                if(store.contains(s.charAt(j))){
                    break;
                }
                store.add(s.charAt(j));
            }
            if(store.size()>length){
                length = store.size();
            }
        }
        return length;
    }
}
