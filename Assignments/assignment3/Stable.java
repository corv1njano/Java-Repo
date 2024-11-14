package de.hs_kl.oo.assignment.assignment3;

import java.util.ArrayList;

import de.hs_kl.oo.assignment.assignment3.animals.Cow;
import de.hs_kl.oo.assignment.assignment3.animals.Pig;

public class Stable {
	final String type;
	// das muss static sein, sonst geht es nicht
	public ArrayList<Cow> cows = new ArrayList<>();
	public ArrayList<Pig> pigs = new ArrayList<>();

	public Stable(String type) {
		this.type = type;
	}

	public void Mooing() {
		for (Cow cow : cows) {
			Cow.Moo();
		}
	}
}
