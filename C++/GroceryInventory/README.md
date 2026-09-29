# Corner Grocery Item Tracker

A C++ console application that analyzes grocery purchase records and provides users with several ways to view item-purchasing frequency.

## Project Overview

The Corner Grocery Item Tracker was developed to analyze a collection of grocery purchase records stored in an external text file. The application reads the purchase data, calculates how frequently individual products occur, and allows the user to interact with the results through a menu-driven interface.

The project demonstrates fundamental C++ programming concepts including object-oriented programming, file input/output, vectors, loops, functions, input validation, and data processing.

## Features

The application provides four primary menu options:

1. **Search for an Item**  
   Enter the name of a grocery item to determine how many times it appears in the purchase records.

2. **Display All Item Frequencies**  
   View each unique grocery item along with the number of times it was purchased.

3. **Display a Purchase Histogram**  
   View a text-based histogram where asterisks visually represent the purchase frequency of each item.

4. **Exit the Application**  
   Safely close the program.

The program also automatically generates a `frequency.dat` backup file containing each unique grocery item and its calculated frequency.

## Technologies & Concepts

- C++
- Object-Oriented Programming
- Classes and methods
- Vectors
- File input/output
- Loops and conditional logic
- Switch statements
- User input validation
- Data processing
- Text-based data visualization

## Program Structure

The project separates the application into multiple files to organize responsibilities.

### `main.cpp`

Controls the primary application workflow. It:

- Reads grocery purchase records from the input file
- Stores those records in a vector
- Creates the grocery-tracking object
- Generates the backup frequency file
- Displays the application menu
- Validates user input
- Routes menu selections to the appropriate functionality

### `grocery.h`

Defines the `Grocery` class and declares the methods responsible for processing and displaying grocery data.

### `grocery.cpp`

Contains the implementation of the `Grocery` class, including:

- `itemFrequency()` — calculates how many times a particular item occurs
- `allItemFrequencies()` — displays each unique item and its purchase frequency
- `itemHistogram()` — creates a visual histogram using asterisks
- `createBackupFile()` — writes calculated frequencies to `frequency.dat`
- `nCharString()` — generates repeated characters for formatting and histogram output

## How It Works

When the program starts, it opens the grocery purchase data file and reads each item into a vector.

The application then processes the stored data as needed based on the user's menu selection. When calculating frequencies, the program iterates through the purchase records and counts occurrences of the requested item.

For operations involving every grocery item, the application keeps track of items that have already been processed. This prevents duplicate entries from appearing in the frequency report or histogram.

For example, the histogram converts an item's calculated purchase frequency into a corresponding number of asterisks:

```text
Broccoli ******
Cucumbers *********
Garlic ********
```

This provides a simple visual representation of purchasing patterns directly within the console.

## Input Validation

The menu includes input validation to prevent non-numeric input from causing the application to fail. Invalid menu selections are also handled separately, allowing the application to continue running until the user chooses to exit.

## File Handling

The project demonstrates both reading from and writing to external files.

The original grocery purchase records are loaded from:

```text
CS210_Project_Three_Input_File.txt
```

The application then generates:

```text
frequency.dat
```

This file stores each unique grocery item along with its calculated purchase frequency, providing a persistent backup of the processed results.
