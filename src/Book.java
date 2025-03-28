import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private int bookID;
    private String title;
    private String author;
    private String genre;
    private String availability;

    public Book(int bookID, String title, String author, String genre, String availability) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        setAvailability(availability);
    }

    public int getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public String getAvailability() { return availability; }

    public void setAvailability(String availability) {
        if (availability.equals("A") || availability.equals("C")) {
            this.availability = availability;
        } else {
            throw new IllegalArgumentException("Availability must be 'A' (Available) or 'C' (Checked Out)");
        }
    }

    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author + 
               ", Genre: " + genre + ", Availability: " + (availability.equals("A") ? "Available" : "Checked Out");
    }
}
