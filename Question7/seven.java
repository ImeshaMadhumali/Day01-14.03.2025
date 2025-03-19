public class seven{
    public static void main(String[] args) {

        library library = new library(5);
        
        library.addBook(new printedBook("Enid blyton", "Five on a Treasure Island", 1942, 180));
        library.addBook(new eBook("George Orwell", "1984", 1949, 1.5, "PDF"));
        library.addBook(new audioBook("Michelle Obama", "Becoming", 2018, 19.5, "Michelle Obama"));

        library.displayBooks();
    }
}

// Output
// @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025/Question7 (main) $ javac seven.java
// @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025/Question7 (main) $ java seven

// Library Collection:
// Printed Book: Enid blyton by Five on a Treasure Island, Year: 1942, Pages: 180
// E-Book: George Orwell by 1984, Year: 1949, File Size: 1.5MB, Format: PDF
// Audio Book: Michelle Obama by Becoming, Year: 2018, Duration: 19.5 hours, Narrated by: Michelle Obama