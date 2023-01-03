public class Shuffle {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indi = {4,5,6,7,0,2,1,3};
        s = restoreString(s,indi);
        System.out.println(s);
    }

    public static String restoreString(String s, int[] indices){
        StringBuilder ans = new StringBuilder(s);
     for(int  i = 0; i<s.length();i++) {
         char c = s.charAt(i);
         ans.setCharAt(indices[i],c);
     }
     return ans.toString();
    }
}
