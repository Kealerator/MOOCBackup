import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> listOfItems;    
    public MisplacingBox() {
        super();
        this.listOfItems = new ArrayList<>();
    }

    @Override
    public void add(Item item){
        this.listOfItems.add(item);
        this.listOfItems.clear();

    }

    @Override
    public boolean isInBox(Item item){
       for (Item itemProcessed : listOfItems) {
            if (itemProcessed.equals(item)) {
               return true; 
            }
       } 
       return false;
    }
}
