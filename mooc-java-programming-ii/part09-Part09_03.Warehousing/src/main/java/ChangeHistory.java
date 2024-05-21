import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> historyLog;   

    public ChangeHistory() {
        this.historyLog = new ArrayList<>();
    }

    public void add(double status) {
        // adds provided status as the latest amount to remember in the change history.

        this.historyLog.add(status);        

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

        double max = 0;

        for (Double logEntry : historyLog) {
            if (max < logEntry) {
                max = logEntry;
            }
        }

        return max;
    }

    public double minValue() {
        // returns the smallest value in the change history. If the history is empty,
        // the method should return zero.

        if (historyLog.isEmpty()) {
            return 0;
        }

        double min = this.maxValue();

        for (Double logEntry : historyLog) {
            if (min > logEntry) {
                min = logEntry;
            }
        }

        return min;

    }

    public double average() {
        // returns the average of the values in the change history. If the history is
        // empty, the method should return zero.

        if (historyLog.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (Double logEntry : historyLog) {
            sum += logEntry;
        }

        return sum / historyLog.size();
    }

    @Override
    public String toString() {
        // returns the string representation of the change history. The string
        // representation provided by the ArrayList class is sufficient.

        return String.valueOf(this.historyLog);
    }
}
