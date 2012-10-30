package edu.plymouth.techdev.engine.components;

import edu.plymouth.techdev.engine.entities.Entity;
import edu.plymouth.techdev.engine.messages.Message;

public abstract class Component {
	Entity owner;
	
	public abstract void update();
	
	public abstract void handleMessage(Message message);
}
