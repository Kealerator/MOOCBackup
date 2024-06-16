import java.util.ArrayList;

public class OneItemBox extends Box {

    private int maxCapacity;
    private ArrayList<Item> listOfItems;

    public OneItemBox() {
        this.listOfItems = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.listOfItems.size() == 0) {

            this.listOfItems.add(item);
            this.maxCapacity = item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item itemProcessed : listOfItems) {
            if (itemProcessed.equals(item)) {
                return true;
            }
        }
        return false;
    }
}