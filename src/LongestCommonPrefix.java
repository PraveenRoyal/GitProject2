import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] res = {"flower","flow","flight"};
        Set<Character> yo = new HashSet<>();
        for(char c = 'a';c<'z';c++){
            yo.add(c);
        }
        for (String re : res) {
            Set<Character> check = new HashSet<>();
            for (char e : re.toCharArray()) {
                check.add(e);
            }
            yo.retainAll(check);
        }

        System.out.println(yo);
    }

    public static String longestCommonPrefix(String[] strs){
        Set<Character> checker = new TreeSet<>();
        for(char c = 'a';c<'z';c++){
            checker.add(c);
        }
        for (String str : strs) {
            Set<Character> store = new TreeSet<>();
            for (char e : str.toCharArray()) {
                store.add(e);
            }
            checker.retainAll(store);
        }
        String result = "";
        StringBuilder res = new StringBuilder();
        for(char e : checker){
            res.append(e);
            for(String s : strs){
                int i = 0;
                if(res.toString().indexOf(s) >0){
                    if(res.length()>i){
                        i = res.length();
                        result = res.toString();
                    }
                }
            }
        }

        return  result;
    }
}
