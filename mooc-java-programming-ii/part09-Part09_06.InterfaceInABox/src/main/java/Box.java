import java.util.ArrayList;

public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> listOfItems;

    public Box(double capacity) {
        this.capacity = capacity;
        this.listOfItems = new ArrayList<>();
    }

    public void add(Packable item) {
        if (!(this.capacity - item.weight() <= 0)) {
            this.listOfItems.add(item);
            this.capacity -= item.weight();
        }
    }
    public double weight() {
        double totalWeight = 0.0;

        for (Packable packable : listOfItems) {
            totalWeight += packable.weight();
        }
        return totalWeight;
    }
    @Override
    public String toString() {
        return "Box: " + this.listOfItems.size() + " items, total weight " + this.weight() + " kg"; 
    }

    
}
