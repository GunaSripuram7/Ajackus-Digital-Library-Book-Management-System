# Ajackus-Digital-Library-Book-Management-System

Library Management System (Console-Based) 📚
Overview
This is a console-based Java application that allows users to manage a library's book inventory.
Features include:
✅ Adding a book
✅ Viewing all books
✅ Searching for a book by ID or Title
✅ Updating a book’s availability
✅ Deleting a book
✅ Persistent local storage using books.dat

Technologies Used
Java (JDK 17 recommended)

VS Code (with Java Extension Pack)

Project Structure
cpp
Copy
Edit
Library-Management/
│── src/
│   ├── Book.java
│   ├── Library.java
│   ├── LibraryApp.java
│── books.dat  (Stored data file - auto-generated)
│── README.md
Setup & Run Instructions
1️⃣ Install Java and VS Code
Ensure you have JDK 17+ installed. You can check by running:

sh
Copy
Edit
java -version
If Java is not installed, download it from Oracle JDK.

Also, install the Java Extension Pack in VS Code.

2️⃣ Clone or Download the Repository
sh
Copy
Edit
git clone https://github.com/yourusername/Library-Management.git
cd Library-Management
3️⃣ Compile and Run the Program
sh
Copy
Edit
javac -d bin src/*.java  
java -cp bin LibraryApp  
Usage Guide
Run the program using the above command.

Choose an option from the menu:

sql
Copy
Edit
Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book Availability
5. Delete Book
6. Exit
Choose an option:
Follow on-screen prompts to add, update, search, or delete books.

The data is saved locally in books.dat and persists even after closing the console.

File Storage Details
Books are stored locally in a file (books.dat) using Java Serialization.

The file is automatically loaded on startup and updated after any change.

Possible Enhancements
🚀 Convert the console app into a GUI-based application.
🚀 Store data in a database (MySQL, SQLite) instead of a file.
🚀 Implement user authentication for managing access.

Author & Contributions
👤 Name – GunaSripuram7
gmailid - gunasripuramofficial1@gmail.com

License
This project is open-source and available under the MIT License.
