# Wikipedia Mobile Automation Task

## Overview

This project automates an end-to-end user journey on the Wikipedia Android application using Appium.

The scenario covers searching for an article, saving it to a new Reading List, and verifying that the article was successfully saved and reopened.

---

## Tech Stack

- Java 17
- Maven
- Appium
- Selenium
- TestNG

---

## Design Pattern

- Page Object Model (POM)

---

## Project Structure

```
src
│
├── main
│   ├── java
│   │   ├── base
│   │   ├── constants
│   │   ├── pages
│   │   └── utils
│   │
│   └── resources
│
└── test
    └── java
        ├── base
        └── tests
```

---

## Automated Test Scenario

1.  Launch Wikipedia App.
2.  Search for "Artificial Intelligence".
3.  Open the first search result.
4.  Verify the article page.
5.  Save the article.
6.  Verify the save confirmation message.
7.  Add the article to a new Reading List.
8.  Create a Reading List.
9.  Verify the success message.
10. Open the Reading List.
11. Verify the saved article.
12. Open the article again.
13. Verify the article opens successfully.

---

## Assertions

- Article page is opened.
- Save confirmation message is displayed.
- Reading List is created.
- Reading List page is opened.
- Saved article exists.
- Article opens successfully.

---

## Running the Project

### 1. Clone the repository

```bash
git clone https://github.com/AbanoubSedki91/Task2.git
```

### 2. Navigate to the project

```bash
cd Task2
```

### 3. Install dependencies

```bash
mvn clean install
```

### 4. Run all tests

```bash
mvn clean test
```

### Alternative

You can also execute the **WikipediaTest** class directly from IntelliJ IDEA by right-clicking the test class and selecting **Run 'WikipediaTest'**.

---

## Author
**Abanoub Sedki**