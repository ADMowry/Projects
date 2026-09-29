package com.gamingroom;

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
