import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s){
        String finale;
        int length = 0;
        for(int i = 0; i<s.length();i++){

                finale = s.substring(i);
                if(Check(finale)){
                    if(finale.length()>length){
                        length = finale.length();
                    }
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
    public static boolean Check(String s ){
        Set<Character> checker = new HashSet<>();
        for(int i = 0; i<s.length();i++){
            checker.add(s.charAt(i));
        }
        return s.length()==checker.size();
    }
}
