# Java Advanced: Exception Handling & Collections (Task 4)

This repository contains Java programs demonstrating advanced concepts such as exception handling and the use of collection classes. The project includes solutions to five tasks (Q1 to Q5) focusing on custom exceptions, array handling, HashMap operations, and stack implementation.

## Project Structure

- **Student.java**: Implements the `Student` class with exception handling for age and name validation (Q1).
- **AgeNotWithinRangeException.java**: Custom exception for invalid student age (Q1).
- **NameNotValidException.java**: Custom exception for invalid student name (Q1).
- **Voter.java**: Implements the `Voter` class with age validation using exceptions (Q2).
- **QuestionThree.java**: Handles weekday array with exception handling for invalid indices (Q3).
- **QuestionFour.java**: Implements a HashMap for student names and grades with methods to add, remove, and display (Q4).
- **QuestionFive.java**: Implements a stack for integers using collection classes with push, pop, and isEmpty methods (Q5).
- **1.c.png, 1.d.png, 2.a.png, 2.b.png, 3.a.png, 3.b.png, 3.c.png, 4.a.png, 4.b.png, 4.c.png, 4.d.png, 5.png**: Screenshots of the code implementations for each task.

## Tasks Overview

### Q1: Student Management System with Exception Handling
- **Student Class**: Represents a student with attributes `rollNo`, `name`, `age`, and `course`, initialized via a parameterized constructor.
- **Exceptions**:
  - Throws `AgeNotWithinRangeException` if the age is not between 15 and 21.
  - Throws `NameNotValidException` if the name contains numbers or special symbols.
- Custom exception classes are defined to handle these scenarios.

### Q2: Voter Class with Age Validation
- **Voter Class**: Contains attributes `voterId`, `name`, and `age`, initialized via a parameterized constructor.
- Throws an exception (checked or unchecked) if the age is less than 18, with the message "invalid age for voter".

### Q3: Weekday Array with Exception Handling
- Stores weekday names in an array starting with "Sunday" at index 0.
- Accepts a day position from the user and prints the corresponding day name.
- Handles `ArrayIndexOutOfBoundsException` for indices outside the range 0-6, displaying a proper error message.

### Q4: Student Grades HashMap
- Uses a `HashMap` to store student names (keys) and grades (integer values).
- Provides methods to:
  - Add a new student and grade.
  - Remove a student.
  - Display a student’s grade by name.

### Q5: Stack Implementation with Collection Classes
- Uses a collection class to store integers in a stack.
- Implements methods to:
  - Push elements onto the stack.
  - Pop elements from the stack.
  - Check if the stack is empty.

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/thesoulseizure/task-4.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd task-4
   ```
3. **Compile the Java Files**:
   ```bash
   javac *.java
   ```
4. **Run the Desired Program**:
   - For Q1: `java Student`
   - For Q2: `java Voter`
   - For Q3: `java QuestionThree`
   - For Q4: `java QuestionFour`
   - For Q5: `java QuestionFive`

## Requirements

- Java Development Kit (JDK) 8 or higher.
- A terminal or IDE to compile and run Java programs.

## Screenshots

The repository includes screenshots (1.c.png to 5.png) that show the code implementations for each task. Refer to these images to view the solutions visually.
