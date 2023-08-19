# Documentation

Documentation for the given code:

The code provided is a simple Java program that demonstrates the concept of nested classes and how to use them. It includes a main class called "Nested" and two nested classes called "User" and "AccountCreation", along with a static nested class called "DataStoring".

Here is the documentation for each part of the code:

1. Main Class (Nested):
   - The main method creates an instance of the Nested class and calls its input() method.
   - The input() method prompts the user to enter their first and last names using the Scanner class.
   - The enteredData() method is then called, passing the entered first and last names as parameters.
   - The enteredData() method creates an instance of the User class and its nested classes (AccountCreation and DataStoring).
   - It sets the first and last names using the setters in the AccountCreation class.
   - It then creates a new instance of the DataStoring class and stores the user data (first name and AccountCreation object) in the data HashMap.
   - Finally, it retrieves the AccountCreation object associated with the entered first name from the data HashMap and prints the first and last names.

2. Nested Class (User):
   - This class contains two nested classes: AccountCreation and DataStoring.

3. Nested Class (AccountCreation):
   - This class represents the user account creation process.
   - It has private instance variables for the first name and last name.
   - It provides getter and setter methods for accessing and modifying the first and last names.

4. Static Nested Class (DataStoring):
   - This static nested class represents a data storage mechanism for user accounts.
   - It has a static HashMap called "data" to store the user data, where the key is the first name and the value is an instance of the AccountCreation class.
   - It provides a default constructor and a parameterized constructor that adds user data to the HashMap.
   - It also provides a method called "viewData" that retrieves the AccountCreation object associated with a given first name from the HashMap.

Overall, this code demonstrates the use of nested classes and illustrates how to store and retrieve data using a HashMap.
