package com.gamingroom;

import java.util.ArrayList;
//Import for iterator
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {
	// Create player list
	private List<Player> players = new ArrayList<Player>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name); // Explicit reference to Entity parent
	}
	
	// Add player function uses iterator pattern to add only unique player names
	public Player addPlayer(String name) {
		Player player = null;
		
		// Instantiate iterator to iterate over the list of players
		Iterator<Player> playersIterator = players.iterator();
		
		// While loop iterates through players list
		while (playersIterator.hasNext()) {
			Player playerInstance = playersIterator.next();
			
			// If name exists, return player instance
			if (playerInstance.getName().equalsIgnoreCase(name)) {
				player = playerInstance;
			}
			// If name does not exist, add player to list
			else {
				players.add(player);
			}
		}
		
		return player;
	}


	@Override
	public String toString() {
		return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
}
