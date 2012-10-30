package edu.plymouth.techdev.engine.entities;

import java.util.ArrayList;

import edu.plymouth.techdev.engine.components.Component;
import edu.plymouth.techdev.engine.messages.Message;

public abstract class Entity {
	private String id;
	ArrayList<Component> components;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void addComponent(Component component) {
		this.components.add(component);
	}
	public void removeComponent(Component component) {
		this.components.remove(component);
	}
	
	public abstract void updateState(Message message);
}
