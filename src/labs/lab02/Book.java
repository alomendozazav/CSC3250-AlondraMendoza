package labs.lab02;

public class Book {

    private String title;
    private String author;
    private boolean checkedOut;
    private boolean isReturned;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.checkedOut = false;
        this.isReturned = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public boolean isReturned(){
        return isReturned;
    }

    public static void main(String[] args) {
        System.out.println("book");
    }

    public void checkOut(){
        if(checkedOut){
            throw new IllegalStateException("Book is Already Checked Out ):"
            );
        }
        checkedOut = true;
    }

    public void returnBook(){
        if (isReturned){
            throw new IllegalStateException("Book is already returned");
        }
        checkedOut = false;
    }
}