import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> listOfItems;

    public BoxWithMaxWeight(int capacity) {
        super();
        this.listOfItems = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item item){
        
        if (!(this.capacity - item.getWeight() < 0)) {
           this.listOfItems.add(item);
           this.capacity -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {

       for (Item targetItem : listOfItems) {

            if (targetItem.equals(item)) {
                return true;
            }
       }

       return false;
    }
    
}
