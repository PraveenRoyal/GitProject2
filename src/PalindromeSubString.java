public class PalindromeSubString {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ziioz"));

    }

    public static boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder(s);
        res.reverse();
        return res.toString().equals(s);
    }

    public static String longestPalindrome(String s){
        StringBuilder create = new StringBuilder(s);
        int check = 0;
        String result = "";
        for(int i = 0 ; i<=create.length();i++){
            for(int j = i+1; j<=create.length();j++){
                String comp = create.substring(i,j);
                if(comp.length()>check && isPalindrome(comp)){
                    check = comp.length();
                    result = comp;
                }
            }
        }

        return result;
    }


}
