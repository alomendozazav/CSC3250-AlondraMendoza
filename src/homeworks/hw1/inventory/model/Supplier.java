package homeworks.hw1.inventory.model;

/**
 * Represents a supplier that can provide one or more products.
 *
 * HW1 focus:
 * - Encapsulation: keep fields private.
 * - Constructor: initialize the object's state.
 * - Accessors: provide read-only access through getters.
 */
public class Supplier {

    private String supplierId;
    private String name;
    private String email;

    /**
     * TODO 1: Initialize all fields using the constructor parameters.
     *
     * Hint: use this.supplierId = supplierId; and similarly for the
     * other fields.
     */
    public Supplier(String supplierId, String name, String email) {
        // TODO: initialize supplierId, name, and email.
        this.supplierId = supplierId;
        this.name = name;
        this.email = email;
    }

    /**
     * TODO 2: Return the supplier ID.
     */
    public String getSupplierId() {
        return supplierId; // TODO
    }

    /**
     * TODO 3: Return the supplier name.
     */
    public String getName() {
        return name; // TODO
    }

    /**
     * TODO 4: Return the supplier email.
     */
    public String getEmail() {
        return email; // TODO
    }
}
