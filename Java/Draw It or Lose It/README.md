# Draw It or Lose It
## Phase 1 - Finish missing code
I added the missing pieces to update the class to follow the singleton pattern. This ensures there is only one instance of GameService. There is also a function that can be called to retrieve the instance. 

```
	// Creates private object
	private static GameService gameInstance = null;
	
	// Private constructor so the class cannot be instantiated
	private GameService() {
	}
	
	// Public method to return the only available object
	public static GameService getInstance() {
		// Create instance if none exists
		if (gameInstance == null) {
			gameInstance = new GameService();
		}
		return gameInstance;
	}
```
I used the iterator to loop through the games list, looking to see if a game with that name already exists. If not, it is added to the list of games. It is used for the add game and get game function, and was also created to search for id as well. 

```
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		
		// Instantiate iterator to iterate over the list of games
		Iterator<Game> gamesIterator = games.iterator();
		
		// While loop iterates through games list
		while (gamesIterator.hasNext()) {
			Game gameInstance = gamesIterator.next();
			// Return instance if a game has this name
			if (gameInstance.getName().equalsIgnoreCase(name)) {
				return gameInstance;
			}
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}
```
I then added the reference to the singleton instance in the program driver and singleton tester so that those instances could be pulled. 

```
	// FIXME: obtain reference to the singleton instance
	GameService service = GameService.getInstance(); // Null was replaced with the function to get the instance
```

## Phase 2 - Implement Entity class and refactor
I created the Entity class for Game, Player, and Team to inherit and refactored to reduce duplicate code.

```
public class Entity {
	private long id;
	private String name;
	
	// Private constructor so the class cannot be instantiated
	private Entity(){
	}
	
	// Public constructor for child classes to call
	public Entity(long id, String name) {
		this(); // Call default constructor
		this.id = id;
		this.name = name;
	}
	
	// Access id
	public long getId() {
		return id;
	}
	
	// Access name
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
}
```

```
public class Player extends Entity {
	
	/*
	 * Constructor with an identifier and name
	 */
	public Player(long id, String name) {
		super(id, name); // Explicit reference to Entity parent
	}


	@Override
	public String toString() {
		return "Player [id=" + super.getId() + ", name=" + super.getId() + "]";
	}
}
```
