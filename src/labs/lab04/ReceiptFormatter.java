package labs.lab04;

public class ReceiptFormatter {

    public String format(Order order) {
        // TODO 3:
        // 1. Begin with "CHECKOUT" and a line break.
        // 2. Add one formatted line for every OrderItem.
        // 3. Add the formatted subtotal.
        // 4. Return the completed String.

        String recipt = "-----------------CHECKOUT-----------------\n";
        for(OrderItem item : order.getItems()){
            recipt += item.getName() + ":  $" + item.getUnitPrice();
            recipt += "\n";
        }
        recipt += "--------------------------------\n";
        recipt += "Subtotal: $";
        recipt += order.getSubtotal();
        return recipt;
    }
}
