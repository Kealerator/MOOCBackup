import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String input) {
        this.list.add(input);
    }

    public void remove(int number) {
        number -= 1;

        this.list.remove(number);
    }

    public void print() {

        for (int i = 0; i < this.list.size(); i++) {

            System.out.println((i + 1) + ": " + this.list.get(i));

        }
    }

}
