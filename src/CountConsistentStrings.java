public class CountConsistentStrings {
    public static void main(String[] args) {
        String s = "ab";
        String m = "aaaab";
        int st = m.indexOf("d");
        System.out.println(st);
    }

    public static int countConsistentStrings(String allowed, String[] words){
        int count = 0;
        for(String a : words){
            int ct = 0;
            for(int i = 0; i<a.length();i++){
                if(allowed.indexOf(a.charAt(i))>=0){
                    ct++;
                }
            }
            if(ct==a.length()){
                count++;
            }
        }
        return count;
    }
}
