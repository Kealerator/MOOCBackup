import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> VehicleRegistry = new HashMap<>();

    public VehicleRegistry() {
    }

    public boolean add(LicensePlate licensePlate, String ownerName) {
        /*
         * assigns the owner it received as a parameter to a car that corresponds to the
         * license plate received as a parameter.
         * 
         * If the license plate doesn't have an owner, the method returns true.
         * 
         * If the license already has an owner attached, the method returns false and
         * does nothing.
         */
        String existingOwner = VehicleRegistry.get(licensePlate);

        if (existingOwner == null) {
            this.VehicleRegistry.put(licensePlate, ownerName);
            return true;
        } else if (existingOwner != null) {
            
        }
        

    }

}
