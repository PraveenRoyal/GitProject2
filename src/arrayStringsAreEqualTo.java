public class arrayStringsAreEqualTo {

    public static void main(String[] args) {

    }

    public static boolean arrayStringsAreEqual(String[] word1, String [] word2) {
        StringBuilder wordP = new StringBuilder();
        for (String s : word1) {
            wordP.append(s);
        }

        StringBuilder wordQ = new StringBuilder();
        for (String s : word2) {
            wordQ.append(s);
        }

        return (wordP.toString().equals(wordQ.toString()));
    }
}
