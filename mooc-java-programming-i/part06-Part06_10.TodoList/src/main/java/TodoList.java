import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList(){
        todoList = new ArrayList<>();
    }

    public void add(String task){
        todoList.add(task);
    }

    public void print(){
        for (String taskString : todoList) {
            System.out.println((todoList.indexOf(taskString) + 1) + ": " + taskString);
        }
    }

    public void remove (int number){
        todoList.remove(number - 1);
    }

/*
 * 


    public void remove(int number) - removes the task associated with the given number; the number is the one seen associated with the task in the print.

 */
}
