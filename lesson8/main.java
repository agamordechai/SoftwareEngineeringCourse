package lesson8;

public class main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Reader reader1 = new Reader("John Doe", "123 Main St", "R001", "555-1234");
        Reader reader2 = new Reader("Jane Smith", "456 Elm St", "R002", "555-5678");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Available books:");
        System.out.println(book1.getTitle() + " by " + book1.getAuthor());
        System.out.println(book2.getTitle() + " by " + book2.getAuthor());

        if (library.rentBook(book1, reader1)) {
            System.out.println(reader1.getName() + " rented " + book1.getTitle());
        } else {
            System.out.println(book1.getTitle() + " is not available for rent.");
        }
        if (library.rentBook(book1, reader1)) {
            System.out.println(reader1.getName() + " rented " + book1.getTitle());
        } else {
            System.out.println(book1.getTitle() + " is not available for rent.");
        }

        if (library.returnBook(book1)) {
            System.out.println(reader1.getName() + " returned " + book1.getTitle());
        } else {
            System.out.println(book1.getTitle() + " was not rented.");
        }
    }
}
