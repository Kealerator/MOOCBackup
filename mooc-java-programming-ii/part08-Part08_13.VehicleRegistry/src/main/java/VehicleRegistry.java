import java.util.ArrayList;
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
         * If the license plate doesn't have an
         * owner, the method returns true.
         * 
         * If the license already has an owner attached,
         * the method returns false and does nothing.
         */

        String owner = VehicleRegistry.get(licensePlate);

        if (owner == null) {
            this.VehicleRegistry.put(licensePlate, ownerName);
            return true;
        }

        return false;

    }

    public String get(LicensePlate licensePlate) {

        /*
         * returns the owner of the car corresponding to the license plate received as a
         * parameter. If the car isn't in the registry, the method returns null.
         */

        if (!this.VehicleRegistry.containsKey(licensePlate)) {
            return null;
        }

        return this.VehicleRegistry.get(licensePlate);

    }

    public boolean remove(LicensePlate licensePlate) {

        /*
         * removes the license plate and attached data from the registry.
         * 
         * The method returns true if removed successfully and false if the license
         * plate wasn't in the registry.
         */

        if (!this.VehicleRegistry.containsKey(licensePlate)) {
            return false;
        }

        this.VehicleRegistry.remove(licensePlate);
        return true;

    }

    public void printLicensePlates() {
        // prints the license plates in the registry.

        for (LicensePlate license : this.VehicleRegistry.keySet()) {
            System.out.println(license);
        }
    }

    public void printOwners() {
        /*
         * prints the owners of the cars in the registry. Each name should only be
         * printed once, even if a particular person owns more than one car.
         */

         ArrayList<String> owners = new ArrayList<>();

         for (String owner : this.VehicleRegistry.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
         }
    }

}
