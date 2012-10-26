package edu.plymouth.techdev.engine.entities;

import java.util.ArrayList;

import edu.plymouth.techdev.engine.components.Component;

public abstract class Entity {
	private String id;
	ArrayList<Component> components;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
