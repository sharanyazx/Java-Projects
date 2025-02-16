# Java Project

This repository contains two Java projects that demonstrate core Object-Oriented Programming (OOP) concepts such as **Encapsulation**, **Inheritance**, **Abstraction**, and **Polymorphism**.

## Overview

### 1. Bank Account System
A simple Java application that simulates basic bank account operations. It uses an abstract class to hide functionality and a subclass to implement specific account behavior.

#### Key Features:
- **Encapsulation:** Uses private fields for account details (e.g., account holder name and balance) with public getters and setters.
- **Abstraction:** The abstract `BankAccount` class provides a blueprint for bank account operations.
- **Inheritance:** `SavingsAccount` extends `BankAccount` to implement the abstract methods.
- **Polymorphism:** A `BankAccount` reference is used to hold a `SavingsAccount` object, allowing flexible use of various account types.

#### Functionality:
- Deposit funds.
- Withdraw funds.
- Display account details.
- Show current balance.

---

### 2. Railway Reservation System
A Java application that simulates a train booking process using an abstract class to define common train functionality. It demonstrates how to manage bookings and cancellations.

#### Key Features:
- **Encapsulation:** Private fields to secure train and passenger details.
- **Abstraction:** The abstract `Train` class hides implementation details and provides a contract for train operations.
- **Inheritance:** Concrete classes (e.g., `ExpressTrain`) extend `Train` to provide specific details.
- **Polymorphism:** A `Train` reference is used to handle different train types, allowing for flexible design.

#### Functionality:
- Display train details.
- Book a seat on a train.
- Cancel an existing booking.
- Manage passenger details associated with the booking.

---

## Project Structure

```plaintext
.
├── BankAccountSystem
│   ├── BankAccount.java
│   ├── SavingsAccount.java
│   └── Main.java
└── RailwayReservationSystem
    ├── Train.java         // Abstract class defining train functionality
    ├── ExpressTrain.java  // Subclass implementing train details
    ├── Passenger.java     // Passenger details and booking methods
    └── Main.java          // Main application to run the reservation system
