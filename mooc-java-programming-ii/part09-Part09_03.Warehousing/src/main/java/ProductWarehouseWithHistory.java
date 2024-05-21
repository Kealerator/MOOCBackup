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

}
