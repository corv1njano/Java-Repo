package de.hs_kl.oo.assignment.assignment3;

import java.util.ArrayList;

public class Farm {
	final String name;
	ArrayList<Stable> stables = new ArrayList<>();
	ArrayList<Barn> barns = new ArrayList<>();
	ArrayList<Farmer> farmers = new ArrayList<>();

	public Farm(String name) {
		this.name = name;
	}
}
