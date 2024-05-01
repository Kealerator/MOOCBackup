import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> IOU;

    public IOU() {
        this.IOU = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        // saves the amount owed and the person owed to to the IOU

        this.IOU.put(toWhom, amount);

    }

    public double howMuchDoIOweTo(String toWhom) {
        // returns the amount owed to the person whose name is given as a parameter. If
        // the person

        return this.IOU.getOrDefault(toWhom, 0.0);
    }
}
