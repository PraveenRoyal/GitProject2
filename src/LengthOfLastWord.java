public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s){
        s = s.trim();
        int count = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            } else{
                break;
            }
        }
        return count;
    }
}
