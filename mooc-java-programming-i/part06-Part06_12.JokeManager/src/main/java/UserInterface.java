import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private JokeManager jokeList;

    public UserInterface (JokeManager jokeList, Scanner scan) {
        this.scan = scan;
        this.jokeList = jokeList;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke \n2 - draw a joke \n3 - list jokes \nX - stop");

            String userInput = scan.nextLine();

            if (userInput.equals("X") || userInput.equals("x")) {
                break;
            } else {
                this.commandProcessor(Integer.valueOf(userInput));   
            }
            
        }
    }

    public void commandProcessor(int cmd) {
        if (cmd == 1) { //Add a joke
            System.out.println("Write the joke to be added:");
            String userInput = scan.nextLine();
            this.jokeList.addJoke(userInput);
        } else if (cmd == 2) { //Draw a joke
            System.out.println(this.jokeList.drawJoke());
        } else if (cmd == 3) { // Print all jokes
            System.out.println("Printing the jokes.");
            this.jokeList.printJokes();
        } else {
            System.out.println("Invalid command.");
        }
    }
}

/*

 * 
 * In addition, the class should have the method public void start()
 * that can be used to start the user interface.
 * 
 * The user interface should provide the user with the following commands:
 * 
 * X - ending: exits the method start.
 * 1 - adding: asks the user for the joke to be added to the joke manager, and
 * then adds it.
 * 2 - drawing: chooses a random joke from the joke manager and prints it. If
 * there are no jokes in the manager, thi string "Jokes are in short supply."
 * will be printed.
 * 
 * 3 - printing: prints all the jokes stored in the joke manager.
 * 
 */