public class library {
    private book[] books;
    private int bookCount;

    public library(int capacity) {
        books = new book[capacity];
        bookCount = 0;
    }

    public void addBook(book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void displayBooks() {
        System.out.println("\nLibrary Collection:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayDetails();
        }
    }
}