# Alice Mowry

# The dictionary links a room to other rooms, and identifies the items in each room. Also calls out villain.
rooms = {
    "Foyer": {"North": "Kitchen", "South": "Living Room", "East": "Master Bedroom", "West": "Study"},
    "Kitchen": {"South": "Foyer", "East": "Dining Room", "item": "Sage Bundle"},
    "Dining Room": {"West": "Kitchen", "item": "Ghost"},  # villain
    "Study": {"East": "Foyer", "item": "Book"},
    "Living Room": {"North": "Foyer", "East": "Kids Room", "item": "Cross"},
    "Kids Room": {"West": "Living Room", "item": "Chalk Stick"},
    "Master Bedroom": {"West": "Foyer", "North": "Bathroom", "item": "Lighter"},
    "Bathroom": {"South": "Master Bedroom", "item": "Candle"}
}

# Empty list to hold inventory as player collects items.
inventory = []

# Print main menu and command options.
def show_instructions():
    print("Haunted Mansion Text Adventure Game")
    print()
    print("Collect 6 items to win the game, or become possessed by the ghost.")
    print("Move commands: go South, go North, go East, go West")
    print("Add to Inventory: get 'item name'")

# Print room information and inventory.
def player_status():
    print("-" * 27)
    print(f"You are in the {current_room}")
    print(f"Inventory: {inventory}")
    if "item" in rooms[current_room]:
        print(f"You see a {rooms[current_room]["item"]}")

#Gameplay loop
def main():
    show_instructions()
    # Set global variable so all functions can access it.
    global current_room
    # Start player in the Foyer.
    current_room = "Foyer"
    # Set a loop to run with specific ways to exit the loop.
    while True:
        player_status()
        # Player wins when all six items are added to inventory, ends loop.
        if len(inventory) == 6:
            print("Congratulations! You have collected all items and exorcised the ghost!")
            break
        # Player loses when they encounter the ghost before gathering items, ends loop.
        if current_room == "Dining Room":
            print("BOO! GAME OVER!")
            break

        command = input("Enter your move:\n")
        # Split the command entered by player and capitalize second word to ensure correct validation of input.
        direction = command.split(" ")[1].capitalize()
        item = command.split(" ")[1].capitalize()
        # Branch for direction commands.
        if "go" in command:
            # Validate direction for current room and move player.
            if direction in rooms[current_room]:
                current_room = rooms[current_room][direction]
            else:
                print("You can't go that way!")
        # Branch for item commands.
        elif "get" in command:
            # Get function validates item in the room and avoids error when no items exist to check against.
            if rooms.get(current_room).get("item"):
                inventory.append(item)
                print(f"{item} retrieved!")
                # Delete removes item so player cannot add the same item multiple times.
                del rooms[current_room]["item"]
            else:
                print(f"Can't get {item}!")
        else:
            print("Invalid move!")


main()
print("Thank you for playing! Goodbye!")
