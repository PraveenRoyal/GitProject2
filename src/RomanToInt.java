import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {

    }

    public int romanToInt(String s){
        if(s.length()==0)return 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;
        int prev = 0;
        for(int i = s.length()-1; i>=0;i--){
            char c = s.charAt(i);
            if(prev > map.get(c)){
                sum = sum - map.get(c);
            } else{
                sum = sum + map.get(c);
            }
            prev = map.get(c);
        }
        return sum;
    }
}
