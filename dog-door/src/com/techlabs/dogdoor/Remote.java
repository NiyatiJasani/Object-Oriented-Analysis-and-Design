package com.techlabs.dogdoor;

import java.util.Timer;
import java.util.TimerTask;
import com.techlabs.dogdoor.*;

public class Remote {
	private DogDoor door;

	public Remote(DogDoor door) {
		this.door = door;
	}

	public void pressButton() {
		System.out.println("Pressing the remotecontrol");
		if (door.isOpen()) {
			door.close();// the remote already has code to handle closing
		} else {
			door.open();
			// create a timer to open door, the task is to close dr and turn off
			// timer
			 

		}
	}

}
