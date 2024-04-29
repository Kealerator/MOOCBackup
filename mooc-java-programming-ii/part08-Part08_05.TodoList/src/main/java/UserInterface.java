import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scan) {
        this.scan = scan;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");

            String input = scan.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {

                System.out.print("Task: ");
                input = scan.nextLine();
                this.list.add(input);

            } else if (input.equals("list")) {

                this.list.print();

            } else if (input.equals("remove")) {

                System.out.print("Which task was completed? ");
                input = scan.nextLine();
                this.list.remove(Integer.valueOf(input));

            }
        }
    }
}
