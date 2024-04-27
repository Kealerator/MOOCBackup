
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100 ");
            System.out.println("Second: " + secondContainer + "/100 ");

            String input = scan.nextLine();
            System.out.println();
            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            String command = pieces[0];
            int amount = Integer.valueOf(pieces[1]);

            if (amount < 0) {
                amount = 0;
            }

            if (command.equals("add")) {
                    firstContainer += amount;
                if (firstContainer > 100) {
                    firstContainer = 100;
                }
                
            }
            
            if (command.equals("move")) {
                if (amount > firstContainer) {
                    amount = firstContainer;
                }
                firstContainer -= amount;
                secondContainer += amount;

                if (secondContainer > 100) {
                    secondContainer = 100;
                }
            }

            if (command.equals("remove")) {
                if (amount > secondContainer) {
                    amount = secondContainer;
                }
                secondContainer -= amount;
            }

        }
    }
}
