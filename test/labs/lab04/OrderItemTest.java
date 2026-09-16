package labs.lab04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderItemTest {
    @Test
    void testing_getLineTotal(){
        OrderItem order = new OrderItem("pen", 44.6, 7);
        assertEquals(312.2, order.getLineTotal());
        OrderItem order2 = new OrderItem("blue", 2.5, 2);
        assertEquals(5, order2.getLineTotal(), 0.001);
    }

}