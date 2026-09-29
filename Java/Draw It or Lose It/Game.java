package com.gamingroom;

import java.util.ArrayList;
//Import for iterator
import java.util.Iterator;
import java.util.List;
/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {
	// Create team list
	private List<Team> teams = new ArrayList<Team>();
	

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name); // Explicit reference to Entity parent
	}
	
	// Add team function uses iterator pattern to add only unique team names
	public Team addTeam(String name) {
		Team team = null;
		
		// Instantiate iterator to iterate over the list of teams
		Iterator<Team> teamsIterator = teams.iterator();
		
		// While loop iterates through teams list
		while (teamsIterator.hasNext()) {
			Team teamInstance = teamsIterator.next();
			
			// If name exists, return team instance
			if (teamInstance.getName().equalsIgnoreCase(name)) {
				team = teamInstance;
			}
			// If name does not exist, add team to list
			else {
				teams.add(team);
			}
		}
		
		return team;
	}


	@Override
	public String toString() {
		
		return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
	}

}
