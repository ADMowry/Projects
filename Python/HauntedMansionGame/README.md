# Haunted Mansion Text Adventure

A command-line text adventure game built in Python where the player explores a haunted mansion, collects items, and attempts to exorcise a ghost before encountering it.

## Project Overview

The Haunted Mansion Text Adventure is an interactive Python game that uses a room-based navigation system. The player begins in the foyer of a haunted mansion and must explore different rooms to collect six items needed to defeat the ghost.

Each room connects to other rooms through directional commands such as `go North` or `go East`. Some rooms contain collectible items, while the Dining Room contains the ghost.

The objective is to collect all six items before entering the Dining Room. Entering the ghost's room too early results in a game over.

## Features

- Eight interconnected rooms to explore
- Direction-based player movement
- Six collectible items
- Inventory tracking
- Win and loss conditions
- Input validation for movement
- Room-specific item tracking
- Items are removed from rooms after collection to prevent duplicate pickups
- Continuous gameplay loop until a win or loss condition is reached

## Technologies

- Python
- Command-line interface
- Python dictionaries and nested dictionaries
- Lists
- Functions
- Conditional statements
- Loops
- String manipulation

## How It Works

The mansion is represented using a nested Python dictionary. Each room contains information about the rooms connected to it and, when applicable, an item located there.

For example:

```python
"Kitchen": {
    "South": "Foyer",
    "East": "Dining Room",
    "item": "Sage Bundle"
}
```

The player's current room determines which directions are valid.

The game maintains an inventory list that stores the items the player collects while exploring the mansion.

During each iteration of the main gameplay loop, the program:

1. Displays the player's current room and inventory.
2. Checks whether the player has collected all six items.
3. Checks whether the player has encountered the ghost.
4. Accepts a movement or item command from the player.
5. Validates the command.
6. Updates the player's location or inventory.
7. Repeats until the player wins or loses.

## Game Commands

Move between rooms:

```text
go North
go South
go East
go West
```

Collect an item:

```text
get Book
```

The player must collect:

- Sage Bundle
- Book
- Cross
- Chalk Stick
- Lighter
- Candle

After collecting all six items, the player has everything needed to exorcise the ghost.
