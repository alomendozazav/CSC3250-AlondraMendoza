package labs.lab06;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    @Test
    public void testCartSubtotal() {
        Product keyboard = new Product("P1", "Keyboard", 40.0);
        Product mouse = new Product("P2", "Mouse", 20.0);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(keyboard, 2);
        cart.addProduct(mouse, 1);
        assertEquals(100.0, cart.getSubtotal(), 0.001);
    }
}