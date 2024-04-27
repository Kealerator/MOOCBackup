
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        Scanner scan = new Scanner(System.in);
        TodoList lista = new TodoList();
        UserInterface UI = new UserInterface(lista, scan);

        UI.start();
    }
}
