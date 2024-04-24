
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        birdDatabase birds = new birdDatabase(scan);

        while (true) {
            System.out.print("? ");

            String command = scan.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                break;
            } else if (command.equalsIgnoreCase("add")) {
                birds.add();
            } else if (command.equalsIgnoreCase("observation")) {
                birds.addObservation();
            } else if (command.equalsIgnoreCase("all")) {
                System.out.println(birds);
            } else if (command.equalsIgnoreCase("one")) {
                birds.printOne();
            }
        }

    }

}
