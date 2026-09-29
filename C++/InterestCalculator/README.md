# Investment Growth Calculator

A C++ console application that calculates and compares long-term investment growth with and without recurring monthly contributions.

## Project Overview

The Investment Growth Calculator allows users to explore how compound interest and recurring monthly deposits can affect an investment over time.

Users provide an initial investment amount, monthly contribution, annual interest rate, and investment period. The application then calculates two investment scenarios:

1. Growth of the initial investment without additional monthly deposits
2. Growth of the investment with recurring monthly deposits

Results are displayed annually, including the ending account balance and total interest earned during each year.

This project demonstrates object-oriented programming, compound-interest calculations, input validation, nested loops, formatted console output, and separation of program responsibilities using C++ classes.

## Features

- Accepts a user-defined initial investment amount
- Accepts recurring monthly contribution amounts
- Supports custom annual interest rates
- Supports user-defined investment periods
- Calculates monthly compound interest
- Displays annual investment balances
- Tracks interest earned during each year
- Compares investment growth with and without monthly contributions
- Validates numerical user input
- Allows multiple investment scenarios to be calculated during a single session
- Formats financial values to two decimal places

## Technologies & Concepts

- C++
- Object-Oriented Programming
- Classes and methods
- Header and implementation files
- Compound-interest calculations
- Nested loops
- Input validation
- Console input/output
- Data formatting with `iomanip`
- Conditional logic
- Reusable functions

## Program Structure

The application separates its functionality across three primary source files.

### `main.cpp`

Controls user interaction and the overall application workflow.

The program collects:

- Initial investment amount
- Monthly deposit
- Annual interest rate
- Number of investment years

Each numerical input is validated before the application continues.

After collecting the investment parameters, `main()` calls the appropriate `BankingApp` methods and displays separate reports for investments with and without recurring monthly deposits.

The user can then choose to perform another calculation without restarting the program.

### `BankingApp.h`

Defines the `BankingApp` class and its interface.

The class provides methods for:

- Calculating investment growth without monthly deposits
- Calculating investment growth with monthly deposits
- Displaying annual investment results
- Generating repeated characters for formatted console output

### `BankingApp.cpp`

Implements the financial calculations and display functionality used by the application.

The two primary calculation methods are:

`balanceWithoutMonthlyDeposit()`

Calculates compound interest on the initial investment without adding additional contributions.

`balanceWithMonthlyDeposit()`

Calculates compound interest while also adding the user's recurring monthly contribution.

Both methods process the investment month by month and report the resulting balance and interest earned at the end of each year.

## How It Works

The application first converts the annual percentage rate supplied by the user into a monthly interest rate:

```text
monthly interest rate = (annual interest rate / 100) / 12
```

The investment is then processed monthly.

For the scenario without additional deposits, the application calculates interest based on the current balance and adds that interest to the investment.

Conceptually:

```text
monthly interest = current balance × monthly interest rate

new balance = current balance + monthly interest
```

For the scenario containing recurring contributions, the monthly deposit is also added to the investment:

```text
new balance = current balance + monthly deposit + monthly interest
```

The application repeats these calculations for each month of the investment period.

At the end of each year, it displays:

```text
Year    Year End Balance    Year End Earned Interest
```

This allows the user to see how the investment grows over time and how recurring contributions affect long-term results.

## Object-Oriented Design

The application uses a `BankingApp` class to separate investment calculations from the primary user interface.

Rather than placing the entire program inside `main()`, calculation and formatting responsibilities are handled by reusable class methods.

For example:

```cpp
balanceWithoutMonthlyDeposit(...)
balanceWithMonthlyDeposit(...)
printDetails(...)
nCharString(...)
```

This helped reinforce the concept of dividing a program into smaller components with specific responsibilities.

## Input Validation

The application validates numerical input using the state of `cin`.

If the user enters an invalid value, such as text when a number is expected, the program:

1. Detects the failed input
2. Displays an error message
3. Clears the error state
4. Removes invalid input from the stream
5. Prompts the user again

This prevents invalid input from immediately terminating or disrupting the application.

## Financial Output Formatting

Investment balances and earned interest are displayed using fixed-point notation with two decimal places.

This produces output appropriate for financial values and improves the readability of the annual investment reports.
