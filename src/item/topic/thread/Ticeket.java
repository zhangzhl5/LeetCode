package item.topic.thread;

public class Ticeket {
	
	volatile private int ticket = 100;
	
	public synchronized int sealTicket() {
		return ticket = ticket+1;
	}
}
