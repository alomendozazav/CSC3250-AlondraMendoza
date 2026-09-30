package labs.lab06;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatalogTest {
    @Test
    public void testCatalogFindProduct() {
        Product keyboard = new Product("P1", "Keyboard", 40.0);
        Catalog catalog = new Catalog();
        catalog.addProduct(keyboard);
        assertSame(keyboard, catalog.findProduct("P1"));
    }
}