import java.util.ArrayList;

public class newJewels {

    public static void main(String[] args) {
    String jewels = "z";
    String stones = "ZZ";
    int yo = numJewelsInStones(jewels,stones);
        System.out.println(yo);
    }

    public static int numJewelsInStones(String jewels, String stones) {

        char[] a = new char[jewels.length()];
        for(int i = 0; i<a.length;i++) {
            a[i] = jewels.charAt(i);
        }
        char [] b = new char[stones.length()];
        for(int i = 0; i<b.length;i++) {
            b[i] = stones.charAt(i);
        }

        ArrayList<Character> hello = new ArrayList<>();
        for (char c : a) {
            hello.add(c);
        }
        ArrayList<Character> hello2 = new ArrayList<>();
        for(char c: b) {
            hello2.add(c);
        }
        hello2.retainAll(hello);

        return hello2.size();
    }
}
