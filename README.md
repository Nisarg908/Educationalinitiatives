
# Design Pattern Use Cases

## Behavioral Design Patterns

### 1. Memento Pattern
The Memento Pattern is used to restore an object's state to a previous state, useful for undo operations. This pattern involves three actors: Originator, Memento, and Caretaker.

**Code to Run:**
```bash
javac classes/*.java
javac MementoDesignPattern.java
java MementoDesignPattern
```

### 2. Mediator Pattern
The Mediator Pattern defines an object that encapsulates how a set of objects interact. It promotes loose coupling by keeping objects from referring to each other explicitly.

**Code to Run:**
```bash
javac classes/*.java
javac MediatorDesignPattern.java
java MediatorDesignPattern
```

---

## Creational Design Patterns

### 1. Factory Pattern
The Factory Pattern provides a way to create objects without specifying the exact class of the object that will be created. It encapsulates object creation logic in one place.

**Code to Run:**
```bash
javac classes/*.java
javac MobileFactory.java
java MobileFactory
```

### 2. Prototype Pattern
The Prototype Pattern is used to create new objects by copying an existing object, known as the prototype, which is useful for performance-sensitive applications.

**Code to Run:**
```bash
javac classes/*.java
javac HouseSeller.java
java HouseSeller
```

---

## Structural Design Patterns

### 1. Adapter Pattern
The Adapter Pattern allows incompatible interfaces to work together by converting the interface of a class into another interface expected by clients.

**Code to Run:**
```bash
javac classes/*.java
javac AdapterPatternCalculator.java
java AdapterPatternCalculator
```

### 2. Proxy Pattern
The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. It's often used for lazy initialization, access control, logging, and more.

**Code to Run:**
```bash
javac classes/*.java
javac ProxyClientPatternImpl.java
java ProxyClientPatternImpl
```

---

# Astronaut Daily Schedule Organizer

## Programming Exercise (Located in the `Exercise2` Folder)
This console-based application helps astronauts organize their daily schedules. It allows users to add, remove, and view daily tasks. Each task has a description, start time, end time, and priority level.

### Problem Statement:
The application implements a basic CRUD (Create, Read, Update, Delete) system for managing tasks and schedules efficiently while applying best coding practices.

### Features:
- Add new tasks with validation (e.g., no overlapping tasks).
- Remove tasks.
- View tasks sorted by start time.
- Optional: Edit tasks, mark as completed, filter by priority.
- Handles exceptions gracefully and uses design patterns like Singleton, Factory, and Observer for structure.

### Code to Run:
```bash
javac logger/*.java manager/*.java model/*.java observer/*.java AstronautScheduleApp.java
java AstronautScheduleApp
```
