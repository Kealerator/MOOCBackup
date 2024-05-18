
public class Main {

    public static void main(String[] args) {
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);

        ChangeHistory testLog = new ChangeHistory();
        testLog.add(1.5);
        testLog.add(2.7);
        testLog.add(3.7);
        testLog.add(7.3);
        testLog.add(4.7);

        System.out.println(testLog);
        System.out.println("Max value: " + testLog.maxValue());
        System.out.println("Min value: " + testLog.minValue());
        System.out.println("Avg value: " + testLog.average());
        
        testLog.clear();
        
        System.out.println(testLog);
        System.out.println("Max value: " + testLog.maxValue());
        System.out.println("Min value: " + testLog.minValue());
        System.out.println("Avg value: " + testLog.average());    
    }

}
