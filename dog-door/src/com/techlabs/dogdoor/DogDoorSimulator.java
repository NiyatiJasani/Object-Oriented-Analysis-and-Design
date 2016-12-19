package com.techlabs.dogdoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		// simulates hardware
		System.out.println("Woof");
		System.out.println("\n Fido has gone outside");
		System.out.println("Done");

		try {
			Thread.currentThread().sleep(10000);
			// Causes the currently executing thread to sleep
		} catch (InterruptedException e) {
		}

		System.out.println("But he is stuck outside");
		// Simulate
		System.out.println("Bark");
		recognizer.recognize("Woof");
		System.out.println("\n Fido starts barking");

	}

}
