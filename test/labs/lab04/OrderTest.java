package labs.lab04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void testing_subTotal(){
        Order ord = new Order();
        ord.addItem(new OrderItem("pen", 44.6, 7));
        ord.addItem(new OrderItem("pencil", 2.5, 2));
        assertEquals(317.2, ord.getSubtotal(), 0.001);
    }

}