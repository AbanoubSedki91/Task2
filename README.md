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

## Run the Project

```bash
mvn clean test
```

---

## Author
**Abanoub Sedki**