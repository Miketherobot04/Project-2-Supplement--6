
README.md
Project 2 Supplement – 6
Project Purpose
This project introduces the use of Java utility classes (import java.util) by implementing functions that manipulate and analyze lists of integers. The main objectives include:

Generating a random list of integers.
Converting a list of integers into a frequency map (mapping each integer to its occurrence count).
Sorting a list of integers in ascending order.
The project emphasizes the use of test-driven development (TDD), requiring tests to be written first, followed by the implementation of functionality, and finally documentation.

Features
Random List Generator:
Generates a list of random integers of a specified size.
Frequency Map Generator:
Converts a list into a map where the keys are integers and the values are their respective occurrence counts.
List Sorter:
Sorts a list of integers in ascending order.
Setup and Prerequisites
Prerequisites
Java Development Kit (JDK):
Ensure you have Java 8 or later installed.
Verify installation using:
bash
Copy code
java -version
JUnit 5:
Add JUnit 5 dependencies to your project. If using Maven, include the following in your pom.xml:
xml
Copy code
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.3</version>
    <scope>test</scope>
</dependency>
Clone the Repository
Clone the repository to your local machine:
bash
Copy code
git clone <repository-url>
cd <repository-directory>
Running the Application
1. Compile the Code
Use the terminal to compile the Java files:

bash
Copy code
javac -d out src/*.java
2. Run Unit Tests
Run the tests using your preferred IDE or the command line:

Using an IDE:

Import the project into IntelliJ IDEA, Eclipse, or VS Code.
Run the test classes (ListUtilityTest) directly from the IDE.
Using Command Line: If you are using Maven:

bash
Copy code
mvn test
Or, if you’re using the compiled out directory:

bash
Copy code
java -cp out:lib/junit-platform-console-standalone-1.9.3.jar org.junit.platform.console.ConsoleLauncher --class-path out --scan-classpath
Directory Structure
bash
Copy code
ProjectRoot/
│
├── src/
│   ├── ListUtility.java          # Contains the implementation of all methods
│   └── ListUtilityTest.java      # JUnit test cases for each method
│
├── pom.xml                       # Maven configuration file
├── README.md                     # Project documentation
└── .gitignore                    # Git ignore rules
Testing Overview
This project uses JUnit 5 to test all functions. Key test scenarios include:

Random List Generation:

Ensures the list size matches the input parameter.
Verifies randomness and validity of generated integers.
Frequency Map Conversion:

Ensures the frequency map accurately represents occurrences.
Handles edge cases like empty lists and duplicates.
Sorting:

Confirms the list is sorted in ascending order.
Validates behavior for already sorted or reverse-ordered lists.
Contribution
Fork the repository.
Create a feature branch:
bash
Copy code
git checkout -b feature-name
Commit your changes:
bash
Copy code
git commit -m "Description of changes"
