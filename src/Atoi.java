public class Atoi {
    public static void main(String[] args) {
        char a = '-';
        char b = '0';
        System.out.println(a-b);
    }

    public static int myAtoi(String s){
        s = s.trim();
        if(s.length()==0)return 0;
        char ch ;
        boolean isNegative =(ch = s.charAt(0))=='-';
        int index = 0;
        if(isNegative || ch == '+'){
            index++;
        }
        final int maxLimit = Integer.MAX_VALUE / 10;
        int result = 0;
        while(index < s.length() && isInteger(ch = s.charAt(index))){

            int digit = ch - '0';

            if(result > maxLimit || (result == maxLimit && digit > 7)){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = (result * 10) + digit;

            ++index;
        }

        return isNegative ? -result : result;

    }
    public static boolean isInteger(char c){
        return c >= '0' && c <= '9';
    }
}
