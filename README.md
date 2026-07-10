# Mood Analyzer

## Overview
Mood Analyzer is a Java application that analyzes a given mood message and returns whether the mood is **SAD** or **HAPPY**.

This project is developed as part of the BridgeLabz Exception Handling assignment.

---

## User Case 1 (UC1)

### Objective
Given a message, analyze and return the mood.

### Rules
- If the message contains **"Sad"**, return **"SAD"**.
- Otherwise, return **"HAPPY"**.

---

## Example

| Input | Output |
|-------|--------|
| I am in Sad Mood | SAD |
| I am in Happy Mood | HAPPY |
| I am in Any Mood | HAPPY |

---

## Project Structure

```
MoodAnalyzer
│
├── src
│   ├── com.bridgelabz.moodanalyzer
│   │      └── MoodAnalyzer.java
│   │
│   └── com.bridgelabz.test
│          └── MoodAnalyzerTest.java
│
└── README.md
```

---

## Technologies Used

- Java
- JUnit 5
- IntelliJ IDEA

---

## Method

```java
public String analyseMood(String message)
```

### Parameters
- `message` – Mood message provided by the user.

### Returns
- `"SAD"` if the message contains `"Sad"`
- `"HAPPY"` otherwise

---

## Test Cases

### Test Case 1

**Input**

```
I am in Sad Mood
```

**Expected Output**

```
SAD
```

---

### Test Case 2

**Input**

```
I am in Any Mood
```

**Expected Output**

```
HAPPY
```

---

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Run `MoodAnalyzerTest`.
4. Verify that all test cases pass successfully.

---

## Future Enhancements

- Refactor to use constructors.
- Handle `null` and empty mood messages.
- Implement custom exceptions.
- Add reflection-based object creation.

---

## Author

Aryan Pujari