# Mood Analyzer - UC4

## Overview

Mood Analyzer is a Java application that analyzes a given mood message and determines whether the mood is **SAD** or **HAPPY**.

This Use Case enhances the application by handling **NULL** and **EMPTY** mood messages using a **Custom Exception** (`MoodAnalysisException`) and **Enum**.

---

## Use Case 4 (UC4): Handle Empty Mood Using Custom Exception

### Objective

Validate the mood message before analyzing it.

- Throw `MoodAnalysisException` if the mood is **NULL**.
- Throw `MoodAnalysisException` if the mood is **EMPTY**.
- Return **SAD** if the message contains `"Sad"`.
- Otherwise return **HAPPY**.

---

## Features

- Analyze mood messages.
- Constructor-based initialization.
- Handle NULL mood.
- Handle EMPTY mood.
- Custom Exception (`MoodAnalysisException`).
- Enum-based exception types.
- Manual testing using `Main.java`.

---

## Project Structure

```
MoodAnalyzer
│
├── src
│
├── com.bridgelabz.moodanalyzer
│      ├── MoodAnalyzer.java
│      └── Main.java
│
├── com.bridgelabz.exception
│      └── MoodAnalysisException.java
│
└── README.md
```

---

## Technologies Used

- Java
- Exception Handling
- Custom Exceptions
- Enum
- IntelliJ IDEA
- Git & GitHub

---

## Exception Types

```java
public enum ExceptionType {
    NULL_MOOD,
    EMPTY_MOOD
}
```

---

## Algorithm

1. Read the mood message.
2. If the message is `null`, throw `MoodAnalysisException` with `NULL_MOOD`.
3. If the message is empty (`""`), throw `MoodAnalysisException` with `EMPTY_MOOD`.
4. If the message contains `"Sad"`, return `SAD`.
5. Otherwise, return `HAPPY`.

---

## Sample Input & Output

### Example 1

**Input**

```
I am in Sad Mood
```

**Output**

```
SAD
```

---

### Example 2

**Input**

```
I am in Happy Mood
```

**Output**

```
HAPPY
```

---

### Example 3

**Input**

```
null
```

**Output**

```
Mood should not be null
```

---

### Example 4

**Input**

```
""
```

**Output**

```
Mood should not be empty
```

---

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Run `Main.java`.
4. Test the application using:
   - Valid mood
   - NULL mood
   - EMPTY mood
5. Observe the returned mood or exception message.

---

## Expected Output

```
Input : I am in Sad Mood
Output: SAD

Input : I am in Happy Mood
Output: HAPPY

Input : null
Output: Mood should not be null

Input : ""
Output: Mood should not be empty
```

---

## Future Enhancements

- Create objects dynamically using Reflection API.
- Invoke methods using Reflection.
- Add JUnit test cases.
- Add Object Equality validation.

---

## Author

**Aryan Pujari**