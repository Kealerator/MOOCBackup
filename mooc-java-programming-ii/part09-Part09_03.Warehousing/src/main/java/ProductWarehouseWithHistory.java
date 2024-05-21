public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory historyLog;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);

        this.historyLog = new ChangeHistory();
        super.addToWarehouse(initialBalance); 
        this.historyLog.add(initialBalance);
        
    }

    public String history(){
        return String.valueOf(historyLog);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.historyLog.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount){
        this.historyLog.add(this.getBalance() - amount);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.historyLog);
        System.out.println("Largest amount of product: " + this.historyLog.maxValue());
        System.out.println("Smallest amount of product: " + this.historyLog.minValue());
        System.out.println("Average: " + this.historyLog.average());
    }

}
