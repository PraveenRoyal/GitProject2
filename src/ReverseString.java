import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] a = {'h','e','l','l','o'};
        reverseString(a);
        System.out.println(Arrays.toString(a));
    }
    public static void  reverseString(char[] s){
        int a = s.length;
        int n = a / 2;
        for(int i = 0; i<n ; i++){
            a = a -1;
            char temp = s[i];
            s[i] = s[a];
            s[a] = temp;
        }
    }
}
