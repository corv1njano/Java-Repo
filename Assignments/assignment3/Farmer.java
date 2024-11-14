package de.hs_kl.oo.assignment.assignment3;

import de.hs_kl.oo.assignment.assignment3.animals.Cow;

public class Farmer {
	final String firstName;
	final String secondName;
	final int sex;
	int age;
	Cow favouriteCow;

	public Farmer(String firstName, String secondName, int sex, int age, Cow favouriteCow) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.sex = sex;
		this.age = age;
		this.favouriteCow = favouriteCow;
	}
}
