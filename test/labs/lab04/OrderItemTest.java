package labs.lab04;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

class OrderItemTest {
    @Test
    void testing_getLineTotal(){
        OrderItem order = new OrderItem("pen", 44.6, 7);
        assertEquals(312.2, order.getLineTotal());
        OrderItem order2 = new OrderItem("blue", 2.5, 2);
        assertEquals(5, order2.getLineTotal(), 0.001);
    }

    @Test
    void testing_nameIsBlank(){
        assertThrows(IllegalArgumentException.class, ()->
                        new OrderItem("", 98.6, 8));
    }

    @Test
    void testing_priceIsZero(){
        assertThrows(IllegalArgumentException.class, ()->
                new OrderItem("pen", -1, 8));
    }

    @Test
    void testing_quantityIsZero(){
        assertThrows(IllegalArgumentException.class, ()->
                new OrderItem("pen", 98.6, 0));
    }

}