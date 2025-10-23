    package libraryManagementSystem;
    import java.util.*;

    public class LibrarySystem{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Book>books = new ArrayList<>();
            List<User>users = new ArrayList<>();
            boolean exit = true;
            int operation;

            while(exit){
                System.out.println("Enter the operation to perform:\n1)Add Books\n2)Add users\n3)Issue Books\n4)Return Book\n5)Display Books\n6)Display Users\n7)Exit\n");
                operation = scanner.nextInt();
                scanner.nextLine();
                if(operation==7){
                    System.out.println("System has ended successfully!!");
                    exit = false;
                    break;
                }

                switch(operation){
                    case 1:
                        System.out.println("Enter the title of the Book: ");
                        String title = scanner.nextLine();
                        System.out.println("Enter author: ");
                        String author = scanner.nextLine();
                        Book book = new Book(title, author);
                        books.add(book);
                        break;
                    case 2:
                        System.out.println("Enter User Name: ");
                        String userName = scanner.nextLine();
                        User user = new User(userName);
                        users.add(user);
                        break;
                    case 3:
                        System.out.println("Enter Username: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter book title: ");
                        String bookTitle = scanner.nextLine();
                        issueBookToUser(users,books,name,bookTitle);
                        System.out.println("Book Issued successfully");
                        break;
                    case 4:
                        System.out.println("Enter Username: ");
                        System.out.println("Enter Username: ");
                        String username = scanner.nextLine();
                        System.out.println("Enter book title: ");
                        String booktitle = scanner.nextLine();
                        returnBookFromUser(users,books,username, booktitle);
                        System.out.println("Book Returned successfully");
                        break;
                    case 5:
                        displayAllBooks(books);
                        break;
                    case 6:
                        displayAllUsers(users);
                        break;
                    default:
                        System.out.println("Invalid Instruction!,Try (1 to 7)");
                }
            }
        }


        static void displayAllBooks(List<Book>books){
            for(Book b:books){
                System.out.println(b);
            }
        }

        static void displayAllUsers(List<User> users){
            for(User u:users){
                System.out.println(u);
            }
        }


        static void issueBookToUser(List<User> users, List<Book> books,String userName, String bookTitle) {
            for (User u : users) {
                if (u.getName().equalsIgnoreCase(userName)) {
                    for (Book b : books) {
                        if (b.getTitle().equalsIgnoreCase(bookTitle)) {
                            u.issueBook(b);
                            return;
                        }
                    }
                    System.out.println("Book not found!");
                    return;
                }
            }
            System.out.println("User not found!");
        }

        static void returnBookFromUser(List<User> users, List<Book> books,String userName, String bookTitle) {
            for (User u : users) {
                if (u.getName().equalsIgnoreCase(userName)) {
                    for (Book b : u.getIssuedBooks()) {
                        if (b.getTitle().equalsIgnoreCase(bookTitle)) {
                            u.returnBook(b);
                            return;
                        }
                    }
                    System.out.println("Book not found in user's issued list!");
                    return;
                }
            }
            System.out.println("User not found!");
        }

    }

