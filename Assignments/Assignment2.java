package de.hs_kl.oo.assignment;

import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) {

		// Aufgabe 1
		int result = 0;

		for (int i = -10; i <= 70; i++) {
			if (i % 4 == 0) {
				result += i * i;
			}
		}

		// Aufgabe 2
		final int[] inNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] reversedArray = reverseArray(inNumbers);

		// Aufgabe 3
		ArrayList<String> dogNames = new ArrayList<String>();
		dogNames.add("Buddy");
		dogNames.add("Charly");
		dogNames.add("Sammy");
		dogNames.add("Beethoven");

		ArrayList<String> catNames = new ArrayList<String>();
		catNames.add("Luna");
		catNames.add("Mala");
		catNames.add("Lucy");
		catNames.add("Mia");
		catNames.add("Mimi");

		ArrayList<String> newList = new ArrayList<String>();
		newList = getPetNames(dogNames, catNames);
	}

	public static int[] reverseArray(int[] arr) {
		int[] reversedArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			reversedArray[i] = arr[arr.length - 1 - i];
		}

		return reversedArray;
	}

	public static ArrayList<String> getPetNames(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> newList = new ArrayList<String>();

		for (String name : list1) {
			if (name.startsWith("B")) {
				newList.add(name);
			}
		}

		for (String name : list2) {
			if (name.startsWith("M")) {
				newList.add(name);
			}
		}

		return newList;
	}

}