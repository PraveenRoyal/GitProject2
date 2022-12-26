public class findValueAfterOperations {
    public static void main(String[] args) {

    }
    public int findValue(String[] operations) {
        int X = 0;
        for(String x : operations) {
            switch (x) {
                case "--X" -> --X;
                case "X++" -> X++;
                case "++X" -> ++X;
                case "X--" -> X--;
                default -> {
                }
            }
        }
        return X;
    }
}
