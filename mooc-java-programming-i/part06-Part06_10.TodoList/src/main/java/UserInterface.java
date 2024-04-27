import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }

    public void start(){

        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            } else {
                commandProcess(input);
                continue;
            }
        }
    }

    public void commandProcess(String command){
        if (command.equals("add")) {
            System.out.print("To add: ");
            String input = scanner.nextLine();
            list.add(input);
        }
        if (command.equals("list")) {
            list.print();
        }
        if (command.equals("remove")) {
            System.out.print("Which one is removed? ");
            int input = Integer.valueOf(scanner.nextLine());
            list.remove(input);
        }
    }
}
