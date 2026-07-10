# Mood Analyzer - UC3

## Overview

Mood Analyzer is a Java application that analyzes a given mood message and returns whether the mood is **SAD** or **HAPPY**.

In this Use Case, the application is enhanced to handle **NULL mood messages** by throwing a **custom exception** instead of causing a `NullPointerException`.

---

## Use Case 3 (UC3): Handle NULL Mood Using Custom Exception

### Objective

Handle the scenario where the user provides a `null` mood message by throwing a custom exception named `MoodAnalysisException`.

---

## Features

- Analyze mood from a given message.
- Return **SAD** when the message contains `"Sad"`.
- Return **HAPPY** for all other valid messages.
- Throw `MoodAnalysisException` when the mood message is `null`.
- Use an **Enum** to identify the exception type.

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

## Algorithm

1. Read the mood message.
2. If the message is `null`, throw `MoodAnalysisException`.
3. Otherwise, check whether the message contains `"Sad"`.
4. Return:
    - `SAD`
    - `HAPPY`

---

## Example

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

## Exception Type

```java
NULL_MOOD
```

---

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Run `Main.java`.
4. Test with valid and null mood messages.
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
```

---

## Future Enhancements

- Handle Empty Mood.
- Add Reflection support.
- Create objects dynamically using Reflection API.
- Add JUnit test cases.

---

## Author

**Aryan Pujari**