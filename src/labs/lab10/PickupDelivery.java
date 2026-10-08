package labs.lab10;

import labs.lab09.CompositionDemo.DeliveryMethod;

public class PickupDelivery extends DeliveryMethod {
    private final String location;

    public PickupDelivery(String location) {
        // TODO 6:
        // Reject null or blank location with IllegalArgumentException.
        // Then assign the field.
        if (location == null || location.isBlank()){
            throw new IllegalArgumentException();
        }
        this.location = location;

    }

    @Override
    public String instructions() {
        // TODO 7:
        // Return exactly: Pick up at <location>
        return "Pick up at " + location;
    }
}