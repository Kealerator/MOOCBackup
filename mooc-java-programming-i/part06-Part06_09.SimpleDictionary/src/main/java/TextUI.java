import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start(){
        while (true) {
            System.out.print("Command: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }
            processCommand(userInput);
        }

        System.out.println("Bye bye!");
    }

    public void processCommand(String commandInput){
        if (commandInput.equals("add")) {
            this.add();
        }
        else if (commandInput.equals("search")) {
            this.search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add(){
            System.out.print("Word: ");
            String word = scanner.nextLine();

            System.out.print("Translation: ");
            String translation = scanner.nextLine();

            simpleDictionary.add(word, translation);
    }

    public void search() {
            System.out.print("To be translated: ");
            String userInput = scanner.nextLine();

            if (simpleDictionary.translate(userInput) == null) {
                System.out.println("Word " + userInput + " was not found");
            }else {
                System.out.println("Translation: " + simpleDictionary.translate(userInput));
            }           
    }

}
