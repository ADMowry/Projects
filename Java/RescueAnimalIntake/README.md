# Rescue Animal Management System

A Java console application for managing rescue animals through intake, reservation, and availability tracking.

## Project Overview

The Rescue Animal Management System is an object-oriented Java application designed to manage information about animals being trained for rescue service.

The application maintains separate collections of dogs and monkeys while using a shared parent class to represent attributes common to all rescue animals.

Users can interact with the system through a console menu to:

- Add new dogs
- Add new monkeys
- Reserve animals for service
- View animal records
- View animals currently available for service

The project demonstrates Java object-oriented programming concepts including inheritance, encapsulation, classes, objects, collections, constructors, accessors and mutators, and user-driven application logic.

## Features

### Animal Intake

Users can register new dogs and monkeys through the console interface.

Before adding an animal, the system checks the appropriate collection to determine whether an animal with the same name already exists.

Dog records include information such as:

- Name
- Breed
- Gender
- Age
- Weight
- Acquisition date
- Acquisition location
- Training status
- Reservation status
- Service country

Monkey records contain the shared rescue-animal information along with monkey-specific attributes including:

- Species
- Tail length
- Height
- Body length

### Animal Reservation

Users can request either a dog or monkey for a particular service country.

The system searches the appropriate animal collection and reserves an animal when it:

- Matches the requested service country
- Is not currently reserved

When a matching animal is found, its reservation status is updated.

### Animal Availability

The application can identify animals that are:

- Currently in service
- Not already reserved

This provides a filtered view of animals that are potentially available for assignment.

### Animal Records

The system maintains separate collections of `Dog` and `Monkey` objects using Java `ArrayList` collections.

These collections allow the application to add, search, filter, and modify rescue-animal records during program execution.

## Technologies & Concepts

- Java
- Object-Oriented Programming
- Inheritance
- Encapsulation
- Classes and objects
- Constructors
- Accessor and mutator methods
- `ArrayList`
- Enhanced `for` loops
- `Scanner`
- Conditional logic
- Switch statements
- User input
- Record filtering
- Object state management

## Object-Oriented Design

One of the primary focuses of this project is using inheritance to represent related types of rescue animals.

The application uses the following class hierarchy:

```text
              RescueAnimal
              /          \
            Dog         Monkey
```

### `RescueAnimal`

`RescueAnimal` serves as the parent class.

It stores attributes shared by different rescue-animal types, including:

```text
name
animal type
gender
age
weight
acquisition date
acquisition location
training status
reservation status
service country
```

The class provides getter and setter methods for accessing and modifying these private fields.

### `Dog`

`Dog` extends `RescueAnimal`.

Because the common animal information is inherited from `RescueAnimal`, the `Dog` class only needs to introduce information specific to dogs.

In this application, that additional attribute is:

```text
breed
```

The constructor initializes both the inherited rescue-animal information and the dog-specific breed information.

### `Monkey`

`Monkey` also extends `RescueAnimal`.

In addition to the inherited fields, the class contains monkey-specific attributes:

```text
species
tailLength
height
bodyLength
```

The class provides getters and setters for each additional attribute.

This design avoids defining the same common animal properties separately in both the `Dog` and `Monkey` classes.

## Application Workflow

The `Driver` class controls the main application.

When the program starts, sample dog and monkey records are loaded into their respective `ArrayList` collections.

The application then repeatedly displays the following menu:

```text
Rescue Animal System Menu

[1] Intake a new dog
[2] Intake a new monkey
[3] Reserve an animal
[4] Print a list of all dogs
[5] Print a list of all monkeys
[6] Print a list of all animals that are not reserved
[q] Quit application
```

The user's selection is processed using a `switch` statement.

The menu continues to run until the user chooses to quit the application.

## Duplicate Prevention

During animal intake, the program searches the appropriate animal collection before creating a new record.

Animal names are compared without regard to capitalization.

If an animal with the same name already exists, the intake process is stopped and the user is returned to the main menu.

This prevents duplicate animal records from being added accidentally.

## Reservation Logic

The reservation system demonstrates searching and modifying objects stored inside collections.

When a user requests an animal, the application collects:

1. The type of animal requested
2. The country where the animal will serve

The program then searches the corresponding collection.

A matching animal must have the requested service country and must not already be reserved.

When an eligible animal is located, its reservation status is changed to `true`.

## Filtering Animal Records

The application can also filter records according to animal status.

When displaying available animals, the system searches both the dog and monkey collections for animals whose:

```text
trainingStatus = "in service"
reserved = false
```

Only animals meeting both conditions are displayed.

This demonstrates using object attributes as criteria when searching collections.

## Encapsulation

The project uses private fields with public accessor and mutator methods to manage object data.

For example, instead of directly modifying the reservation field, other parts of the program use methods such as:

```java
animal.getReserved();
animal.setReserved(true);
```

This keeps the internal representation of each object separate from the application logic that uses it.
