OOP Vehicle Inheritance Project 🚗

This is a Week 1 mini-project demonstrating core Object-Oriented Programming (OOP) concepts using Java. The project simulates a basic vehicle management system where different types of vehicles share common traits but can also have their own specific behaviors.


🧠 Concepts Demonstrated
This project focuses on the following OOP pillars:

Classes & Objects: Creating blueprints (Vehicle and Car) and instantiating them into usable objects (e.g., c1, c2, and v1).

Inheritance (extends): The Car class inherits attributes (Brand, year) and methods from the parent Vehicle class, preventing code duplication.

Method Overriding (@Override): The Car class provides its own specific implementation of the startengine() and display() methods, overriding the default behavior 
inherited from the Vehicle class.

The super() Keyword: Used within the child class constructor to invoke the parent class's constructor.

🛠️ Technologies Used

Java: Utilizes modern Java features (Java 21+), specifically implicitly declared classes and instance main methods (void main()) for a clean, boilerplate-free entry point.


🚀 How to Run

Make sure you have a modern version of the Java Development Kit (JDK 21 or higher) installed on your machine.
Clone this repository or download the Vehicle.java file.
Open your terminal or command prompt, navigate to the folder containing the file, and run:
java Vehicle.java
