# SauceDemo Automation Project  - სატესტო რიდმი ფაილი

This project is an automated testing suite for the SauceDemo website using Java, Selenium, and TestNG.

## Project Structure

- `src/main/java/ge/automation/pages/`: Contains page object classes for different pages of the SauceDemo website.
- `src/test/java/ge/automation/`: Contains base test class and test classes.
- `src/test/resources/`: Contains TestNG configuration files.

## Prerequisites

- Java 8 or higher
- Maven
- IntelliJ IDEA or any other preferred IDE

## Setup

1. Clone the repository:
    ```sh
    git clone <repository-url>
    ```
2. Navigate to the project directory:
    ```sh
    cd <project-directory>
    ```
3. Install dependencies:
    ```sh
    mvn clean install
    ```

## Running Tests

To run the tests, use the following command:
```sh
mvn test
