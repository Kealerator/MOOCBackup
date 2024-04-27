
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {

            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();
            System.out.println();

            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            String command = pieces[0];
            int amount = Integer.valueOf(pieces[1]);

            if (command.equals("add")) {
                container1.add(amount);
            }

            if (command.equals("move")) {
                if (amount > container1.contains()) {
                    amount = container1.contains();
                }

                container1.remove(amount);
                container2.add(amount);
            }

            if (command.equals("remove")) {
                container2.remove(amount);
            }

        }
    }

}
