# MVC Architecture - Java

A Java program demonstrating the **Model-View-Controller (MVC)** design pattern to store and manage user credentials (`userName` and `password`).

## 📁 Project Structure

```
MVC_Architecture/
│
├── User.java             ← Model: stores userName & password
├── UserView.java         ← View: displays user details
├── UserController.java   ← Controller: connects Model & View
└── MVCPatternDemo.java   ← Main: driver class
```

## 🏗️ MVC Pattern Overview

| Component | File | Responsibility |
|-----------|------|----------------|
| **Model** | `User.java` | Holds data (userName, password) |
| **View** | `UserView.java` | Displays/renders user details |
| **Controller** | `UserController.java` | Mediates between Model and View |
| **Main** | `MVCPatternDemo.java` | Entry point, orchestrates MVC |

## 🔄 Flow Diagram

```
Main (MVCPatternDemo)
        │
        ▼
  UserController
   /           \
User          UserView
(Model)        (View)
```

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or higher installed
- `javac` and `java` available in PATH

### Compile
```bash
javac *.java
```

### Run
```bash
java MVCPatternDemo
```

## 📋 Expected Output

```
=== Initial User Details ===
------------------------------------
           User Details             
------------------------------------
Username : admin
Password : *********
------------------------------------

>>> Updating Username to 'john_doe' and Password to 'newPass@456'...

=== Updated User Details ===
------------------------------------
           User Details             
------------------------------------
Username : john_doe
Password : ************
------------------------------------
```

## 🔐 Security Note
Passwords are **masked with `*`** in the view output for security.

## 📚 Reference
Based on the MVC Pattern tutorial from [GeeksforGeeks](https://www.geeksforgeeks.org/mvc-design-pattern/).

## 👤 Author
[balajigs08](https://github.com/balajigs08)
