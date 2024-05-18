import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> historyLog;
    private double maxValue = 0.0;
    private double minValue = 0.0;
    private double sumValue = 0.0;

    public ChangeHistory() {
        this.historyLog = new ArrayList<>();
    }

    public void add(double status) {
        // adds provided status as the latest amount to remember in the change history.

        if (this.historyLog.size() == 0) {

            this.maxValue = status;
            this.minValue = status;

        } else if (status > this.maxValue) {
            this.maxValue = status;
        } else if (status < this.minValue) {
            this.minValue = status;
        }

        this.historyLog.add(status);

        sumValue += status;

    }

    public void clear() {
        // empties the history
        this.historyLog.clear();
    }

    public double maxValue() {
        // returns the largest value in the change history. If the history is empty, the
        // method should return zero.

        if (historyLog.isEmpty()) {
            return 0;
        }

        return this.maxValue;
    }

    public double minValue() {
        // returns the smallest value in the change history. If the history is empty,
        // the method should return zero.

        if (historyLog.isEmpty()) {
            return 0;
        }

        return this.minValue;

    }

    public double average() {
        // returns the average of the values in the change history. If the history is
        // empty, the method should return zero.

        if (historyLog.isEmpty()) {
            return 0;
        }

        return this.sumValue / historyLog.size();
    }

    public String toString() {
        // returns the string representation of the change history. The string
        // representation provided by the ArrayList class is sufficient.

        return String.valueOf(this.historyLog);
    }
}
