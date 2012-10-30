
public abstract class Component {
	Entity owner;
	
	public abstract void update();
	
	public abstract void handleMessage(Message message);
}
