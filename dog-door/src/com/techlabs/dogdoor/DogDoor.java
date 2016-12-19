package com.techlabs.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The dog door opens");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				close();
				timer.cancel();
			}
		}, 5000);

	}

	public void close() {
		System.out.println("The doog door closes");
		open = false;
	}

	// returns state of door whether open or closed
	public boolean isOpen() {
		return open;
	}

}
