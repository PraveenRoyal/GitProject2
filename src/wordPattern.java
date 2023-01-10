import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class wordPattern {
    public static void main(String[] args) {

    }

    public boolean WordPattern(String pattern, String s){
        String[] a1 = pattern.split("");
        String[] a2 = s.split(" ");
        if(a1.length!=a2.length)return false;
        Map<String, String> hello = new HashMap<>();
        for(int i = 0; i<a1.length;i++){
            if(hello.containsValue(a2[i]) || hello.containsKey(a1[i])){
                if(!Objects.equals(hello.get(a1[i]),a2[i])) return false;
            } else{
                hello.put(a1[i],a2[i]);
            }
        }


        return true;
    }
}
