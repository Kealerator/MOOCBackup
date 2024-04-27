import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stackList;


    public Stack() {
        this.stackList = new ArrayList<>();
    }

    public void add(String value){
        stackList.add(value);
    }

    public String take(){
        return this.stackList.remove(stackList.size() - 1);
    }

    public boolean isEmpty(){
        return this.values().isEmpty();
    }

    public ArrayList<String> values(){

        return this.stackList;
    }

    
}
