package de.hs_kl.oo.assignment;

public class Assignment1 {

	public static void main(String[] args) {

		int numDogs = 10;
		int numCats = 9;
		int numCows = 50;
		int numPigs = 50;

		final int sumPets = numDogs + numCats;
		final int sumAnimals = numCows + numPigs;
		final int totalSum = sumPets + sumAnimals;

		if (sumPets >= sumAnimals) {
			numCows *= 2;
			numPigs *= 2;

		} else if (sumPets < sumAnimals && numDogs > numCats) {
			final int difference = numDogs - numCats;
			numDogs -= difference;
		}

		final int changeNumAnimals = computeNumAnimals(numDogs, numCats, numCows, numPigs, totalSum);
	}

	private static int computeNumAnimals(int numDogs, int numCats, int numCows, int numPigs, int totalSum) {
		final int newSum = numDogs + numCats + numCows + numPigs;
		final int difference = newSum - totalSum;
		return difference;
	}

}