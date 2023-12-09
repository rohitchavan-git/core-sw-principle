# Design Patterns and Principles

This repository follows various design patterns and principles to enhance the structure, maintainability, and extensibility of the codebase. Below is a brief overview of the design patterns and principles implemented:

## Design Patterns

- **Singleton:**
  Ensures that a class has only one instance and provides a global point of access to it.

- **Strategy:**
  Defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the client to choose the algorithm at runtime.

- **Abstract Factory:**
  Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

- **Decorator:**
  Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.

- **Builder:**
  Separates the construction of a complex object from its representation, allowing the same construction process to create various representations.

- **AOP/Execute Around Pattern:**
  Aspect-Oriented Programming (AOP) separates cross-cutting concerns by encapsulating them in aspects. The Execute Around Pattern focuses on wrapping the main logic with setup and teardown operations.

- **Factory Method:**
  Defines an interface for creating objects but lets subclasses alter the type of objects that will be created.

- **Prototype:**
  Creates new objects by copying an existing object, known as the prototype.

- **Adapter:**
  Allows the interface of an existing class to be used as another interface.

- **Observer:**
  Defines a one-to-many dependency between objects, ensuring that when one object changes state, all its dependents are notified and updated automatically.

- **Command:**
  Encapsulates a request as an object, allowing users to parameterize clients with queues, requests, and operations.

## SOLID Principles

- **Single Responsibility Principle (SRP):**
  Classes should have a single responsibility, ensuring that they are cohesive, narrow, and focused.

- **Open-Closed Principle (OCP):**
  Software entities should be open for extension but closed for modification.

- **Liskov Substitution Principle (LSP):**
  Derived classes should be able to substitute their base classes without affecting the correctness of the program.

- **Interface Segregation Principle (ISP):**
  Clients should not be forced to depend on interfaces they do not use. Extract interfaces based on responsibilities and create a chain of interfaces if necessary.

- **Dependency Inversion Principle (DIP):**
  High-level modules should not depend on low-level modules; both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions.

## Additional Principles

- **KISS (Keep It Simple and Stupid):**
  Simplicity is a key goal in design. Keep solutions straightforward and easy to understand.

- **YAGNI (You Ain't Gonna Need It):**
  Avoid implementing features until they are necessary to prevent overengineering and unnecessary complexity.

- **Cohesive (SLAP - Single Level of Abstraction Principle):**
  Ensure that functions and classes have a single responsibility and operate at a single level of abstraction.

## Accidental Complexity and Inherent Complexity

- **Accidental Complexity:**
  Complexities introduced during the development process that are not inherent in the problem being solved.

- **Inherent Complexity:**
  Complexity that is unavoidable and comes from the nature of the problem itself.

- Striving for simplicity and adhering to design principles help minimize accidental complexity, allowing developers to focus on solving the inherent complexity of the problem.

## High Cohesion and Low Coupling

- **High Cohesion:**
  Ensures that components of a system are focused and closely related to a specific task.

- **Low Coupling:**
  Minimizes dependencies between components.

- Together, high cohesion and low coupling contribute to a well-designed system by making it more modular, maintainable, and scalable.

- A design with high cohesion and low coupling is easier to understand, modify, and extend. It promotes code reusability and facilitates the isolation of changes, making the system more resilient to future modifications.

Feel free to explore the codebase and contribute to the project following these design patterns and principles. Happy coding!
