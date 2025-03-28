import java.io.*;
import java.util.*;

public class Library {
    private static final String FILE_NAME = "books.dat";
    private List<Book> books;

    public Library() {
        books = loadBooks();
    }

    // Load books from file
    private List<Book> loadBooks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Book>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>(); // If file doesn't exist, return an empty list
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Save books to file
    private void saveBooks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Add a new book
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getBookID() == book.getBookID()) {
                System.out.println("Book ID already exists!");
                return;
            }
        }
        books.add(book);
        saveBooks();
        System.out.println("Book added successfully.");
    }

    // View all books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            books.forEach(System.out::println);
        }
    }

    // Search book by ID or Title
    public Book searchBook(String searchParam) {
        for (Book book : books) {
            if (String.valueOf(book.getBookID()).equals(searchParam) || book.getTitle().equalsIgnoreCase(searchParam)) {
                return book;
            }
        }
        return null;
    }

    // Update book availability
    public void updateAvailability(int bookID, String newAvailability) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                book.setAvailability(newAvailability);
                saveBooks();
                System.out.println("Book availability updated.");
                return;
            }
        }
        System.out.println("Book ID not found.");
    }

    // Delete a book
    public void deleteBook(int bookID) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getBookID() == bookID) {
                iterator.remove();
                saveBooks();
                System.out.println("Book deleted successfully.");
                return;
            }
        }
        System.out.println("Book ID not found.");
    }
}
