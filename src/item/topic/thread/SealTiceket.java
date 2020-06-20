package item.topic.thread;

import java.util.concurrent.Callable;

public class SealTiceket implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		Ticeket t = new Ticeket();
		return t.sealTicket();
	}

}
