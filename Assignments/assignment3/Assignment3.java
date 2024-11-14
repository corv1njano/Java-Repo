package de.hs_kl.oo.assignment.assignment3;

import de.hs_kl.oo.assignment.assignment3.animals.Cow;
import de.hs_kl.oo.assignment.assignment3.animals.Pig;

public class Assignment3 {

	public static void main(String[] args) {
		// Kuehe und Schweine erstellen
		Cow cow1 = new Cow(2, "Berta");
		Cow cow2 = new Cow(4, "Matilda");
		Cow cow3 = new Cow(5, "Erina");
		Cow cow4 = new Cow(7, "Sabine");

		Pig pig1 = new Pig(4, "Thorfinn");
		Pig pig2 = new Pig(6, "Thorsten");
		Pig pig3 = new Pig(9, "Janosch");
		Pig pig4 = new Pig(3, "Killian");

		// neue Farm erstellen
		Farm myFarm = new Farm("Kuh-ler Bauernhof");

		// Staelle erstellen
		Stable cowStable = new Stable("cow");
		Stable pigStable = new Stable("pig");

		// Kuehe und Schweine zu Stall hinzufuegen
		cowStable.cows.add(cow1);
		cowStable.cows.add(cow2);
		cowStable.cows.add(cow3);
		cowStable.cows.add(cow4);

		pigStable.pigs.add(pig1);
		pigStable.pigs.add(pig2);
		pigStable.pigs.add(pig3);
		pigStable.pigs.add(pig4);

		// Staelle der Farm hinzuuegen
		myFarm.stables.add(cowStable);
		myFarm.stables.add(pigStable);

		// Scheunen erstellen
		Barn barn1 = new Barn("wheat", 3);
		Barn barn2 = new Barn("oats", 1);
		Barn barn3 = new Barn("hay", 4);

		// Scheune der Farm hinzufuegen
		myFarm.barns.add(barn1);
		myFarm.barns.add(barn2);
		myFarm.barns.add(barn3);

		// Farmer erstellen
		Farmer farmer1 = new Farmer("Joe", "Cotton Eye", 2, 45, cow2);
		Farmer farmer2 = new Farmer("Marie", "Wein", 1, 42, cow3);

		// Farmer der Farm hinzufuegen
		myFarm.farmers.add(farmer1);
		myFarm.farmers.add(farmer2);

		/*
		 * da Mooing nicht static ist, muss die Methode über eine Instanz der Klasse Cow
		 * aufgerufen werden, in dem Fall über die cowStable-Instanz
		 */
		cowStable.Mooing();
	}
}
