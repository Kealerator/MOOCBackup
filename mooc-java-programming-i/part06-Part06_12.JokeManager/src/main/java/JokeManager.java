import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokesList;

    public JokeManager() {
        jokesList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokesList.add(joke);
    }

    public String drawJoke() {

        Random rand = new Random();

        if (jokesList.isEmpty()) {
            return "Jokes are in short supply.";
        }

        int index = rand.nextInt(jokesList.size());
        return jokesList.get(index);
    }

    public void printJokes() {
        for (String joke : jokesList) {
            System.out.println(joke);
        }
    }
}