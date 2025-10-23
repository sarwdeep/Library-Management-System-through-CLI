

# Library Management System (CLI Version) 📚

## Project Overview

This project is a command-line-based Library Management System developed in Java using Object-Oriented Programming (OOP) principles. It allows the user to manage books and users by performing operations such as adding books, adding users, issuing books, returning books, and displaying all books and users.

The system demonstrates key OOP concepts including abstraction, encapsulation, inheritance, and polymorphism.

## Features

* Add new books to the library
* Add new users to the system
* Issue a book to a user
* Return a book from a user
* Display all books with status (issued/available)
* Display all users with their issued books

## How to Run

1. Clone the repository:
   `git clone <repository-url>`
2. Navigate to the project folder in terminal
3. Compile the code:
   `javac *.java`
4. Run the application:
   `java LibrarySystem`
5. Follow the on-screen prompts to perform operations

## OOP Concepts Implemented

* Encapsulation: Private fields and getters/setters for Book and User
* Abstraction: Separation of classes based on responsibilities
* Polymorphism: Overridden toString() method in Book class
* Composition (HAS-A relationship): User has a list of issued books

## Interview Questions and Answers

**1. What is abstraction?**
Abstraction is the process of hiding the internal implementation details of a class and exposing only the essential functionalities to the user. It helps reduce complexity and allows the programmer to focus on high-level operations without worrying about the underlying details.

**2. Difference between interface and abstract class?**
An abstract class can have both abstract methods (without body) and concrete methods (with implementation), whereas an interface can only have abstract methods (Java 8 and above allow default and static methods). A class can inherit only one abstract class but can implement multiple interfaces. Abstract classes are used when classes share some common behavior, while interfaces define a contract that multiple classes can implement.

**3. Explain polymorphism with example.**
Polymorphism allows objects to take multiple forms. For example, if a class Book has a method display() and a subclass EBook overrides it, then calling display() on a Book reference that points to an EBook object will execute the EBook version. Polymorphism can be achieved through method overriding and method overloading.

**4. What is method overriding?**
Method overriding occurs when a subclass provides a specific implementation of a method already defined in its superclass. The overridden method must have the same name, return type, and parameters as the method in the superclass.

**5. Explain “IS-A” vs “HAS-A” relationships.**
IS-A represents inheritance, meaning one class is a type of another class. For example, a Dog IS-A Animal. HAS-A represents composition, meaning one class contains or owns another class as a part. For example, a User HAS-A list of Books.

**6. Why use inheritance?**
Inheritance allows a class to acquire properties and behaviors of another class. It promotes code reusability, reduces redundancy, and establishes a hierarchical relationship between classes.

**7. What is dynamic binding?**
Dynamic binding occurs when the method that needs to be executed is determined at runtime rather than compile time. It is used in method overriding, where the method call is resolved to the actual object type at runtime.

**8. What is constructor chaining?**
Constructor chaining refers to calling one constructor from another within the same class or from a superclass constructor. It ensures proper initialization of objects and avoids code duplication.

**9. How to implement encapsulation?**
Encapsulation is implemented by declaring class variables as private and providing public getter and setter methods to access and update the variables. This protects the data from unauthorized access and allows controlled modification.

**10. Explain super keyword.**
The super keyword is used in Java to refer to the immediate parent class. It can be used to call parent class methods, access parent class variables, or invoke the parent class constructor.


