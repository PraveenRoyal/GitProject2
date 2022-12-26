import java.util.Arrays;

public class mostWordsFound {

    public static void main(String[] args) {

    }
    public static int mostWords(String[] sentences) {
        int [] max = new int[sentences.length];
        for(int i = 0; i< sentences.length;i++) {
            String[] string =sentences[i].split(" ");
            int count = 0;
            for(String a : string) {
                count++;
            }
            max[i] = count;
        }
        Arrays.sort(max);
        return max[sentences.length-1];
    }
}
