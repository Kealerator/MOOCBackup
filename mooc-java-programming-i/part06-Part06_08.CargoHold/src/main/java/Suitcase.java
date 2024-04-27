import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    private int totalWeight = 0;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
        if (!(this.totalWeight + item.getWeight() > maxWeight)) {
            this.totalWeight += item.getWeight();
            items.add(item);
        }
    }

    public void printItems(){

        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight(){
        return totalWeight;
    }

    public Item heaviestItem(){
        Item heaviestReturn = new Item("heaviest ", 0);

        if (items.isEmpty()) {
            return null;
        }

        for (Item item : items) {
            if (item.getWeight() > heaviestReturn.getWeight()) {
                heaviestReturn = item;
            }
        }

        return heaviestReturn;
    }

    @Override
    public String toString() {
        if (items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight + " kg)";
        }
        if (items.size() == 0) {
            return "no items (" + this.totalWeight + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight + " kg)";
    }
}
