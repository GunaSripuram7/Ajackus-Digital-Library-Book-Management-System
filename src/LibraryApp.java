import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book Availability");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability (A for Available, C for Checked Out): ");
                    String availability = scanner.nextLine().toUpperCase();

                    try {
                        library.addBook(new Book(id, title, author, genre, availability));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2: // View Books
                    library.viewBooks();
                    break;

                case 3: // Search Book
                    System.out.print("Enter Book ID or Title to search: ");
                    String searchParam = scanner.nextLine();
                    Book book = library.searchBook(searchParam);
                    System.out.println(book != null ? book : "Book not found.");
                    break;

                case 4: // Update Availability
                    System.out.print("Enter Book ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Availability (A for Available, C for Checked Out): ");
                    String newAvailability = scanner.nextLine().toUpperCase();
                    library.updateAvailability(updateId, newAvailability);
                    break;

                case 5: // Delete Book
                    System.out.print("Enter Book ID: ");
                    int deleteId = scanner.nextInt();
                    library.deleteBook(deleteId);
                    break;

                case 6: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
