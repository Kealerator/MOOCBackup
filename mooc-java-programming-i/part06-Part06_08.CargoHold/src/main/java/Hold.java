import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int totalWeight = 0;

    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold (int  maxWeight){
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        
        if (!(this.totalWeight + suitcase.totalWeight() > this.maxWeight)) {
            this.totalWeight += suitcase.totalWeight();
            suitcases.add(suitcase);
        }
    }

    public void printItems(){

        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString(){

        return suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }
}
