import java.util.Scanner;

public class UserInterface {

    private Scanner scan;

    private Container first;
    private Container second;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        first = new Container();
        second = new Container();
    }

    public void start() {

        while (true) {

            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            int amount = Integer.valueOf(pieces[1]);

            if (pieces[0].equals("add") && amount >= 0) {
                first.add(amount);
            }

            if (pieces[0].equals("move") && amount >= 0) {
                if (amount > first.contains()) {
                    amount = first.contains();
                }
                second.add(amount);
                first.remove(amount);

                if (second.contains() > 100) {
                    second.setLiquidContained(100);
                }
            }

            if (pieces[0].equals("remove") && amount >= 0) {
                second.remove(amount);
            }
        }
    }
}
