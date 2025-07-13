# Task 4 - Testing

## 📄 Description

### Level 1 - JUnit

#### Exercise 1

Create a Java class that manages a collection of books in a library. The class should allow you to:

1. Add books to the collection.
2. Retrieve the full list of books.
3. Get the title of a book by its position.
4. Insert a book at a specific position.
5. Remove a book by its title.
   
Write JUnit tests that verify:

1. The book list is not null when a new object is created.
2. The list has the expected size after adding multiple books.
3. The list contains a specific book at the correct position.
4. There are no duplicate book titles in the list.
5. The title of a book can be retrieved by position.
6. Adding a book correctly modifies the list.
7. Removing a book decreases the list size.
8. The list remains sorted alphabetically after adding or removing a book.

#### Exercise 2

Create a Java class called ComputeDni that calculates the letter of a Spanish DNI when it receives the DNI number as a parameter.

Write a test class that verifies its correct behavior by parameterizing the test so that it runs with a wide range of data.

#### Exercise 3

Create a Java class with a method that intentionally throws an ArrayIndexOutOfBoundsException.

Write a test that verifies this behavior by checking that the exception is thrown when the method is called.

### Level 2 - AssertJ

#### Exercises 1 - 7

Create Java classes and/or tests to demonstrate the following:

1. An assertion that verifies the values of two Integer objects are equal, and one that verifies they are not equal.
2. An assertion that verifies that two object references point to the same object, and one that verifies that two object references do not point to the same object.
3. An assertion that verifies that two arrays of integers are identical.
4. Given an ArrayList of different objects:
   - An assertion to verify the order of the objects in the list is the same as the order of insertion.
   - An assertion to verify that the list contains the objects in any order.
   - An assertion to verify that one of the objects was added only once.
   - Leave one object out, and verify that the list does not contain this missing object.
5. An assertion to verify that a map contains a key that was added.
6. An assertion that verifies that an ArrayIndexOutOfBoundsException is thrown.
7. An assertion to verify that an Optional is empty.

## 💻 Technologies used

Java 21

Maven 4.0.0

## 📋 Requirements

Java 21

Maven 4.0.0

## 🛠️ Set up

1. Clone repository: -> git clone
2. Access project repository: cd 1.4-Testing
3. The *level-1* module contains level 1. The *level-2* module contains level 2.

## ▶️ Run

Open the project in your IDE and run the Test files.







