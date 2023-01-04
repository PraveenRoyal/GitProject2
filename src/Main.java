import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            double max = 0;
            double min = 0;

            while (true) {

                try {
                    System.out.println("Please enter Number to run, or character to quit");

                    double number = Double.parseDouble(scanner.nextLine());
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }

                } catch (NumberFormatException nfe) {
                    break;
                }
            }

            System.out.println("max = " + max);
            System.out.println("min = " + min);

        }

}