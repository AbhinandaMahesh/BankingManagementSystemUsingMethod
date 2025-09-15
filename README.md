# BankingManagementSystemUsingMethod
# ATM Simulation in Java

A simple console-based ATM (Automated Teller Machine) simulation program written in Java that demonstrates basic banking operations including cash deposits, cheque deposits, and withdrawals.

## Features

- **Account Creation**: Generates a random account number upon startup
- **Cash Deposits**: Deposit money directly using cash
- **Cheque Deposits**: Deposit money via cheque with cheque number tracking
- **Withdrawals**: Withdraw money with balance validation
- **Balance Inquiry**: Check current account balance
- **User-Friendly Menu**: Interactive console interface

## How to Use

1. **Compile the Program**:
   ```bash
   javac project.java
   ```

2. **Run the Program**:
   ```bash
   java project
   ```

3. **Menu Options**:
   - **Option 1**: Deposit cash - Enter the amount to deposit
   - **Option 2**: Deposit cheque - Enter amount and cheque number
   - **Option 3**: Withdraw - Enter amount to withdraw (validates sufficient balance)
   - **Option 4**: Check current balance
   - **Option 5**: Exit the program

## Code Structure

- **Main Class**: `project`
- **Methods**:
  - `deposit(double balance, double amount)`: Handles cash deposits
  - `deposit(double balance, double amount, String cheqno)`: Handles cheque deposits (method overloading)
  - `withdraw(double balance, double amount)`: Handles withdrawals with balance validation
  - `main(String[] args)`: Main program with user interface

## Default Settings

- **Account Holder Name**: Abhinanda
- **Initial Balance**: $1000.00
- **Account Number**: Randomly generated 5-digit number

## Requirements

- Java Development Kit (JDK) 8 or higher
- Any Java-compatible IDE or command line tool

## Notes

- The program uses method overloading to handle different types of deposits
- Withdrawal function includes basic validation to prevent overdrafts
- All transactions are processed in the console interface
- No persistent data storage - account resets when program restarts

## Example Usage

```
Welcome Abhinanda
your account number: 45267
==== My ATM ====
1. Deposit cash
2. Deposit cheque
3. WithDraw
4. Check Balance
5. Exit
Enter your choice: 
```

This project demonstrates fundamental Java concepts including methods, method overloading, conditional statements, loops, and basic user input handling.
