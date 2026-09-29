package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
// Import for iterator
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

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

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;
		
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

		// If not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// Return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;
		
		// Instantiate iterator to iterate over the list of games
		Iterator<Game> gamesIterator = games.iterator();
		
		// While loop iterates through games list
		while (gamesIterator.hasNext()) {
			Game gameInstance = gamesIterator.next();
			// Return instance if a game has this id
			if (gameInstance.getId() == id) {
				return gameInstance;
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;
		
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

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
