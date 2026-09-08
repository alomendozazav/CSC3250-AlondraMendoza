package labs.lab02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void newBookShouldBeAvailable() {
        Book book = new Book("Dune", "Frank Herbert");

        assertFalse(book.isCheckedOut());
    }

    @Test
    void availableToCheckedOut(){
        Book book = new Book("Gone Girl", "April Henry");
        book.checkOut();
        assertTrue(book.isCheckedOut());
    }

    @Test
    void checkedOutToReturned(){
        Book book = new Book("Gone Girl", "April Henry");
        book.checkOut();
        book.returnBook();
        assertFalse(book.isCheckedOut());
    }

    @Test
    void cannotCheckoutTwice(){
        Book book = new Book("Gone Girl", "April Henry");
        book.checkOut();
        assertThrows(IllegalStateException.class, ()->
                book.checkOut());
    }
}