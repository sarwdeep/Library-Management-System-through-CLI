package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> issuedBooks;

    public User(String name) {
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void issueBook(Book book) {
        issuedBooks.add(book);
        book.issueBook();
    }

    public void returnBook(Book book) {
        issuedBooks.remove(book);
        book.returnBook();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", issuedBooks=" + issuedBooks +
                '}';
    }

    public void displayIssuedBooks() {
        if (issuedBooks.isEmpty()) {
            System.out.println(name + " has no issued books.");
        } else {
            System.out.println(name + "'s issued books:");
            for (Book b : issuedBooks) {
                System.out.println(" - " + b);
            }
        }
    }
}
