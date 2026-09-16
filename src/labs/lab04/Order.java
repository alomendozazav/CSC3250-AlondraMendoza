package labs.lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Order {
    private final List<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        if (item == null) {
            throw new IllegalArgumentException(
                    "Order item cannot be null."
            );
        }

        items.add(item);
    }

    public List<OrderItem> getItems() {
        return List.copyOf(items);
    }

    public double getSubtotal() {
        // TODO 2: Ask each OrderItem for its line total and add the results.
        double subTotal = 0.0;
        for(OrderItem item : items){
            subTotal += item.getLineTotal();
        }

        return subTotal;
    }
}