public class GoalParser {
    public static void main(String[] args) {
        String a = "G()()()()(al)";
        a = interpret(a);
        System.out.println(a);
    }

    public static String interpret(String command) {


        return command.replace("()","o").replace("(al)","al");
    }
}
