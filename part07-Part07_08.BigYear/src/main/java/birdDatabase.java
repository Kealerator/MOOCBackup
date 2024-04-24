import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class birdDatabase {

    ArrayList<bird> birdList;
    Scanner scanner;

    public birdDatabase(Scanner scan) {
        this.birdList = new ArrayList<>();
        this.scanner = scan;
    }

    public void add() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();

        bird birdObj = new bird(name, latinName);

        this.birdList.add(birdObj);
        Collections.reverse(this.birdList);
    }

    public void addObservation() {
        System.out.print("Bird? ");
        String input = scanner.nextLine();

        if (!searchNameFromList(input)) {
            System.out.println("Not a bird!");
        }
    }

    private boolean searchNameFromList(String input) {
        for (bird birdObj : birdList) {
            if (birdObj.getName().equals(input)) {
                birdObj.observed();
                return true;
            }
        }

        return false;
    }

    public void printOne() {
        System.out.print("Bird? ");

        String input = scanner.nextLine();

        for (bird birdObj : birdList) {
            if (birdObj.getName().equals(input)) {
                System.out.println(birdObj);
            }
        }
    }

    @Override
    public String toString() {
        String results = "";

        for (bird birdObj : birdList) {
            results += birdObj.toString() + "\n";
        }

        return results;
    }

}
