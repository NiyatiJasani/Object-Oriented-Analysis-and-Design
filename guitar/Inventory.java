package com.tech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.tech.guitar.GuitarSpec;
import com.tech.guitar.Guitars;
import com.tech.guitar.Instrument;
import com.tech.guitar.InstrumentSpec;

public class Inventory {
	// New search takes a Guitarspec instead of an entire object
	private List inventory;

	public Inventory() {
		inventory = new LinkedList();
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument = new Instrument(serialNumber, price, spec);
		inventory.add(instrument);
	}

	public Instrument get(String serialNumber) {
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}

		}
		return null;

	}

	public List search(InstrumentSpec searchSpec) {
		List matchingInstruments = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSpec().matches(searchSpec)) {
				matchingInstruments.add(instrument);
			}
		}
		return matchingInstruments;
	}
}
